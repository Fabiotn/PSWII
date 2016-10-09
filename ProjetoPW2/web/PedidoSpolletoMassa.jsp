<%-- 
    Document   : PedidoSpolletoMassa
    Created on : 27/09/2016, 10:05:11
    Author     : ASUS
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
            <p>Pedido Spolleto - Escolha uma Massa</p>
            
            <a href="PedidoSpolletoMassa?massaForm=caracol" target="_self">Caracol</a><br>
            <a href="PedidoSpolletoMassa?massaForm=concha" target="_self">Concha</a><br>
            <a href="PedidoSpolletoMassa?massaForm=espiral" target="_self">Espiral</a><br>
            <a href="PedidoSpolletoMassa?massaForm=fusilli" target="_self">Fusilli</a><br>
            <a href="PedidoSpolletoMassa?massaForm=gravatinha" target="_self">Gravatinha</a><br>
            <a href="PedidoSpolletoMassa?massaForm=nhoque" target="_self">Nhoque</a><br>        
            <a href="PedidoSpolletoMassa?massaForm=penne" target="_self">Penne</a><br><br>
            
            <input class="bts2" type="button" value="Voltar" onClick="this.form.action='index.html';this.form.submit()">
        </form>
    </body>
</html>
