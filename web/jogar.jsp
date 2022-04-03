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
    </head>
    <body>
        <h2>Pedra - Papel - Tesoura </h2>
        <h3>Escolha Seu Jogo</h3>
        <form method="Get" action="jogar">
            <div>
                <div>
                   <input type="radio" value="1" name="jogada"/>
                   <img src="pedra_jogador.png" />
                </div>
                <div>
                   <input type="radio" value="1" name="jogada"/>
                   <img src="papel_jogador.png" />
                </div>
                <div>
                   <input type="radio" value="1" name="jogada"/>
                   <img src="tesoura_jogador.png" />
                </div>
            </div>
            <button>Jogar</button>
        </form>
    </body>
</html>
