
package br.com.smartk.model;

/**
 *
 * @author Odirlei
 */
public class CartuchoAparelho {

    private Cartucho idCartucho = new Cartucho();
    private Aparelho idAparelho = new Aparelho();

    public Cartucho getIdCartucho() {
        return idCartucho;
    }

    public void setIdCartucho(Cartucho idCartucho) {
        this.idCartucho = idCartucho;
    }

    public Aparelho getIdAparelho() {
        return idAparelho;
    }

    public void setIdAparelho(Aparelho idAparelho) {
        this.idAparelho = idAparelho;
    }
    
}
