<%-- 
    Document   : home
    Created on : 10 avr. 2022, 16:01:15
    Author     : pc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/application.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <H1>Bonjour servlet back office,<br> OnlineStore, votre boutique multimédia en ligne</H1> <br>
        <%
            String login=(String)session.getAttribute("login");
            if(login!=null){%>
        Bonjour ${sessionScope.login}
        <%
            }
        %>
        <a href="http://localhost:8081/backoffice/logout"> (Déconnexion) </a><br>
        <a href="add-work-form.html"> Ajouter des Ouevres</a><!-- comment -->
        <br>
        <a href="catalogue">Afficher le catalogue des Oeuvres </a>
    </body>
</html>
