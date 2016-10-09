<%-- 
    Document   : PedidoSpolleto
    Created on : 08/09/2016, 20:32:59
    Author     : Fábio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
            <p>Pedido Spolleto - Escolha uma das opções a seguir para montar o seu pedido</p>

            <a href="PedidoSpolletoMolho.jsp" target="_self">Escolha o seu Molho: (${sessionScope.Pedido.molho})</a>
            <br>                        
            <a href="PedidoSpolletoMassa.jsp" target="_self">Escolha o sua Massa: (${sessionScope.Pedido.massa})</a>
            <br>                        
            <a href="PedidoSpolletoIngredientes.jsp" target="_self">Escolha os seus ingredientes, abaixo serão listados os já escolhidos:</a>
            <p>${sessionScope.Pedido.mensResultPedido}</p>
            
            <table bordercolor="black" border=1 style="table-layout: fixed; border-collapse: collapse; width: 200px">
                <c:forEach items="${sessionScope.Pedido.ingredientes}" var="itens">
                    <tr><td width="100%">${itens}</td></tr>
                </c:forEach>
            </table>
            <br>
            
            <input class="bts2" type="button" value="Voltar" onClick="this.form.action='index.html';this.form.submit()">
        </form>
    </body>
</html>