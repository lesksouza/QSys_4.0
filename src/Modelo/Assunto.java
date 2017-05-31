/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author pc
 */
public class Assunto {
    private String campoNome;
    private int campoCodigoAssunto;
    private String caixaDisciplina;
    private String caixaÁrea;
    private String caixaGrauDeEducacao;

    /**
     * @return the campoNome
     */
    public String getCampoNome() {
        return campoNome;
    }

    /**
     * @param campoNome the campoNome to set
     */
    public void setCampoNome(String campoNome) {
        this.campoNome = campoNome;
    }

    /**
     * @return the campoCodigoAssunto
     */
    public int getCampoCodigoAssunto() {
        return campoCodigoAssunto;
    }

    /**
     * @param campoCodigoAssunto the campoCodigoAssunto to set
     */
    public void setCampoCodigoAssunto(int campoCodigoAssunto) {
        this.campoCodigoAssunto = campoCodigoAssunto;
    }

    /**
     * @return the caixaDisciplina
     */
    public String getCaixaDisciplina() {
        return caixaDisciplina;
    }

    /**
     * @param caixaDisciplina the caixaDisciplina to set
     */
    public void setCaixaDisciplina(String caixaDisciplina) {
        this.caixaDisciplina = caixaDisciplina;
    }

    /**
     * @return the caixaÁrea
     */
    public String getCaixaÁrea() {
        return caixaÁrea;
    }

    /**
     * @param caixaÁrea the caixaÁrea to set
     */
    public void setCaixaÁrea(String caixaÁrea) {
        this.caixaÁrea = caixaÁrea;
    }

    /**
     * @return the caixaGrauDeEducacao
     */
    public String getCaixaGrauDeEducacao() {
        return caixaGrauDeEducacao;
    }

    /**
     * @param caixaGrauDeEducacao the caixaGrauDeEducacao to set
     */
    public void setCaixaGrauDeEducacao(String caixaGrauDeEducacao) {
        this.caixaGrauDeEducacao = caixaGrauDeEducacao;
    }
}
