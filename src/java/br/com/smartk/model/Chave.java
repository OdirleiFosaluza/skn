
package br.com.smartk.model;

import java.util.Date;

/**
 *
 * @author Odirlei
 */
public class Chave {
    
    private Integer id;   
    private Date data;
    private Estabelecimento idEstabelecimento = new Estabelecimento();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Estabelecimento getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Estabelecimento idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }
     
}
