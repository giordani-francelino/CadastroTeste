
package com.mycompany.contratoTeste.entidade;

import java.time.LocalDate;



public class Contrato extends Entidade {
    private String redacao;
    private LocalDate ultimaAtualizacao;

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    
    public String getRedacao() {
        return redacao;
    }
    
    public void setRedacao(String redacao) {
        this.redacao = redacao;
    }
    
    public LocalDate getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }
    
    public void setUltimaAtualizacao(LocalDate ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
//</editor-fold>

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contrato{");
        sb.append("id=").append(super.getId());
        sb.append("redacao=").append(getRedacao());
        sb.append(", ultimaAtualizacao=").append(getUltimaAtualizacao());
        sb.append('}');
        return sb.toString();
    }
    
    
}
