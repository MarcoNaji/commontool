/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPropertyOperation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.util.Set;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLClassExpression;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLObjectPropertyExpression;

/**
 *
 * @author amar_
 */
public class ViewObject extends HttpServlet {

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
          
          String objectName= request.getParameter("name");
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
//OWLEntityRemover remover = new OWLEntityRemover(manager, Collections.singleton(ontology));
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
OWLObjectProperty object = null;
String comment = null;
// Named classes referenced by axioms in the ontology.
//Set <OWLClass> ontclass = ontology.getClassesInSignature();

for (OWLObjectProperty obj : ontology.getObjectPropertiesInSignature()) {
    if (obj.getIRI().getFragment().equals(objectName)){
              
        object = factory.getOWLObjectProperty(obj.getIRI());
       
    }
            }


//manager.saveOntology(ontology);
for (OWLAnnotation annotation : object.getAnnotations(ontology)) {
if (annotation.getValue() instanceof OWLLiteral) {
OWLLiteral val = (OWLLiteral) annotation.getValue();
// look for portuguese labels
comment = val.getLiteral();
}
}

Set <OWLClass> ontclass = ontology.getClassesInSignature();

Set <OWLObjectProperty> ontobject = ontology.getObjectPropertiesInSignature();

Set<OWLObjectPropertyExpression> superProperties = object.getSuperProperties(ontology);

Set<OWLObjectPropertyExpression> subProperties = object.getSubProperties(ontology);

Set<OWLObjectPropertyExpression> disjointProperties = object.getDisjointProperties(ontology);

Set<OWLObjectPropertyExpression> equivalentProperties = object.getEquivalentProperties(ontology);

Set<OWLClassExpression> domain = object.getDomains(ontology);

Set<OWLClassExpression> range = object.getRanges(ontology);

boolean isFun = object.isFunctional(ontology);

boolean isInfun = object.isInverseFunctional(ontology);

boolean isTrans = object.isTransitive(ontology);

boolean isSym = object.isSymmetric(ontology);

boolean isAsym = object.isAsymmetric(ontology);

boolean isRef = object.isReflexive(ontology);

boolean isIrref = object.isIrreflexive(ontology);






request.setAttribute("ontology", ontology);
request.setAttribute("annotation", comment);
request.setAttribute("ontclasses", ontclass);
request.setAttribute("ontobjects", ontobject);
request.setAttribute("object", object);
request.setAttribute("superproperty", superProperties);
request.setAttribute("subproperty", subProperties);
request.setAttribute("disjointproperty", disjointProperties);
request.setAttribute("equivalentproperty", equivalentProperties);
request.setAttribute("domain", domain);
request.setAttribute("range", range);
request.setAttribute("isFun", isFun);
request.setAttribute("isInfun", isInfun);
request.setAttribute("isTrans", isTrans);
request.setAttribute("isSym", isSym);
request.setAttribute("isAsym", isAsym);
request.setAttribute("isRef", isRef);
request.setAttribute("isIrref", isIrref);





//response.getWriter().println(superClasses);
    // Forward to to the JSP file.
    request.getRequestDispatcher("viewOWLObjectDetails.jsp").forward(request, response);




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
