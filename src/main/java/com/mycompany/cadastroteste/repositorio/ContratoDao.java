
package com.mycompany.cadastroteste.repositorio;

import com.mycompany.cadastroteste.entidade.Contrato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * <code>
 * CREATE TABLE `contrato` (
 * `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 * `redacao` MEDIUMTEXT NOT NULL,
 * `ultimaAtualizacao` date,
 * PRIMARY KEY (`id`),
 * UNIQUE KEY `id` (`id`)
 * )
 * </code>
 */

public class ContratoDao extends Dao<Contrato>{

    @Override
    public String getSaveStatment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getUpdateStatment() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Contrato e) {
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
    public Contrato extractObject(ResultSet resultSet) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
