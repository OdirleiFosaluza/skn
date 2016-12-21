
package br.com.smartk.model;

/**
 *
 * @author Odirlei
 */
public class AparelhoEstabelecimento {
    private Aparelho idAparelho =  new Aparelho();
    private Estabelecimento idEstabelecimento = new Estabelecimento();

    public Aparelho getIdAparelho() {
        return idAparelho;
    }

    public void setIdAparelho(Aparelho idAparelho) {
        this.idAparelho = idAparelho;
    }

    public Estabelecimento getIdEstabelecimento() {
        return idEstabelecimento;
    }

    public void setIdEstabelecimento(Estabelecimento idEstabelecimento) {
        this.idEstabelecimento = idEstabelecimento;
    }
    
}
