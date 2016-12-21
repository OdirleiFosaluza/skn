
package br.com.smartk.model;

/**
 *
 * @author Odirlei
 */
public class ChaveUsuario {
private Estabelecimento idEstabelecimento = new Estabelecimento();
private Chave idChave = new Chave();
private Usuario idUsuario = new Usuario();

    public Estabelecimento getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Estabelecimento idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
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
      
}
