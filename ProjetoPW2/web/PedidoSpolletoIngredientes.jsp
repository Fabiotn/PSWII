<%-- 
    Document   : PedidoSpolletoIngredientes
    Created on : 27/09/2016, 19:48:35
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
        <form action='PedidoSpoletoIngredientes' method="post" accept-charset="UTF-8">
            <h1>Formulário para treinamento - WEB II</h1>
            <p>Pedido Spolleto - Escolha os Ingredientes</p>

            <table bordercolor="black" border=1 style="table-layout: fixed; border-collapse: collapse; width: 300px">
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Cecola"/></td>
                    <td width="90%">Cebola</td>
                </tr>
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Tomate"/></td>
                    <td width="90%">Tomate</td>
                </tr>
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Alho"/></td>
                    <td width="90%">Alho</td>
                </tr>
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Pimentão"/></td>
                    <td width="90%">Pimentão</td>
                </tr>                       
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Pimenta Calabresa"/></td>
                    <td width="90%">Pimenta Calabresa</td>
                </tr>                                               
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Queijo"/></td>
                    <td width="90%">Queijo</td>
                </tr>
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Presunto"/></td>
                    <td width="90%">Presunto</td>
                </tr>
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Bacon"/></td>
                    <td width="90%">Bacon</td>
                </tr>
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Calabresa"/></td>
                    <td width="90%">Calabresa</td>
                </tr>
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Azeitona"/></td>
                    <td width="90%">Azeitona</td>
                </tr>                               
                <tr><td width="10%" align="center"><input type="checkbox" name="itensIngred" value="Azeite"/></td>
                    <td width="90%">Azeite</td>
                </tr>
            </table>
            <br>          
            
            <button type="submit">Enviar</button>            
            <input type="button" value="Voltar" onClick="this.form.action='index.html';this.form.submit()">
        </form>
    </body>
</html>
