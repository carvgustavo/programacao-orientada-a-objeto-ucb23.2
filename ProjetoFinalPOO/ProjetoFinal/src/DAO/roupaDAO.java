package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.conexao;
import lojaderoupas.roupa;

public class roupaDAO {
    
    public void cadastrarRoupa(roupa roupa){
        String sql = "INSERT INTO ROUPA (CODIGO, DESCRICAO, PRECO, TAMANHO) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = conexao.getConexao().prepareStatement(sql)) {
            ps.setInt(1, roupa.getCodigo());
            ps.setString(2, roupa.getDescricao());
            ps.setString(3, roupa.getPreco());
            ps.setString(4, roupa.getTamanho());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<roupa> consultarRoupas(){
        List<roupa> roupas = new ArrayList<>();
        String sql = "SELECT * FROM ROUPA";
        try (PreparedStatement ps = conexao.getConexao().prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                roupa r = new roupa();
                r.setCodigo(rs.getInt("CODIGO"));
                r.setDescricao(rs.getString("DESCRICAO"));
                r.setPreco(rs.getString("PRECO"));
                r.setTamanho(rs.getString("TAMANHO"));
                roupas.add(r);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roupas;
    }

    public void atualizarRoupa(roupa roupa){
        String sql = "UPDATE ROUPA SET DESCRICAO = ?, PRECO = ?, TAMANHO = ? WHERE CODIGO = ?";
        try (PreparedStatement ps = conexao.getConexao().prepareStatement(sql)) {
            ps.setString(1, roupa.getDescricao());
            ps.setString(2, roupa.getPreco());
            ps.setString(3, roupa.getTamanho());
            ps.setInt(4, roupa.getCodigo());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluirRoupa(int codigo){
        String sql = "DELETE FROM ROUPA WHERE CODIGO = ?";
        try (PreparedStatement ps = conexao.getConexao().prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

