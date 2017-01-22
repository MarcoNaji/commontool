<%-- 
    Document   : test
    Created on : Aug 26, 2016, 6:41:22 PM
    Author     : amar_
--%>

<%@ page import="java.io.IOException" %>
<%@ page import="javax.servlet.ServletException" %>
<%@ page import="javax.servlet.http.HttpServlet" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="java.io.File" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Set" %>
<%@ page import="org.semanticweb.owlapi.apibinding.OWLManager" %>
<%@ page import="org.semanticweb.owlapi.model.OWLAnnotation" %>
<%@ page import="org.semanticweb.owlapi.model.OWLDataFactory" %>
<%@ page import="org.semanticweb.owlapi.model.OWLOntology" %>
<%@ page import="org.semanticweb.owlapi.model.OWLOntologyManager" %>
<%@ page import="org.semanticweb.owlapi.model.OWLClass" %>
<%@ page import="org.semanticweb.owlapi.model.OWLClassExpression" %>
<%@ page import="org.semanticweb.owlapi.model.OWLDataProperty" %>
<%@ page import="org.semanticweb.owlapi.model.OWLDataPropertyExpression" %>
<%@ page import="org.semanticweb.owlapi.model.OWLIndividual" %>
<%@ page import="org.semanticweb.owlapi.model.OWLLiteral" %>
<%@ page import="org.semanticweb.owlapi.model.OWLNamedIndividual" %>
<%@ page import="org.semanticweb.owlapi.model.OWLObjectProperty" %>
<%@ page import="org.semanticweb.owlapi.model.OWLObjectPropertyExpression" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><c:forEach items="${inddata}" var="inobject"><c:out value="${inobject.value}"/></c:forEach></h1>
    </body>
</html>
