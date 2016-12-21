
package br.com.smartk.model;

/**
 *
 * @author Odirlei
 */
public class Musica {
    private Integer id;
    private String nome;
    private String codigo;    
    private String inicio;  
    private String idioma;
    private String nomeGenero;
    private String nomeCantor;
    private Cantor idCantor = new Cantor();
    private Genero idGenero = new Genero();            

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the inicio
     */
    public String getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    /**
     * @return the idCantor
     */
    public Cantor getIdCantor() {
        return idCantor;
    }

    /**
     * @param idCantor the idCantor to set
     */
    public void setIdCantor(Cantor idCantor) {
        this.idCantor = idCantor;
    }
    
    /**
     * @return the idGenero
     */
    public Genero getIdGenero() {
        return idGenero;
    }

    /**
     * @param idGenero the idGenero to set
     */
    public void setIdGenero(Genero idGenero) {
        this.idGenero = idGenero;        
    }    

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public String getNomeCantor() {
        return nomeCantor;
    }

    public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }
}


  

  
