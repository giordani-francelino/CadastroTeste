package com.mycompany.contratoTeste.repositorio;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mycompany.contratoTeste.entidade.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * <code>
 * CREATE TABLE `cliente` (
 * `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
 * `cpf` bigint(11) NOT NULL,
 * `nome` varchar(45) NOT NULL,
 * PRIMARY KEY (`id`),
 * UNIQUE KEY `id` (`id`)
 * )
 * </code>
 */
public class ClienteDao extends Dao<Cliente> {

    public static final String TABLE = "cliente";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE + "(cpf, nome)  values (?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set cpf = ?, nome = ? where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Cliente e) {
        try {
            pstmt.setLong(1, e.getCpf());
            pstmt.setString(2, e.getNome());

            if (e.getId() != null) {
                pstmt.setLong(3, e.getId());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getDeleteByIdStatment() {
        return "delete id, cpf, nome"
                + " from " + TABLE + " where id = ?";
    }

    @Override
    public String getFindByIdStatment() {
        return "select id, cpf, nome"
                + " from " + TABLE + " where id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "select id, cpf, nome"
                + " from " + TABLE;
    }

    @Override
    public Cliente extractObject(ResultSet resultSet) {

        Cliente cliente = null;

        try {
            cliente = new Cliente();
            cliente.setId(resultSet.getLong("id"));
            cliente.setCpf(resultSet.getLong("cpf"));
            cliente.setNome(resultSet.getString("nome"));
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cliente;
    }

}
