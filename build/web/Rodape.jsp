<%-- 
    Document   : Rodape
    Created on : 18/11/2016, 13:48:29
    Author     : Odirlei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <footer id="footer" class="default-primary-color">
        <div class="container">
            <div class="row">
                <div class="col-md-4">
                        <h3>Sobre o Sistema</h3>
                        <p>Aplicativo para Sistema Android com finalidade de gerir a interação entre as pessoas que estão no karaokê e o estabelecimento.</p>
                        <p>O aplicativo possibilitará que o usuário por meio do celular escolha a músicas que deseja cantar. Uma lista irá mostrar as próximas músicas selecionadas pelos usuários.</p>
                </div>

                <div class="col-md-4">
                    <h3>Catálogo de Música</h3>
                    <nav class="">
                        <ul class="nav">
                            <li><a href="ListaMusica.jsp" title="Música"><span class="glyphicon glyphicon-menu-right"></span> Músicas</a></li>
                            <li><a href="ListaCantor.jsp" title="Cantor"><span class="glyphicon glyphicon-menu-right"></span> Cantores</a></li>
                            <li><a href="ListaGenero.jsp" title="Gênero"><span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span> Gêneros</a></li>
                        </ul>
                    </nav>
                </div>

                <div class="col-md-4">
                    <h3>Administração</h3>
                    <nav class="">
                        <ul class="nav">
                            <li><a href="ListaUsuario.jsp" title="Usuário"><span class="glyphicon glyphicon-menu-right"></span> Usuário</a></li>
                            <li><a href="ListaEstabelecimento.jsp" title="Estabelecimentos"><span class="glyphicon glyphicon-menu-right"></span> Estabelecimentos</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>

        <div id="assinatura" class="dark-primary-color">
            <div class="container">
                <p>Copyright 2016 - Todos os direitos reservados</p>
            </div>
        </div>
    </footer>
