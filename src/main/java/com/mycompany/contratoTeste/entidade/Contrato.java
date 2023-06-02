package com.mycompany.contratoTeste.entidade;

import java.time.LocalDate;

public class Contrato extends Entidade {

    private Cliente cliente;
    private String redacao;
    private LocalDate ultimaAtualizacao;

    public Contrato(Cliente cliente, String redacao, LocalDate ultimaAtualizacao) {
        this.cliente = cliente;
        this.redacao = redacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Contrato() {

    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        sb.append(", idCliente=").append((getCliente() == null ? "null, " : getCliente().getId()));
        sb.append("redacao=").append(getRedacao());
        sb.append(", ultimaAtualizacao=").append(getUltimaAtualizacao());
        sb.append('}');
        String s = sb.toString();
        s = s + "\n";
        return s;
    }

}
