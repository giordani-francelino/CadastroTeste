/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contratoTeste;

import com.mycompany.contratoTeste.entidade.Cliente;
import com.mycompany.contratoTeste.entidade.Contrato;
import com.mycompany.contratoTeste.repositorio.ClienteDao;
import com.mycompany.contratoTeste.repositorio.ContratoDao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Caixa
 */
public class ContratoTeste {

    public static void main(String[] args) {
        new ClienteDao().deleteById(14L);
        Cliente cliente = new Cliente("119.298.263-03","Ana Zaira");
        System.out.println(cliente);
        long clienteId = new ClienteDao().saveOrUpdate(cliente);
        cliente.setId(clienteId);
        System.out.println(cliente);
        Contrato contrato = new Contrato(clienteId,"Contrato por tempo determinado",
                LocalDate.parse("2023-05-21"));
        long contratoId = new ContratoDao().saveOrUpdate(contrato);
        contrato.setId(contratoId);
        System.out.println(contrato);
    }
}
