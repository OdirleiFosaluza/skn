/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.smartk.control;

import br.com.smartk.model.Estabelecimento;

/**
 *
 * @author Odirlei
 */
public class ValidarCadastros {
    public String validarEstabelecimento(Estabelecimento estabelecimento){
        String retorno = "";
        if(estabelecimento.getNome().equals(""))
        {
            return retorno = "Por favor preencha o campo nome.";
        }else{
            retorno = "valido";
        }                        
        return retorno;
    }
    
}
