
package br.com.smartk.model;

/**
 *
 * @author Odirlei
 */
public class Lista {
    private Integer id;
    private Estabelecimento idEstabelecimento = new Estabelecimento();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Estabelecimento getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Estabelecimento idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }
}
