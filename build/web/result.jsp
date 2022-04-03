<%-- 
    Document   : result
    Created on : 03/04/2022, 16:11:19
    Author     : 55459
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="StastiticDAO" scope="application"
             class="Dao.StatisticsDao"/>

<jsp:useBean id="lastResult" scope="application"
             class="Entities.LastResult"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>${lastResult.computerChoose} </h1>
    </body>
</html>
