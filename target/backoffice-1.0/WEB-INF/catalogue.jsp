<%-- 
    Document   : catalogue
    Created on : 19 avr. 2022, 12:47:27
    Author     : pc
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

       
        <c:forEach items="${listework}" var="work">
       
            ${work.title}(${work.release})<br>
        </c:forEach>
       