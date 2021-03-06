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
<jsp:useBean id="playerLogged" scope="application"
             class="Entities.Player"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .container-resultado{
                display:flex;
                margin:auto;
                justify-content:center;
                align-items: center;
            }
            .choose{
                margin:20px;
            }

        </style>
    </head>
    <body>
        <h2>Pedra - Papel - Tesoura </h2>
        <h4>Resultado </h4>


        <div class="container-resultado">

            <div class="choose">
                <h3>Sua Jogada</h3>
                <img src="${lastResult.playerChoose}.png" />
            </div>
            <h1>X</h1>
            <div class="choose">
                <h3>Computador</h3>
                <img src="${lastResult.computerChoose}.png" />
            </div>
        </div>
        <div>
            <h3>${lastResult.templateResult}</h3>
        </div>
        <h3>Estatisticas:</h3>
        <div>
            <span>jogos:${StastiticDAO.read(playerLogged).games}</span>
            <span>vitorias:${StastiticDAO.read(playerLogged).wins}</span>
            <span>vitorias do Computador:${StastiticDAO.read(playerLogged).loss}</span>
            <span>empates:${StastiticDAO.read(playerLogged).ties}</span>
        </div>

        <a href="jogar.jsp">
            <button> Jogar Novamente</button>   
            <a/>
            <a href="index.jsp">
                <button> usar Outro Usuario</button>   
                <a/>
                <a href="listPlayers.jsp">
                    <button> ver lista</button>   
                    <a/>

                    </body>
                    </html>
