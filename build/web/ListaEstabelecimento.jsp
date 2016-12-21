<%-- 
    Document   : ListaEstabelecimento
    Created on : 21/11/2016, 23:49:21
    Author     : Odirlei
--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>

<html lang="pt-br">
    <head>
        <title>Estabelecimentos</title>
        <meta name="description" content="Sistema de Gest�o do SmartK" />

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
                    <li class="active"><a href="#" title="Lista de Estabelecimentos">Estabelecimentos</a></li>
		</ol>
            </div>
	</div>            
            
        <div id="wrapper" class="wrapper bg-default">
            <header class="bg-light">
                <div class="container">
                    <h1>Estabelecimentos</h1>
                    <h2>A Lista de Estabelecimentos inseridos no SmartK</h2>
                </div>
            </header>
            
            <div class="container listagem-default">
                <jsp:useBean id="dao" class="br.com.smartk.model.EstabelecimentoDao"></jsp:useBean>

                <a href="Estabelecimento.jsp" class="btn btn-default"><span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span> Adicionar Novo</a>
                
                <table class="table  table-bordered table-hover">
                    <tr class="info"> 
                        <td>C�dgo</td>
                        <td>Nome</td>                                
                        <td>Endere�o</td>                                
                        <td>Complemento</td>
                        <td>Bairro</td>
                        <td>Cidade</td>
                        <td>Uf</td>
                        <td>Alterar</td>
                        <td>Remover</td>                                
                    </tr>      

                    <c:forEach var="estabelecimento" items="${dao.lista}">            
                        <tr>
                            <td>${estabelecimento.id}</td>   
                            <td>${estabelecimento.nome}</td>
                            <td>${estabelecimento.endereco}</td>
                            <td>${estabelecimento.complemento}</td>
                            <td>${estabelecimento.bairro}</td>
                            <td>${estabelecimento.cidade}</td>
                            <td>${estabelecimento.uf}</td> 
                            <td class="listagem-remover"><a href="Estabelecimento.jsp?&id=${estabelecimento.id}&nome=${estabelecimento.nome}&endereco=${estabelecimento.endereco}&complemento=${estabelecimento.complemento}&bairro=${estabelecimento.bairro}&cidade=${estabelecimento.cidade}&uf=${estabelecimento.uf}&latitude=${estabelecimento.latitude}&longitude=${estabelecimento.longitude}"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Alterar</a></td>
                            <td class="listagem-excluir"><a href="CadastrarEstabelecimento?id=${estabelecimento.id}&excluir=excluir"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span> Remover</a></td>
                        </tr>
                    </c:forEach>                                            
                    <%----%>
                </table>
            </div>   
        </div>        
                   
        <c:import url="Rodape.jsp"></c:import>
        
    </body>

</html>
