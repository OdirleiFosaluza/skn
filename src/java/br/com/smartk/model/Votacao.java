
package br.com.smartk.model;

/**
 *
 * @author Odirlei
 */
public class Votacao {

    private Lista idLista = new Lista();
    private Estabelecimento idEstabelecimento = new Estabelecimento();
    private ListaItem idListaItem = new ListaItem();
    private Integer id;
    private Integer voto;

    public Lista getIdLista() {
        return idLista;
    }

    public void setIdLista(Lista idLista) {
        this.idLista = idLista;
    }

    public Estabelecimento getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Estabelecimento idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }

    public ListaItem getIdListaItem() {
        return idListaItem;
    }

    public void setIdListaItem(ListaItem idListaItem) {
        this.idListaItem = idListaItem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVoto() {
        return voto;
    }

    public void setVoto(Integer voto) {
        this.voto = voto;
    }
    
}
