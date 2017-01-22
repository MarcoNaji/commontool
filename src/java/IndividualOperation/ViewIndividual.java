/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IndividualOperation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.util.Map;
import java.util.Set;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLDataPropertyExpression;
import org.semanticweb.owlapi.model.OWLIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

/**
 *
 * @author amar_
 */
public class ViewIndividual extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
          
          String indName= request.getParameter("name");
          String msgvar= request.getParameter("msgvar");
          
          if(msgvar!=null && !msgvar.isEmpty()){
   String msg = "Process was completed successfully";
   request.setAttribute("msg", msg);
   
             }
          
          /*if(className!=null && !className.isEmpty()){
   String msg = className + " was deleted successfully.";
   request.setAttribute("msg", msg);
   
             }
          */
          //String msg = (String)request.getAttribute("msg");
          //String inputFileName = "C:/Users/amar_/Desktop/CommonTool/src/java/owlOperation/CoMOn-281111.owl";
            // Create an empty in-memory ontology model
            // Get hold of an ontology manager
OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
File file = new File(getServletContext().getRealPath("/").replace("\\build\\web\\", "")+"/web/ontology/common.owl");
// We can also load ontologies from files. Create a file object that points to the local copy
OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
OWLDataFactory factory = manager.getOWLDataFactory();
OWLReasonerFactory reasonerFactory = new StructuralReasonerFactory();

OWLReasonerConfiguration config = new SimpleConfiguration();
OWLReasoner reasoner = reasonerFactory.createReasoner(ontology, config);
//OWLEntityRemover remover = new OWLEntityRemover(manager, Collections.singleton(ontology));
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
OWLNamedIndividual individual = null;
String comment = null;

// Named classes referenced by axioms in the ontology.
//Set <OWLClass> ontclass = ontology.getClassesInSignature();

for (OWLNamedIndividual ind : ontology.getIndividualsInSignature()) {
    if (ind.getIRI().getFragment().equals(indName)){
              
        individual = factory.getOWLNamedIndividual(ind.getIRI());
       
    }
            }


//manager.saveOntology(ontology);
for (OWLAnnotation annotation : individual.getAnnotations(ontology)) {
if (annotation.getValue() instanceof OWLLiteral) {
OWLLiteral val = (OWLLiteral) annotation.getValue();
// look for portuguese labels
comment = val.getLiteral();
}
}

Set <OWLClass> ontclass = ontology.getClassesInSignature();

Set <OWLObjectProperty> ontobject = ontology.getObjectPropertiesInSignature();

Set <OWLDataProperty> ontdata = ontology.getDataPropertiesInSignature();

Set <OWLNamedIndividual> ontindividual = ontology.getIndividualsInSignature();

Set<OWLClassExpression> indType = individual.getTypes(ontology);

Map<OWLObjectPropertyExpression, Set<OWLIndividual>> indObject = individual.getObjectPropertyValues(ontology);

Map<OWLDataPropertyExpression, Set<OWLLiteral>> indData = individual.getDataPropertyValues(ontology);
   

  
       /*       
       for (OWLObjectPropertyExpression property : indObject.keySet())
	{
		
		for (OWLIndividual propertyValue : indObject.get(property))
		{
			response.getWriter().println(propertyValue);
		}
		
	}
       */
                   



request.setAttribute("ontology", ontology);
request.setAttribute("annotation", comment);
request.setAttribute("ontclasses", ontclass);
request.setAttribute("ontobject", ontobject);
request.setAttribute("ontdata", ontdata);
request.setAttribute("ontindividual", ontindividual);
request.setAttribute("ind", individual);
request.setAttribute("indtype", indType);
request.setAttribute("indobject", indObject);
request.setAttribute("inddata", indData);

//response.getWriter().println(superClasses);
    // Forward to to the JSP file.
    request.getRequestDispatcher("viewOWLIndividualDetail.jsp").forward(request, response);


       } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
