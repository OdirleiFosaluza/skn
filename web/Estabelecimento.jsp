<%-- 
    Document   : Estabelecimento
    Created on : 18/11/2016, 15:23:32
    Author     : Odirlei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html lang="pt-br">
    <head>
        <title>Estabelecimentos - SmartK - Sistema de Gestão do SmartK</title>
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
                    <li class="active"><a href="ListaEstabelecimento.jsp" title="Lista de Estabelecimentos">Estabelecimentos</a></li>
                    <li class="active"><a href="#" title="Estabelecimento">Estabelecimentos</a></li>
		</ol>
            </div>
	</div>
        
        <div id="wrapper" class="wrapper bg-default">
            <header class="bg-light">
                <div class="container">
                    <h1>Estabelecimento</h1>
                    <h2>Editer o estabelecimento selecionado</h2>
                </div>
            </header>
            
            <div class="container">
                <form name="Estabelecimento" action="CadastrarEstabelecimento" method="Get" >   
                    <div class="form-group">
                        <c:if test="${param.mensagem != null}">                                                        
                                <input type="text" class="form-control" name="mensagem" id="mensagem" value="${param.mensagem}"  />      
                        </c:if>
                        <c:if test="${param.mensagem == null}">                                                        
                                <input type="text" class="form-control" name="mensagem" id="mensagem" value="Mensagem Vazia"  />      
                        </c:if>        
                    </div>
                    <div class="form-group">
                        <label for="estabelecimento_id">Código:</label>
                        <input type="text" class="form-control" name="id" id="estabelecimento_id" value="${param.id}"  />
                    </div>
                    <div class="form-group">
                        <label for="estabelecimento_nome">Nome:</label>
                        <input type="text" class="form-control" name="nome" id="estabelecimento_nome" value="${param.nome}"  />
                    </div>
                    <div class="form-group">
                        <label for="estabelecimento_endereco">Endereço:</label>
                        <input type="text" class="form-control" name="endereco" id="estabelecimento_endereco" value="${param.endereco}"  />
                    </div>
                    <div class="form-group">
                        <label for="estabelecimento_complemento">Complemento:</label>
                        <input type="text" class="form-control" name="complemento" id="estabelecimento_complemento" value="${param.complemento}"  />
                    </div>
                    <div class="form-group">
                        <label for="estabelecimento_bairro">Bairro:</label>
                        <input type="text" class="form-control" name="bairro" id="estabelecimento_bairro" value="${param.bairro}" />
                    </div>
                    <div class="form-group">
                        <label for="estabelecimento_cidade">Cidade</label>
                        <input type="text" class="form-control" name="cidade" id="estabelecimento_cidade" value="${param.cidade}" />
                    </div>
                    <div class="form-group">
                        <label for="estabelecimento_uf">Uf:</label>
                        <input type="text" class="form-control" name="uf" id="estabelecimento_uf" value="${param.uf}" />
                    </div>
                    <div class="form-group">
                        <label for="estabelecimento_latitude">Latitude</label>
                        <input type="text" class="form-control" name="latitude" id="estabelecimento_latitude" value="${param.latitude}" />
                    </div>
                    <div class="form-group">
                        <label for="estabelecimento_longitude">Longitude</label>
                        <input type="text" class="form-control" name="longitude" id="estabelecimento_longitude" value="${param.longitude}" />
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
</html>
