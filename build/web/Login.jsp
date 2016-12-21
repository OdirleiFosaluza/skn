<%-- 
    Document   : login
    Created on : 07/12/2016, 01:32:05
    Author     : Antonio
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
    <head>
        
        <title>Login - SmartK</title>
        <meta name="description" content="Sistema de Gestão do SmartK" />

	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	
	<!-- Styles -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style-smartk.css" >
    </head>
    <body>
        <header id="header" class="default-primary-color">
            <div class="container">
                <a href="index.html" title="SmartK" class="logo">
                    <img src="img/logo-negativo.png" alt="SmartK" height="60" >
                </a>
            </div>
        </header>
        <div id="wrapper" class="wrapper bg-default">
            <div class="container">
                <form action="Login" method="Get" class="login-form">
                    <div class="form-group">
                        <label for="login">Login:</label>
                        <input type="text" class="form-control" name="login" id="login"  />
                    </div>
                    <div class="form-group">
                        <label for="login">Senha:</label>
                        <input type="text" class="form-control" name="senha" id="senha"  />
                    </div>
                    <div>
                        <input type="submit" value="Gravar" class="btn btn-default"	/> 
                    </div>
                </form>
            </div>   
        </div>
        
        <footer id="footer" class="default-primary-color">
            <div id="assinatura" class="dark-primary-color">
                <div class="container">
                    <p>Copyright 2016 - Todos os direitos reservados</p>
                </div>
            </div>
        </footer>
    </body>
</html>
