/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidade.Passageiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author andre
 */
public class PPassageiro extends TPersistencia<Passageiro>{
    
    
    public void incluir(Passageiro tipo) throws SQLException {

        //Cria o sql a ser executado
        String sql = "INSERT INTO passageiro (nome, numero_celular)" + " VALUES (?,?)";

        String sql2 = "SELECT currval('passageiro_codigo_passageiro_seq') as codigo";
        
        this.alterarOuIncluir(tipo, sql, sql2);
    }

    public void alterar(Passageiro tipo) throws SQLException {

        //Cria o sql a ser executado
        String sql = "UPDATE passageiro SET" + " nome = ? , " + " numero_celular = ?" + " WHERE codigo_passageiro = ?;";
        
        this.alterarOuIncluir(tipo, sql);
    }
    @Override
    public void excluir(int codigo) throws SQLException {

        //Cria o sql a ser executado
        String sql = "DELETE FROM passageiro" + " WHERE codigo = ?;";

        //Cria a conexão com o banco a partir da classe utilitária
        Connection cnn = util.SConexao.getConexao();
        //Cria o procedimento armazanado a partir do sql gerado
        PreparedStatement prd = cnn.prepareStatement(sql);

        //Seta os valores a serem injetados no código sql
        prd.setInt(1, codigo);

        //Executa o sql contra o banco
        prd.execute();

    }
    @Override
    public Passageiro consultar(int codigo) throws SQLException {

        String sql = "SELECT codigo_passageiro, nome, numero_celular " + " FROM passageiro WHERE codigo_passageiro = ?;";

        Connection cnn = util.SConexao.getConexao();
        PreparedStatement prd = cnn.prepareStatement(sql);
        prd.setInt(1, codigo);

        ResultSet rs = prd.executeQuery();

        Passageiro tipo = new Passageiro();

        if (rs.next()) {
            tipo.setCodigoTipo(rs.getInt("codigo_passageiro"));
            tipo.setNome(rs.getString("nome"));
            tipo.setNumero_celular(rs.getString("numero_celular"));
        }

        return tipo;

    }
    @Override
    public Iterator<Passageiro> listar() throws SQLException {

        String sql = "SELECT codigo_passageiro, nome, numero_celular " + " FROM passageiro ORDER BY nome;";

        Connection cnn = util.SConexao.getConexao();
        Statement prd = cnn.createStatement();

        ResultSet rs = prd.executeQuery(sql);

        ArrayList<Passageiro> lista = new ArrayList<Passageiro>();

        while (rs.next()) {
            Passageiro tipo = new Passageiro();
            tipo.setCodigoTipo(rs.getInt("codigo_passageiro"));
            tipo.setNome(rs.getString("nome"));
            tipo.setNumero_celular(rs.getString("numero_celular"));
            lista.add(tipo);
        }

        return lista.iterator();

    }

    @Override
    public Iterator<Passageiro> listarDescricao(int opcao, String string) throws SQLException {
        String sql = "SELECT * FROM passageiro WHERE nome LIKE ? ORDER BY codigo_passageiro;";
        String sql2 = "SELECT * FROM passageiro WHERE numero_celular LIKE ? ORDER BY codigo_passageiro;";
        
        Connection cnn = util.SConexao.getConexao();
        PreparedStatement prd = null;
        
        switch (opcao) {
            case 0:
                prd = cnn.prepareStatement(sql);
                prd.setString(1, "%" + string + "%");
                break;
            case 1:
                prd = cnn.prepareStatement(sql2);
                prd.setString(1, "%" + string + "%");
                break;
        }
        ResultSet rs = prd.executeQuery();
        ArrayList<Passageiro> lista = new ArrayList<>();
        
        while(rs.next()){
            lista.add(new Passageiro(rs.getInt(1), rs.getString(2), rs.getString(3)));
        }
        
        return lista.iterator();
        
    }

    @Override
    public PreparedStatement prepararDeclaracao(Passageiro passageiro, Connection cnn, String sql) throws SQLException {
        PreparedStatement prd = cnn.prepareStatement(sql);
        
        
        prd.setString(1, passageiro.getNome());
        prd.setString(2, passageiro.getNumero_celular());
        
        if(passageiro.getCodigo_passageiro()> 0)
            prd.setInt(6, passageiro.getCodigo_passageiro());
        
        return prd;
    }
    
}
