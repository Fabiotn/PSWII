<%-- 
    Document   : PedidoSpolletoMolho
    Created on : 08/09/2016, 20:32:59
    Author     : Fábio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <title>Web II</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form method="post" accept-charset="UTF-8">
            <h1>Formulário para treinamento - WEB II</h1>
            <p>Pedido Spolleto - Escolha um Molho</p>
            
            <a href="PedidoSpolletoMolho?molhoForm=bolonhesa" target="_self">Bolonhesa</a><br>
            <a href="PedidoSpolletoMolho?molhoForm=branco" target="_self">Branco</a><br>
            <a href="PedidoSpolletoMolho?molhoForm=4queijos" target="_self">Quatro Queijos</a><br>
            <a href="PedidoSpolletoMolho?molhoForm=carbonara" target="_self">Carbonara</a><br>
            <a href="PedidoSpolletoMolho?molhoForm=pesto" target="_self">Pesto</a><br><br>            
            
            <input class="bts2" type="button" value="Voltar" onClick="this.form.action='index.html';this.form.submit()">
        </form>
    </body>
</html>