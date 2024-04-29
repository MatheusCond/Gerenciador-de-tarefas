package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://127.0.0.1:3306/gerenciadortarefas?useTimezone=true&serverTimezone=UTC";
    private String user = "root";
    private String password = "mcs010203";

    private Connection conectar() throws SQLException, ClassNotFoundException {
        Class.forName(driver);
        return DriverManager.getConnection(url, user, password);
    }

    public void inserirUsuario(Usuarios usuario){
        String create = "insert into Usuarios(nomeUsuario, emailUsuario, senhaUsuario) values (?,?,?)";
        try {
            Connection con = conectar();
            PreparedStatement pst = con.prepareStatement(create);
            pst.setString(1, usuario.getNomeUsuario());
            pst.setString(2, usuario.getEmailUsuario());
            pst.setString(3, usuario.getSenhaUsuario());
            pst.executeUpdate();
            con.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void inserirTarefa(Tarefas tarefa) {
    	String create = "insert into Tarefas(nomeTarefa, descricaoTarefa, dataTarefa, imagem, usuarioId) values (?,?,?,?,?)";
    	try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(create);
			pst.setString(1, tarefa.getNomeTarefa());
			pst.setString(2, tarefa.getDescricaoTarefa());
			pst.setDate(3, Date.valueOf(tarefa.getDataTarefa()));
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
    }
    
    public void conferirLogin(Usuarios usuario) {
        String sql = "select idUsuario, nomeUsuario, senhaUsuario from Usuarios where nomeUsuario=? and senhaUsuario=?";
        try {
            Connection con = conectar();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getNomeUsuario());
            pst.setString(2, usuario.getSenhaUsuario());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) { // Se o usuário existe
                usuario.setIdUsuario(rs.getInt("idUsuario")); // Define o ID do usuário
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}
