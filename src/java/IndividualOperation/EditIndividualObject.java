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
import org.semanticweb.owlapi.model.AddAxiom;
import org.semanticweb.owlapi.model.OWLAnnotation;
import org.semanticweb.owlapi.model.OWLAxiom;
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
import org.semanticweb.owlapi.model.RemoveAxiom;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerConfiguration;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import org.semanticweb.owlapi.reasoner.SimpleConfiguration;
import org.semanticweb.owlapi.reasoner.structural.StructuralReasonerFactory;

/**
 *
 * @author amar_
 */
public class EditIndividualObject extends HttpServlet {

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
          String indObject= request.getParameter("object");
          String indIndividual= request.getParameter("individual");
          
          OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
File file = new File(getServletContext().getRealPath("/").replace("\\build\\web\\", "")+"/web/ontology/common.owl");
// We can also load ontologies from files. Create a file object that points to the local copy
OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
OWLDataFactory factory = manager.getOWLDataFactory();
//OWLEntityRemover remover = new OWLEntityRemover(manager, Collections.singleton(ontology));
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
OWLNamedIndividual individual = null;
OWLNamedIndividual assertedindividual = null;
OWLObjectProperty assertedobject = null;

          
          for (OWLNamedIndividual ind : ontology.getIndividualsInSignature()) {
    if (ind.getIRI().getFragment().equals(indName)){
              
        individual = factory.getOWLNamedIndividual(ind.getIRI());
    }
    
    if (ind.getIRI().getFragment().equals(indIndividual)){
              
        assertedindividual = factory.getOWLNamedIndividual(ind.getIRI());
    }
    
            }
          
          for (OWLObjectProperty obj : ontology.getObjectPropertiesInSignature()) {
    if (obj.getIRI().getFragment().equals(indObject)){
              
        assertedobject = factory.getOWLObjectProperty(obj.getIRI());
    }
    
            }
  
          OWLAxiom newaxiom = factory.getOWLObjectPropertyAssertionAxiom(assertedobject, individual, assertedindividual);
          RemoveAxiom delAxiom = new RemoveAxiom(ontology, newaxiom);
          manager.applyChange(delAxiom);
          
          manager.saveOntology(ontology);
          response.sendRedirect(request.getContextPath() + "/ViewIndividual?name="+indName+"&msgvar=msg");



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
          
          String indName= request.getParameter("indName");
          String newObject= request.getParameter("newobject");
          String newIndividual= request.getParameter("newindividual");
          
          OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
File file = new File(getServletContext().getRealPath("/").replace("\\build\\web\\", "")+"/web/ontology/common.owl");
// We can also load ontologies from files. Create a file object that points to the local copy
OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
OWLDataFactory factory = manager.getOWLDataFactory();
//OWLEntityRemover remover = new OWLEntityRemover(manager, Collections.singleton(ontology));
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
OWLNamedIndividual individual = null;
OWLNamedIndividual assertedindividual = null;
OWLObjectProperty assertedobject = null;

          
          for (OWLNamedIndividual ind : ontology.getIndividualsInSignature()) {
    if (ind.getIRI().getFragment().equals(indName)){
              
        individual = factory.getOWLNamedIndividual(ind.getIRI());
    }
    
    if (ind.getIRI().toString().equals(newIndividual)){
              
        assertedindividual = factory.getOWLNamedIndividual(ind.getIRI());
    }
    
            }
          
          for (OWLObjectProperty obj : ontology.getObjectPropertiesInSignature()) {
    if (obj.getIRI().toString().equals(newObject)){
              
        assertedobject = factory.getOWLObjectProperty(obj.getIRI());
    }
    
            }
  
          OWLAxiom newaxiom = factory.getOWLObjectPropertyAssertionAxiom(assertedobject, individual, assertedindividual);
          AddAxiom addAxiom = new AddAxiom(ontology, newaxiom);
          manager.applyChange(addAxiom);
          
          manager.saveOntology(ontology);
          response.sendRedirect(request.getContextPath() + "/ViewIndividual?name="+indName+"&msgvar=msg");



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
