/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function validacao() 
{
    /*
     * Inicio validação Cantor
     */
    if(document.CadastrarCantor.cad_nome.value=="")
    {
     alert("Por favor, preencha o campo nome.");   
     document.CadastrarCantor.cad_nome.focus();
     return false;
    }
    /*
    if(document.teste.cad_senha.value.length < 5 )
    {
     alert("Por favor, a senha deve conter no mínimo 6 caracteres.");   
     document.IncluirCantor.cad_nome.focus();
     return false;
    }
    if(document.form.email.value=="" || document.form.email.value.indexOf('@')==-1 || document.form.email.value.indexOf('.')==-1)
    {
        alter("Por favor, preencha o email corretamente");
        return false;
    }
    */
}
     /*
     * Inicio validação Genero
     */
function validarGenero()
{

    if(document.Genero.genero_nome.value=="")
    {
        alert("Por favor, preencha o campo genero.");
        document.Genero.genero_nome.focus();
        return false;
    }
}

function estabelecimento()
{
    if(document.Genero.genero_nome.value=="")
    {
        alert("Por favor, preencha o campo genero.");
        document.Genero.genero_nome.focus();
        return false;
    }
}

function validarEstabelecimento()
{
   if(document.Estabelecimentos.genero_nome.value=="")
    {
        alert("Por favor, preencha o campo Nome.");
        document.Estabelecimentos.genero_nome.focus();
        return false;
    }                        
  
}

function validarMusica()
{

    if(document.Musica.musica_nome.value=="")
    {
        alert("Por favor, preencha o campo nome.");
        document.Musica.musica_nome.focus();
        return false;
    }
    if(document.Musica.musica_codigo.value=="")
    {
        alert("Por favor, preencha o campo código.");
        document.Musica.musica_codigo.focus();
        return false;        
    }
    if(document.Musica.musica_inicio.value=="")
    {
        alert("Por favor, preencha o campo início.");
        document.Musica.musica_inicio.focus();
        return false;        
    }
    
    if(document.Musica.musica_idioma.value=="")
    {
        alert("Por favor, preencha o campo idioma.");
        document.Musica.musica_idioma.focus();
        return false;
    }
    if(document.Musica.cantor_id.value=="")
    {
        alert("Por favor, preencha o campo cantor.");
        document.Musica.cantor_id.focus();
        return false;
    }
    if(document.Musica.genero_id.value=="")
    {
        alert("Por favor, preencha o campo genero.");
        document.Musica.genero_id.focus();
        return false;
    }
    
}

function validarUsuario()
{

    if(document.Usuario.usuario_nome.value=="")
    {
        alert("Por favor, preencha o campo nome.");
        document.Usuario.usuario_nome.focus();
        return false;
    }
    if(document.Usuario.usuario_sobrenome.value=="")
    {
        alert("Por favor, preencha o campo sobrenome.");
        document.Usuario.usuario_sobrenome.focus();
        return false;        
    }
    if(document.Usuario.usuario_datanascimento.value=="")
    {
        alert("Por favor, preencha o campo Data de nascimento.");
        document.Usuario.usuario_datanascimento.focus();
        return false;        
    }
    //if(document.Usuario.usuario_email.value=="" || document.Usuario.usuario_email.value.indexOf('@')==-1 || document.Usuario.usuario_email.value.indexOf('.')==-1)
    if(document.Usuario.usuario_email.value=="" || document.Usuario.usuario_email.value.indexOf('@')==-1 || document.Usuario.usuario_email.value.indexOf('.')==-1)
    {
        alert("Por favor, preencha o campo e-mail.");
        document.Usuario.usuario_email.focus();
        return false;
    }
    if(document.Usuario.usuario_celular.value=="")
    {
        alert("Por favor, preencha o campo celular.");
        document.Usuario.usuario_celular.focus();
        return false;
    }
    /*
    if(document.Usuario.usuario_cidade.value=="")
    {
        alert("Por favor, preencha o campo cidade.");
        document.Usuario.usuario_cidade.focus();
        return false;
    }
    if(document.Usuario.usuario_uf.value=="")
    {
        alert("Por favor, preencha o campo uf.");
        document.Usuario.usuario_uf.focus();
        return false;
    }
    */
    if(document.Usuario.usuario_login.value=="")
    {
        alert("Por favor, preencha o campo login.");
        document.Usuario.usuario_login.focus();
        return false;
    }
    if(document.Usuario.usuario_senha.value=="")
    {
        alert("Por favor, preencha o campo senha.");
        document.Usuario.usuario_senha.focus();
        return false;
    }
    if(document.Usuario.usuario_confirmarsenha.value=="")
    {
        alert("Por favor, preencha o campo confirmar senha.");
        document.Usuario.usuario_confirmarsenha.focus();
        return false;
    }
    
}   
    
function confirmacaoTransacao()
{
    decisao = confirm("Operação realizada com sucesso");
    if (decisao)
    {
        return decisao;
    }
}    