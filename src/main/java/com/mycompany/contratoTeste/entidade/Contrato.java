
package com.mycompany.contratoTeste.entidade;

import java.time.LocalDate;



public class Contrato extends Entidade {
    private Long idCliente;
    private String redacao;
    private LocalDate ultimaAtualizacao;

    public Contrato(Long idCliente, String redacao, LocalDate ultimaAtualizacao) {
        this.idCliente = idCliente;
        this.redacao = redacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
    public Contrato(){
        
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }
    
    
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
        sb.append("idCliente=").append(getIdCliente());
        sb.append("redacao=").append(getRedacao());
        sb.append(", ultimaAtualizacao=").append(getUltimaAtualizacao());
        sb.append('}');
        String s = sb.toString();
        s = s + "\n";
        return s;
    }
    
    
}
