<%-- 
    Document   : UsuarioNew
    Created on : 18/11/2016, 20:13:52
    Author     : Odirlei
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
	<title>Usuário</title>
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
                    <li><a href="ListaUsuario.jsp" title="Lista de Usuários">Usuários</a></li>
                    <li class="active"><a href="#" title="Usuário ${param.nome}">Usuário ${param.nome}</a></li>
		</ol>
            </div>
	</div>   
        
        <div id="wrapper" class="wrapper bg-default">
            <header class="bg-light">
                <div class="container">
                    <h1>Usuário ${param.nome}</h1>
                    <h2>Edite a usuário selecionada</h2>
                </div>
            </header>
            
            <div class="container">
                <form name="Usuario" action="CadastrarUsuario" method="Get" onsubmit="return validarUsuario()"> 
                    <div class="form-group">
                        <%--<label for="usuario_id">Id:</label>--%>
                        <input type="hidden" class="form-control" name="id" id="usuario_id" value="${param.id}" disabled="true"  />
                    </div>
                    <div class="form-group">
                        <label for="usuario_nome">Nome:</label>
                        <input type="text" class="form-control" name="nome" id="usuario_nome" value="${param.nome}" />
                    </div>
                    <div class="form-group">
                        <label for="usuario_sobrenome">Sobrenome:</label>
                        <input type="text" class="form-control" name="sobrenome" id="usuario_sobrenome" value="${param.sobrenome}" />
                    </div>
                    <div class="form-group">
                        <label for="usuario_datanascimento">Data de Nascimento:</label>
                        <input type="text" class="form-control" name="datanascimento" id="usuario_datanascimento" value="${param.datanascimento}"  />
                    </div>
                    <div class="form-group">
                        <label for="usuario_email">Email:</label>
                        <input type="text" class="form-control" name="email" id="usuario_email" value="${param.email}"  />
                    </div>
                    <div class="form-group">
                        <label for="usuario_celular">Celular:</label>
                        <input type="text" class="form-control" name="celular" id="usuario_celular" value="${param.celular}"  />
                    </div>
                    <%--
                    <div class="form-group">
                        <label for="usuario_celular">Cidade:</label>
                        <input type="text" class="form-control" name="cidade" id="usuario_cidade" value="${param.cidade}"  />
                    </div>
                    <div class="form-group">
                        <label for="usuario_celular">Uf:</label>
                        <input type="text" class="form-control" name="uf" id="usuario_uf" value="${param.uf}"  />
                    </div>
                    --%>
                    <div class="form-group">
                        <label for="usuario_login">Login:</label>
                        <input type="text" class="form-control" name="login" id="usuario_login" value="${param.login}" />
                    </div>
                    <div class="form-group">
                        <label for="usuario_senha">Senha:</label>
                        <input type="text" class="form-control" name="senha" id="usuario_senha" value="${param.senha}" />
                    </div>                       
                    <div class="form-group">
                        <label for="usuario_confirmarsenha">Confirmar senha:</label>
                        <input type="text" class="form-control" name="confirmarsenha" id="usuario_confirmarsenha" value="${param.senha}"/>
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