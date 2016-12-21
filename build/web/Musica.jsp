<%-- 
    Document   : Musica
    Created on : 21/11/2016, 09:14:05
    Author     : Odirlei
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <title>Música</title>
        <meta name="description" content="Sistema de Gestão do SmartK" />
        <script type="text/javascript" src="js/Validar.js"></script>
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
                    <li><a href="ListaMusica.jsp" title="Lista de Músicas">Músicas</a></li>
                    <li class="active"><a href="#" title="Música">Música</a></li>
		</ol>
            </div>
	</div>
        
        <div id="wrapper" class="wrapper bg-default">
            <header class="bg-light">
                <div class="container">
                    <h1>Música</h1>
                    <h2>Edite a música selecionada</h2>
                </div>
            </header>
            
            <div class="container">
                <form name="Musica" action="CadastrarUsuario" method="Get" onsubmit="return validarMusica()">
                    <div class="form-group">
                        <label for="musica_id">Id:</label>
                        <input type="text" class="form-control" name="id" id="musica_id"  value=""  />
                    </div>
                    <div class="form-group">
                        <label for="musica_nome">Nome:</label>
                        <input type="text" class="form-control" name="nome" id="musica_nome"  />
                    </div>
                    <div class="form-group">
                        <label for="musica_codigo">Código:</label>
                        <input type="text" class="form-control" name="codigo" id="musica_codigo"  />
                    </div>
                    <div class="form-group">
                        <label for=musica_inicio>Início:</label>
                        <input type="text" class="form-control" name="inicio" id="musica_inicio"  />
                    </div>
                    <div class="form-group">
                        <label for="musica_idioma">Idioma:</label>
                        <input type="text" class="form-control" name="idioma" id="musica_idioma"  />
                    </div>
                    <div class="form-group">
                        <label for="cantor_id">Cantor:</label>
                        <input type="text" class="form-control" name="celular" id="cantor_id"  />
                    </div>
                    <div class="form-group">
                        <label for="genero_id">Genero:</label>
                        <input type="text" class="form-control" name="cidade" id="genero_id"  />
                    </div>
                    
                    <div>
                        <table>
                            <tr>
                                <td><input type="submit" value="Gravar" name="gravar" class="btn btn-default" /> </td>                                                                                                        
                                <td><input type="submit" value="Alterar"  name="alterar" class="btn btn-default"/></td> 
                            </tr>  
                        </table>
                    </div>
                </form>    
            </div>   
        </div>
        
        <c:import url="Rodape.jsp"></c:import>
    </body>
</html>

