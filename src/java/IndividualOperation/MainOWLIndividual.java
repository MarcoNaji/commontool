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
import java.util.Set;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

/**
 *
 * @author amar_
 */
public class MainOWLIndividual extends HttpServlet {

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
        try {
          
          String indName= request.getParameter("name");
          String msgvar= request.getParameter("msgvar");
          
          
          if(indName!=null && !indName.isEmpty()){
   String msg = indName + " was deleted successfully.";
   request.setAttribute("msg", msg);
   
             }
          
          
          
          if(msgvar!=null && !msgvar.isEmpty()){
   String msg = "Individual already exist!";
   request.setAttribute("msg2", msg);
   
             }
          //String msg = (String)request.getAttribute("msg");
          //String inputFileName = "C:/Users/amar_/Desktop/CommonTool/src/java/owlOperation/CoMOn-281111.owl";
            // Create an empty in-memory ontology model
            // Get hold of an ontology manager
OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
File file = new File(getServletContext().getRealPath("/").replace("\\build\\web\\", "")+"/web/ontology/common.owl");
// We can also load ontologies from files. Create a file object that points to the local copy
OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
// Named classes referenced by axioms in the ontology.
Set <OWLNamedIndividual> ontind = ontology.getIndividualsInSignature();
//response.getWriter().println(cls.getIRI().getFragment());
request.setAttribute("ontology", ontind);


//response.getWriter().println(ontclass);
    // Forward to to the JSP file.
    request.getRequestDispatcher("view_OWLIndividual.jsp").forward(request, response);



       } catch (OWLOntologyCreationException | ServletException | IOException ex) {
           throw new ServletException(ex);
        }
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
        try {
          
          String indName= request.getParameter("indName").trim();
          String comment= request.getParameter("comment");
          
          indName = indName.replaceAll(" ", "_");
          
          
          
         
          
          OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
File file = new File(getServletContext().getRealPath("/").replace("\\build\\web\\", "")+"/web/ontology/common.owl");
// We can also load ontologies from files. Create a file object that points to the local copy
OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
OWLDataFactory factory = manager.getOWLDataFactory();
//OWLEntityRemover remover = new OWLEntityRemover(manager, Collections.singleton(ontology));
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
IRI ontologyIRI = ontology.getOntologyID().getOntologyIRI();

OWLNamedIndividual o = factory.getOWLNamedIndividual(IRI.create(ontologyIRI+"#"+indName));

OWLAxiom declareO = factory.getOWLDeclarationAxiom(o);

boolean exists = ontology.containsAxiom(declareO);

if(!exists){

manager.addAxiom(ontology, declareO);

if(comment != null && !comment.isEmpty()){
    OWLAnnotation commentAnno = factory.getOWLAnnotation(
factory.getRDFSComment(),
factory.getOWLLiteral(comment, "en"));
    
    OWLAxiom ax = factory.getOWLAnnotationAssertionAxiom(
o.getIRI(), commentAnno);
    manager.addAxiom(ontology, ax);

}
          
          manager.saveOntology(ontology);
          
          response.sendRedirect(request.getContextPath() + "/ViewIndividual?name="+indName+"&msgvar=msg");
}else{
    response.sendRedirect(request.getContextPath() + "/MainOWLData?msgvar=msg");
}
          //



       } catch (Exception ex) {
            ex.printStackTrace();
        }
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
