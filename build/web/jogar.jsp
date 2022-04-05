<%-- 
    Document   : jogar
    Created on : 03/04/2022, 15:18:31
    Author     : 55459
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .container{
                display:flex;
                margin:auto;
            }
            .container-img{
                display:flex;
                align-items: center;
                justify-content: center;
                margin:20px;
            }
           
        </style>
    </head>
    <body>
        <h2>Pedra - Papel - Tesoura </h2>
        <h3>Escolha Seu Jogo</h3>
        <form method="Get" action="jogada">
            <div class="container">
                <div class="container-img">
                   <input type="radio" value="1" name="jogada"/>
                   <img src="1.png" />
                </div>
                <div class="container-img">
                   <input type="radio" value="2" name="jogada"/>
                   <img src="2.png" />
                </div>
                <div class="container-img">
                   <input type="radio" value="3" name="jogada"/>
                   <img src="3.png" />
                </div>
            </div>
            <button>Jogar</button>
        </form>
    </body>
</html>
