<%-- 
    Document   : ListaUsuario
    Created on : 18/11/2016, 15:57:54
    Author     : Odirlei
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html lang="pt-br">
    
    <head>
        <title>Usuários - SmartK - Sistema de Gestão do SmartK</title>
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
                    <li class="active"><a href="#" title="Lista de Usuários">Usuários</a></li>
		</ol>
            </div>
	</div>
        
        <div id="wrapper" class="wrapper bg-default">
            <header class="bg-light">
                <div class="container">
                    <h1>Usuários</h1>
                    <h2>A Lista de usuários inseridos no SmartK</h2>
                </div>
            </header>
            
            <div class="container listagem-default">
                <jsp:useBean id="dao" class="br.com.smartk.model.UsuarioDao"></jsp:useBean>                                                                                                                                

                <a href="UsuarioNew.jsp" class="btn btn-default"><span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> Adicionar Novo</a>

                <table class="table  table-bordered table-hover">
                    <tr class="info">
                        <td>Código</td>
                        <td>Nome</td>
                        <td>Sobrenome</td>
                        <td>Data de Nascimento</td>
                        <td>Login</td>
                        <td>Senha</td>
                        <td>E-mail</td>
                        <td>Celular</td>
                        <%--
                        <td>Uf</td>
                        <td>Cidade</td>                        
                        <td>Facebook</td>                                    
                        --%>
                        <td>Alterar</td>
                        <td>Remover</td>
                    </tr>    

                    <c:forEach var="usuario" items="${dao.lista}">   

                        <tr>
                            <td>${usuario.id}</td>
                            <td>${usuario.nome}</td>                                                                                    
                            <td>${usuario.sobrenome}</td>                                                                                    
                            <td>${usuario.dataNascimento}</td>                                                                                    
                            <td>${usuario.login}</td>                                                                                    
                            <td>${usuario.senha}</td>                                                                                    
                            <td>${usuario.email}</td>                                                                                             
                            <td>${usuario.celular}</td>
                            <%--
                            <td>${usuario.uf}</td>                                                                                    
                            <td>${usuario.cidade}</td>                                                                                                                
                            <td>${usuario.facebook}</td>     
                            --%>
                            <td class="listagem-remover"><a href="UsuarioNew.jsp?id=${usuario.id}&nome=${usuario.nome}&sobrenome=${usuario.sobrenome}&login=${usuario.login}&datanascimento=${usuario.dataNascimento}&senha=${usuario.senha}&email=${usuario.email}&celular=${usuario.celular}"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Alterar</a></td>                                                                                                                                                                                                                                                     
                            <td class="listagem-excluir"><a href="CadastrarUsuario?id=${usuario.id}&excluir=excluir"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Remover</a></td>
                        </tr>
                    </c:forEach>                                                                                            
                </table>
            </div>
        </div>        
                   
        <c:import url="Rodape.jsp"></c:import>
    </body>

</html>

