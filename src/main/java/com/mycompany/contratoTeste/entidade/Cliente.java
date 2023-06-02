package com.mycompany.contratoTeste.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caixa
 */
public class Cliente extends Entidade {

    private String cpf;
    private String nome;
    private List<Contrato> contratos;

    public Cliente() {
        contratos = new ArrayList<Contrato>();
    }

    public Cliente(String cpf, String nome) {
        this();
        this.cpf = cpf;
        this.nome = nome;
    }

    public Cliente(String cpf, String nome, List<Contrato> contratos) {
        this.cpf = cpf;
        this.nome = nome;
        this.contratos = contratos;
    }
    
    

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//</editor-fold>
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("id=").append(super.getId());
        sb.append("cpf=").append(getCpf());
        sb.append(", nome=").append(getNome());
        sb.append('}');
        String s = sb.toString();
        s = s + "\n";
        return s;
    }

}
