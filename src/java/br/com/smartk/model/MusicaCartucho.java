
package br.com.smartk.model;

/**
 *
 * @author Odirlei
 */
public class MusicaCartucho {
    private Musica idMusica = new Musica();
    private Cartucho idCartucho = new Cartucho();
    private String codigoMusica;

    public Musica getIdMusica() {
        return idMusica;
    }

    public void setIdMusica(Musica idMusica) {
        this.idMusica = idMusica;
    }

    public Cartucho getIdCartucho() {
        return idCartucho;
    }

    public void setIdCartucho(Cartucho idCartucho) {
        this.idCartucho = idCartucho;
    }

    public String getCodigoMusica() {
        return codigoMusica;
    }

    public void setCodigoMusica(String codigoMusica) {
        this.codigoMusica = codigoMusica;
    }
}
