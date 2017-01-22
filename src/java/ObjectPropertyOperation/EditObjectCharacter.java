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
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 *
 * @author amar_
 */
public class EditObjectCharacter extends HttpServlet {

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
        try {
          
          String objectName= request.getParameter("objectName");
          String functional= request.getParameter("fun");
          String inverseFunctional= request.getParameter("invfun");
          String transitive= request.getParameter("trans");
          String symmetric= request.getParameter("sym");
          String asymmetric= request.getParameter("asym");
          String reflexive= request.getParameter("ref");
          String irreflexive= request.getParameter("irref");
          
          
          
          
          OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
File file = new File(getServletContext().getRealPath("/").replace("\\build\\web\\", "")+"/web/ontology/common.owl");
// We can also load ontologies from files. Create a file object that points to the local copy
OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
OWLDataFactory factory = manager.getOWLDataFactory();
//OWLEntityRemover remover = new OWLEntityRemover(manager, Collections.singleton(ontology));
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
OWLObjectProperty object = null;

          
          for (OWLObjectProperty obj : ontology.getObjectPropertiesInSignature()) {
    if (obj.getIRI().getFragment().equals(objectName)){
              
        object = factory.getOWLObjectProperty(obj.getIRI());
       
    }
            }
        
          
          if(functional != null){
             
             OWLAxiom newfunaxiom = factory.getOWLFunctionalObjectPropertyAxiom(object);
             AddAxiom addFunAxiom = new AddAxiom(ontology, newfunaxiom);
             manager.applyChange(addFunAxiom);
             manager.saveOntology(ontology);
             
         }else{
             
             OWLAxiom funaxiom = factory.getOWLFunctionalObjectPropertyAxiom(object);
          
             RemoveAxiom removeFunAxiom = new RemoveAxiom(ontology, funaxiom);
             manager.applyChange(removeFunAxiom);
             manager.saveOntology(ontology);
             
         }
         
         if(inverseFunctional != null){
             
             OWLAxiom newinvfunaxiom = factory.getOWLInverseFunctionalObjectPropertyAxiom(object);
             AddAxiom addInvfunAxiom = new AddAxiom(ontology, newinvfunaxiom);
             manager.applyChange(addInvfunAxiom);
             manager.saveOntology(ontology);
             
             
             
         }else{
             
             OWLAxiom invfunaxiom = factory.getOWLInverseFunctionalObjectPropertyAxiom(object);
          
             RemoveAxiom removeInvfunAxiom = new RemoveAxiom(ontology, invfunaxiom);
             manager.applyChange(removeInvfunAxiom);
             manager.saveOntology(ontology);
         }
         
         if(transitive != null){
             
             OWLAxiom newtransaxiom = factory.getOWLTransitiveObjectPropertyAxiom(object);
             AddAxiom addTransAxiom = new AddAxiom(ontology, newtransaxiom);
             manager.applyChange(addTransAxiom);
             manager.saveOntology(ontology);
             
         }else{
             
             OWLAxiom transaxiom = factory.getOWLTransitiveObjectPropertyAxiom(object);
          
             RemoveAxiom removeTransAxiom = new RemoveAxiom(ontology, transaxiom);
             manager.applyChange(removeTransAxiom);
             manager.saveOntology(ontology);
             
         }
         
         if(symmetric != null){
             
             OWLAxiom newsymaxiom = factory.getOWLSymmetricObjectPropertyAxiom(object);
             AddAxiom addSymAxiom = new AddAxiom(ontology, newsymaxiom);
             manager.applyChange(addSymAxiom);
             manager.saveOntology(ontology);
             
         }else{
             
             OWLAxiom symaxiom = factory.getOWLSymmetricObjectPropertyAxiom(object);
          
             RemoveAxiom removeSymAxiom = new RemoveAxiom(ontology, symaxiom);
             manager.applyChange(removeSymAxiom);
             manager.saveOntology(ontology);
             
         }
         
         if(asymmetric != null){
             
             OWLAxiom newasymaxiom = factory.getOWLAsymmetricObjectPropertyAxiom(object);
             AddAxiom addAsymAxiom = new AddAxiom(ontology, newasymaxiom);
             manager.applyChange(addAsymAxiom);
             manager.saveOntology(ontology);
             
         }else{
             
              OWLAxiom asymaxiom = factory.getOWLAsymmetricObjectPropertyAxiom(object);
          
              RemoveAxiom removeAsymAxiom = new RemoveAxiom(ontology, asymaxiom);
              manager.applyChange(removeAsymAxiom);
              manager.saveOntology(ontology);
             
         }
         
         if(reflexive != null){
             
             OWLAxiom newrefaxiom = factory.getOWLReflexiveObjectPropertyAxiom(object);
             AddAxiom addRefAxiom = new AddAxiom(ontology, newrefaxiom);
             manager.applyChange(addRefAxiom);
             manager.saveOntology(ontology);
             
         }else{
             
             OWLAxiom refaxiom = factory.getOWLReflexiveObjectPropertyAxiom(object);
          
             RemoveAxiom removeRefAxiom = new RemoveAxiom(ontology, refaxiom);
             manager.applyChange(removeRefAxiom);
          
             manager.saveOntology(ontology);
             
         }
         
         if(irreflexive != null){
             
             OWLAxiom newirrefaxiom = factory.getOWLIrreflexiveObjectPropertyAxiom(object);
             AddAxiom addIrrefAxiom = new AddAxiom(ontology, newirrefaxiom);
             manager.applyChange(addIrrefAxiom);
             manager.saveOntology(ontology);
             
         }else{
             
             OWLAxiom irrefaxiom = factory.getOWLIrreflexiveObjectPropertyAxiom(object);
          
             RemoveAxiom removeIrrefAxiom = new RemoveAxiom(ontology, irrefaxiom);
             manager.applyChange(removeIrrefAxiom);
          
             manager.saveOntology(ontology);
             
         }
          response.sendRedirect(request.getContextPath() + "/ViewObject?name="+objectName+"&msgvar=msg");



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
