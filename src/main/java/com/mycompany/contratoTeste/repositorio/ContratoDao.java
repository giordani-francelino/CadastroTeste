package com.mycompany.contratoTeste.repositorio;

import com.mycompany.contratoTeste.entidade.Contrato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

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
public class ContratoDao extends Dao<Contrato> {

    public static final String TABLE = "contrato";

    @Override
    public String getSaveStatment() {
        return "insert into " + TABLE + "(idCliente, redacao, ultimaAtualizacao)  values (?, ?, ?)";
    }

    @Override
    public String getUpdateStatment() {
        return "update " + TABLE + " set idCliente = ?, redacao = ?, ultimaAtualizacao = ? where id = ?";
    }

    @Override
    public void composeSaveOrUpdateStatement(PreparedStatement pstmt, Contrato e) {
        try {
            pstmt.setLong(1, e.getIdCliente());
            pstmt.setString(2, e.getRedacao());
            pstmt.setObject(3, e.getUltimaAtualizacao(), java.sql.Types.DATE);

            if (e.getId() != null) {
                pstmt.setLong(4, e.getId());
            }

        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getDeleteByIdStatment() {
        return "delete from " + TABLE + " where id = ?";
    }

    @Override
    public String getFindByIdStatment() {
        return "select id, idCliente, redacao, ultimaAtualizacao"
                + " from " + TABLE + " where id = ?";
    }

    @Override
    public String getFindAllStatment() {
        return "select id, idCliente, redacao, ultimaAtualizacao"
                + " from " + TABLE;
    }

    @Override
    public Contrato extractObject(ResultSet resultSet) {

        Contrato contrato = null;

        try {
            contrato = new Contrato();
            contrato.setId(resultSet.getLong("id"));
            contrato.setIdCliente(resultSet.getLong("idCliente"));
            contrato.setRedacao(resultSet.getString("redacao"));
            contrato.setUltimaAtualizacao(
                    resultSet.getObject("ultimaAtualizacao", LocalDate.class));
        } catch (SQLException ex) {
            Logger.getLogger(ContratoDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contrato;
    }

}
