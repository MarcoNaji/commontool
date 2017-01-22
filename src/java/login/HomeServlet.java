/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.util.HashSet;
import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.AxiomType;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.util.DLExpressivityChecker;

/**
 *
 * @author amar_
 */
public class HomeServlet extends HttpServlet {

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


HashSet<OWLOntology> set = new HashSet<>();
    set.add(ontology);
    DLExpressivityChecker checker = new DLExpressivityChecker(set);




// Named classes referenced by axioms in the ontology.
Integer declare = ontology.getAxiomCount(AxiomType.DECLARATION);

String express = checker.getDescriptionLogicName();

Integer classCount = ontology.getClassesInSignature().size();

Integer objectCount = ontology.getObjectPropertiesInSignature().size();

Integer dataCount = ontology.getDataPropertiesInSignature().size();

Integer indCount = ontology.getIndividualsInSignature().size();

//response.getWriter().println(cls.getIRI().getFragment());
request.setAttribute("ontology", ontology);
request.setAttribute("declare", declare);
request.setAttribute("express", express);
request.setAttribute("classcount", classCount);
request.setAttribute("objectcount", objectCount);
request.setAttribute("datacount", dataCount);
request.setAttribute("indcount", indCount);


//response.getWriter().println(ontclass);
    // Forward to to the JSP file.
    request.getRequestDispatcher("home.jsp").forward(request, response);



       } catch (OWLOntologyCreationException | ServletException | IOException ex) {
           throw new ServletException(ex);
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
