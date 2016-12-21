<%-- 
    Document   : Cantor
    Created on : 21/11/2016, 08:35:18
    Author     : Odirlei
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
	<title>Cantor - SmartK - Sistema de Gestão do SmartK</title>
        <script type="text/javascript" src="js/Validar.js"></script>
	<meta name="description" content="Sistema de Gestão do SmartK" />

	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<!-- Styles -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style-smartk.css" >
    </head>
    
    <body>
        <c:import url="Cabecalho.jsp"></c:import>   
        
        <div id="breadcrumb" class="dark-primary-color">
            <div class="container">
                <ol class="breadcrumb">
                    <li><a href="index.html" title="Tela Inicial">Home</a></li>
                    <li class="active"><a href="ListaCator.jsp" title="Lista de Cantores">Cantores</a></li>
                    <li class="active"><a href="#" title="Cantor">Cantor</a></li>
		</ol>
            </div>
	</div>
        
        <div id="wrapper" class="wrapper bg-default">
            <header class="bg-light">
                <div class="container">
                    <h1>Cantor</h1>
                    <h2>Edite o cantor selecionado</h2>
                </div>
            </header>
            
            <div class="container">
                <form name="CadastrarCantor" action="CadastrarCantor" method="Get" onsubmit="return validacao();">
                    <div class="form-group">
                        <input type="hidden" class="form-control" name="id" id="genero_id"  value="${param.id}" visible="true"  />
                    </div>
                    <div class="form-group">
                        <label for="cad_nome">Nome:</label>
                        <input type="text" class="form-control" name="nome" id="cad_nome" value="${param.nome}"  />
                    </div>
                    <div>
                        <table>
                            <tr>                                     
                                <c:if test="${empty param.id }">
                                    <td><input type="submit" value="Gravar" name="gravar" class="btn btn-default" /> </td>                                                                                                        
                                </c:if>
                                <c:if test="${param.id > 0 }">
                                    <td><input type="submit" value="Alterar"  name="alterar" class="btn btn-default"/></td> 
                                </c:if>                                    
                            </tr>  
                        </table>                                            
                    </div>
                </form>    
            </div>   
        </div>
        
        <c:import url="Rodape.jsp"></c:import>
    </body>
</html>
