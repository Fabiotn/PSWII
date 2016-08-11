<%-- 
    Document   : ConsultarCliente
    Created on : 11/08/2016
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
        <form action="ConsultarPontoColeta"  method="post" accept-charset="UTF-8">
            <h1>Formulário para treinamento - WEB II</h1>
            <p>Consultar Ponto de Coleta - Preencha o formulário a seguir:</p>
                        
            <label class="">Ponto de Coleta:</label><br>
            <input id="idIdForm" type="text" name="sIdForm" size="40" maxlength="5" placeholder="Id do Ponto de Coleta"><br>
            
            <br>
            <input class="bts2" type="button" value="Voltar" onClick="this.form.action='index.html';this.form.submit()">
            <button class="bts2" id="idEnviar" type="submit">Enviar</button>
            <button class="bts2" id="idLimpar" type="reset">Limpar</button>					
        </form>
    </body>
</html>
