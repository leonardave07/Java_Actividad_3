<%-- 
    Document   : triangulo
    Created on : 2 feb 2023, 21:35:03
    Author     : leonardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="calculos.Triangulo"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String n1 = request.getParameter("base");
            String n2 = request.getParameter("altura");
            
            Triangulo t = new Triangulo(n1, n2); 
            t.calcularArea();
            int area = t.getArea();
            
            Triangulo p = new Triangulo(n1, n2);
            p.calcularPerimetro();
            int perimetro = p.getPerimetro();
        %>
        <h1>Actividad 3</h1>
        <h2>Área Triángulo</h2> 
        <%=area%> 
        <h2>Perímetro Triángulo</h2> 
        <%=perimetro%>
    </body>
</html>
