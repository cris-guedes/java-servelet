<%-- 
    Document   : listPlayers
    Created on : 04/04/2022, 23:05:03
    Author     : 55459
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:useBean id="StastiticDAO" scope="application"
             class="Dao.StatisticsDao"/>
<jsp:useBean id="lastResult" scope="application"
             class="Entities.LastResult"/>
<jsp:useBean id="playerLogged" scope="application"
             class="Entities.Player"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            Usuario Ativo: 
            ${playerLogged.name}
        </h1>
        <table>
            <tr>
                <th>Vitorias</th>
                <th>Nome</th>
                <th>Games</th>
                <th>Perdas</th>
                <th>Empates</th>
            </tr>
            <c:forEach items="${StastiticDAO.all}" var="s">
                <tr>
                    <td>${s.wins}</td>
                    <td>${s.onwer}</td>
                    <td>${s.games}</td>
                    <td>${s.loss}</td>
                    <td>${s.ties}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="index.jsp">
            <button> usar outro usuario</button>   
            <a/>
            <a href="jogar.jsp">
                <button> jogar novamente</button>   
                <a/>
                </body>
                </html>
