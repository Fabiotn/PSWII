<%-- 
    Document   : IncluirPontoColeta
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
        <form action="IncluirPontoColeta"  method="post" accept-charset="UTF-8">
            <h1>Formulário para treinamento - WEB II</h1>
            <p>Incluir Ponto de Coleta - Preencha o formulário a seguir:</p>
            
            <label class="">Nome:</label><br> 
            <input id="idNomeForm" type="text" name="sNomeForm" size="40" maxlength="100" placeholder="Nome do Ponto de Coleta"><br>
            
            <label class="">Nome Abreviado:</label><br> 
            <input id="idNomeAbrvForm" type="text" name="sNomeAbrvForm" size="40" maxlength="10" placeholder="Nome Abreviado do Ponto de Coleta"><br>
            
            <label class="">Endereço Físico:</label><br>
            <input id="idEndFisicoForm" type="text" name="sEndFisicoForm" size="40" maxlength="255" placeholder="Endereço Físico do Ponto de Coleta"><br>

            <label class="">Endereço Lógico:</label><br>
            <input id="idEndLogicoForm" type="text" name="sEndLogicoForm" size="40" maxlength="10" placeholder="Endereço Lógico do Ponto de Coleta"><br>

            <label class="">Latitude:</label><br>
            <input id="idLatitudeForm" type="number" name="nLatitudeForm" size="40" maxlength="40" placeholder="Latitude"><br>
            
            <label class="">Longitude:</label><br>
            <input id="idLogitudeForm" type="number" name="nLongitudeForm" size="40" maxlength="40" placeholder="Longitude"><br>
            
            <br>
            <input class="bts2" type="button" value="Voltar" onClick="this.form.action='index.html';this.form.submit()">
            <button class="bts2" id="idEnviar" type="submit">Enviar</button>
            <button class="bts2" id="idLimpar" type="reset">Limpar</button>					
        </form>
    </body>
</html>
