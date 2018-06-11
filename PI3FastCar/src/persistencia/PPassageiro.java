/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.EPassageiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class PPassageiro {
    public void incluir(EPassageiro tipo) throws SQLException {

        //Cria o sql a ser executado
        String sql = "INSERT INTO passageiro (nome, numero_celular)" + " VALUES (?,?)";

        //Cria a conexão com o banco a partir da classe utilitária
        Connection cnn = util.Conexao.getConexao();
        //Cria o procedimento armazanado a partir do sql gerado
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores a serem injetados no código sql
        prd.setString(1, tipo.getNome());
        prd.setString(2, tipo.getNumero_celular());

        //Executa o sql contra o banco
        prd.execute();

        String sql2 = "SELECT currval('passageiro_codigo_seq') as codigo_passageiro ";
        Statement stm = cnn.createStatement();
        ResultSet rs = stm.executeQuery(sql2);
        if (rs.next()) {
            tipo.setCodigo_passageiro(rs.getInt("codigo_passageiro"));
        }

    }

    public void alterar(EPassageiro tipo) throws SQLException {

        //Cria o sql a ser executado
        String sql = "UPDATE passageiro SET" + " nome = ? , " + " numero_celular = ?" + " WHERE codigo_passageiro = ?;";

        //Cria a conexão com o banco a partir da classe utilitária
        Connection cnn = util.Conexao.getConexao();
        //Cria o procedimento armazanado a partir do sql gerado
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores a serem injetados no código sql
        prd.setString(1, tipo.getNome());
        prd.setString(2, tipo.getNumero_celular());
        prd.setInt(3, tipo.getCodigo_passageiro());

        //Executa o sql contra o banco
        prd.execute();

    }

    public void excluir(int codigo) throws SQLException {

        //Cria o sql a ser executado
        String sql = "DELETE FROM passageiro" + " WHERE codigo = ?;";

        //Cria a conexão com o banco a partir da classe utilitária
        Connection cnn = util.Conexao.getConexao();
        //Cria o procedimento armazanado a partir do sql gerado
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores a serem injetados no código sql
        prd.setInt(1, codigo);

        //Executa o sql contra o banco
        prd.execute();

    }

    public EPassageiro consultar(int codigo) throws SQLException {

        String sql = "SELECT codigo_passageiro, nome, numero_celular " + " FROM passageiro WHERE codigo_passageiro = ?;";

        Connection cnn = util.Conexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);

        ResultSet rs = prd.executeQuery();

        EPassageiro tipo = new EPassageiro();

        if (rs.next()) {
            tipo.setCodigo_passageiro(rs.getInt("codigo_passageiro"));
            tipo.setNome(rs.getString("nome"));
            tipo.setNumero_celular(rs.getString("numero_celular"));
        }

        return tipo;

    }

    public ArrayList<EPassageiro> listar() throws SQLException {

        String sql = "SELECT codigo_passageiro, nome, numero_celular " + " FROM passageiro ORDER BY nome;";

        Connection cnn = util.Conexao.getConexao();
        Statement prd = cnn.createStatement();

        ResultSet rs = prd.executeQuery(sql);

        ArrayList<EPassageiro> lista = new ArrayList<EPassageiro>();

        while (rs.next()) {
            EPassageiro tipo = new EPassageiro();
            tipo.setCodigo_passageiro(rs.getInt("codigo_passageiro"));
            tipo.setNome(rs.getString("nome"));
            tipo.setNumero_celular(rs.getString("numero_celular"));
            lista.add(tipo);
        }

        return lista;

    }
}
