<%-- 
    Document   : Cabecalho
    Created on : 18/11/2016, 13:54:17
    Author     : Odirlei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<header id="header" class="default-primary-color">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <a href="index.html" title="SmartK">
                    <img src="img/logo-negativo.png" alt="" height="60" >
                </a>
            </div>

            <div class="col-md-6 col-md-offset-2">
		<c:import url="Menu.jsp"></c:import>
            </div>
	</div>
    </div>
</header>