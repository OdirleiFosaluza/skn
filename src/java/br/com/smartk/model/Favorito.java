
package br.com.smartk.model;

/**
 *
 * @author Odirlei
 */
public class Favorito {
    
    private Musica idMusica = new Musica();
    private Usuario idUsuario = new Usuario();    

    public Musica getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Musica idMusica) {
        this.idMusica = idMusica;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}
