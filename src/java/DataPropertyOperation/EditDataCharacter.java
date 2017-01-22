/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataPropertyOperation;

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
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.model.RemoveAxiom;

/**
 *
 * @author amar_
 */
public class EditDataCharacter extends HttpServlet {

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
          
          String dataName= request.getParameter("dataName");
          String functional= request.getParameter("fun");
    
          
          OWLOntologyManager manager = OWLManager.createOWLOntologyManager();
File file = new File(getServletContext().getRealPath("/").replace("\\build\\web\\", "")+"/web/ontology/common.owl");
// We can also load ontologies from files. Create a file object that points to the local copy
OWLOntology ontology = manager.loadOntologyFromOntologyDocument(file);
OWLDataFactory factory = manager.getOWLDataFactory();
//OWLEntityRemover remover = new OWLEntityRemover(manager, Collections.singleton(ontology));
//OWLReasonerFactory reasonerFactory = new PelletReasonerFactory();
assertNotNull(ontology);
OWLDataProperty data = null;

          
          for (OWLDataProperty dat : ontology.getDataPropertiesInSignature()) {
    if (dat.getIRI().getFragment().equals(dataName)){
              
        data = factory.getOWLDataProperty(dat.getIRI());
       
    }
            }
        
          
          if(functional != null){
             
             OWLAxiom newfunaxiom = factory.getOWLFunctionalDataPropertyAxiom(data);
             AddAxiom addFunAxiom = new AddAxiom(ontology, newfunaxiom);
             manager.applyChange(addFunAxiom);
             manager.saveOntology(ontology);
             
         }else{
             
             OWLAxiom funaxiom = factory.getOWLFunctionalDataPropertyAxiom(data);
          
             RemoveAxiom removeFunAxiom = new RemoveAxiom(ontology, funaxiom);
             manager.applyChange(removeFunAxiom);
             manager.saveOntology(ontology);
             
         }
         
         
          response.sendRedirect(request.getContextPath() + "/ViewData?name="+dataName+"&msgvar=msg");



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
