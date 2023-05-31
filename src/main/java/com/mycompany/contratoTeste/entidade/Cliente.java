

package com.mycompany.contratoTeste.entidade;

/**
 *
 * @author Caixa
 */
public class Cliente extends Entidade{
    
    private long cpf;
    private String nome;

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    
    public long getCpf() {
        return cpf;
    }
    
    public void setCpf(long cpf) {
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
        return sb.toString();
    }
    
    
    
}
