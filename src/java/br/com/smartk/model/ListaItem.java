
package br.com.smartk.model;

/**
 *
 * @author Odirlei
 */
public class ListaItem {

    private Lista idLista = new Lista();
    private Estabelecimento idEstabelecimento = new Estabelecimento();    	
    private Musica idMusica = new Musica();
    private Chave idChave = new Chave();
    private Usuario idUsuario = new Usuario();
    private Integer id;
    private String status;	
    private String votacao;

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

    public Musica getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Musica idMusica) {
        this.idMusica = idMusica;
    }

    public Chave getIdChave() {
        return idChave;
    }

    public void setIdChave(Chave idChave) {
        this.idChave = idChave;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVotacao() {
        return votacao;
    }

    public void setVotacao(String votacao) {
        this.votacao = votacao;
    }
    
}
