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
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 *
 * @author amar_
 */
public class EditRangeObject extends HttpServlet {

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
          
          String objectName= request.getParameter("name");
          String rangeName= request.getParameter("range");
          
          OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
File file = new File(getServletContext().getRealPath("/").replace("\\build\\web\\", "")+"/web/ontology/common.owl");
// We can also load ontologies from files. Create a file object that points to the local copy
OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
OWLDataFactory factory = manager.getOWLDataFactory();
//OWLEntityRemover remover = new OWLEntityRemover(manager, Collections.singleton(ontology));
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
OWLObjectProperty object = null;
OWLClass rangeclass = null;
          
          for (OWLObjectProperty obj : ontology.getObjectPropertiesInSignature()) {
    if (obj.getIRI().getFragment().equals(objectName)){
              
        object = factory.getOWLObjectProperty(obj.getIRI());
    }
   
            }
          
          for (OWLClass cls : ontology.getClassesInSignature()) {
    
    if (cls.getIRI().getFragment().equals(rangeName)){
              
        rangeclass = factory.getOWLClass(cls.getIRI());
    }
            }
          
          
          OWLAxiom oldaxiom = factory.getOWLObjectPropertyRangeAxiom(object, rangeclass);
          
          RemoveAxiom removeAxiom = new RemoveAxiom(ontology, oldaxiom);
          manager.applyChange(removeAxiom);
          
          
          
          
          manager.saveOntology(ontology);
          response.sendRedirect(request.getContextPath() + "/ViewObject?name="+objectName+"&msgvar=msg");



       } catch (Exception ex) {
            ex.printStackTrace();
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
          
          String objectName= request.getParameter("objectName");
          String newrange= request.getParameter("newrangename");
          
          OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
File file = new File(getServletContext().getRealPath("/").replace("\\build\\web\\", "")+"/web/ontology/common.owl");
// We can also load ontologies from files. Create a file object that points to the local copy
OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
OWLDataFactory factory = manager.getOWLDataFactory();
//OWLEntityRemover remover = new OWLEntityRemover(manager, Collections.singleton(ontology));
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
OWLObjectProperty object = null;
OWLClass newrangeclass = null;

          
          for (OWLObjectProperty obj : ontology.getObjectPropertiesInSignature()) {
    if (obj.getIRI().getFragment().equals(objectName)){
              
        object = factory.getOWLObjectProperty(obj.getIRI());
    }
            }
          
          for (OWLClass cls : ontology.getClassesInSignature()) {
    
    if (cls.getIRI().toString().equals(newrange)){
              
        newrangeclass = factory.getOWLClass(cls.getIRI());
    }
            }
  
          OWLAxiom newaxiom = factory.getOWLObjectPropertyRangeAxiom(object, newrangeclass);
          AddAxiom addAxiom = new AddAxiom(ontology, newaxiom);
          manager.applyChange(addAxiom);
          
          manager.saveOntology(ontology);
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
