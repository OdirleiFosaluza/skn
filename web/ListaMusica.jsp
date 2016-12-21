<%-- 
    Document   : ListaMusica
    Created on : 21/11/2016, 09:07:33
    Author     : Odirlei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="pt-br">
    
    <head>
        <title>Usuários - Smartk - Sistema de Gestão do SmartK</title>
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
                    <li class="active"><a href="#" title="Lista de Músicas">Músicas</a></li>
		</ol>
            </div>
	</div>            
            
        <div id="wrapper" class="wrapper bg-default">
            <header class="bg-light">
                <div class="container">
                    <h1>Músicas</h1>
                    <h2>A Lista de músicas inseridas no SmartK</h2>
                </div>
            </header>
            
            <div class="container listagem-default">
                <jsp:useBean id="dao" class="br.com.smartk.model.MusicaDao"></jsp:useBean>
                
                <a href="Musica.jsp" class="btn btn-default"><span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> Adicionar Novo</a>

                <table class="table  table-bordered table-hover">
                    <tr class="info">
                        <td>Id</td>
                        <td>Código</td>
                        <td>Nome</td>                        
                        <td>Ínicio</td>
                        <td>Idioma</td>
                        <td>Cantor</td>
                        <td>Genero</td>
                        <td>Alterar</td>
                        <td>Remover</td>                                                
                    </tr>    
                    
                    <c:forEach var="musica" items="${dao.lista}">                                                       
                            <td>${musica.id}</td>
                            <td>${musica.codigo}</td>
                            <td>${musica.nome}</td>                                                                                                                                                                                                    
                            <td>${musica.inicio}</td>
                            <td>${musica.idioma}</td>
                            <td>${musica.nomeCantor}</td>>
                            <td>${musica.nomeGenero}</td>>
                            <td><a href="UsuarioNew.jsp?id=${usuario.id}">Alterar</a></td>
                            <td><a href="CadastrarUsuario?id=${usuario.id}&excluir=excluir">Remover</a></td>
                        </tr>
                    </c:forEach>  
                    
                </table>
            </div>   
        </div>        
                   
        <c:import url="Rodape.jsp"></c:import>
        
    </body>

</html>
