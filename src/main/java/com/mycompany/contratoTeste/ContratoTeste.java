/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contratoTeste;

import com.mycompany.contratoTeste.entidade.Cliente;
import com.mycompany.contratoTeste.repositorio.ClienteDao;

/**
 *
 * @author Caixa
 */
public class ContratoTeste {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("123.156.456-10","João da Silva");
        System.out.println(cliente);
        long clienteId = new ClienteDao().saveOrUpdate(cliente);
        cliente.setId(clienteId);
        System.out.println(cliente);
    }
}
