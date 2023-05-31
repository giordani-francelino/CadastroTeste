
package com.mycompany.contratoTeste.repositorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mycompany.contratoTeste.entidade.Cliente;
import java.sql.ResultSet;


/**
 *
 * <code>
 * CREATE TABLE `cliente` (
 * `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 * `cpf` LONGBLOB NOT NULL,
 * `nome` varchar(45) NOT NULL,
 * PRIMARY KEY (`id`),
 * UNIQUE KEY `id` (`id`)
 * )
 * </code>
 */


public class ClienteDao extends Dao<Cliente> {

    @Override
    public String getSaveStatment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateStatment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Cliente e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFindByIdStatment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getFindAllStatment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente extractObject(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
