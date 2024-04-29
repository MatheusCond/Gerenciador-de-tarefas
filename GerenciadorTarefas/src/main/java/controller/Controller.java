package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Tarefas;
import model.Usuarios;


@WebServlet(urlPatterns = {"/Controller", "/main", "/insertUsuario", "/insertTarefa", "/conferirUsuario"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	Usuarios usuarioCad = new Usuarios();
	Tarefas tarefaCad = new Tarefas();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
        if(action.equals("/insertUsuario")) {
            novoCadastro(request, response);
        }
        if(action.equals("/insertTarefa")) {
        	novaTarefa(request, response);
        }
        if(action.equals("/conferirUsuario")) {
        	logarUsuario(request, response);
        }
	}
	protected void novoCadastro(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        usuarioCad.setNomeUsuario(request.getParameter("nome"));
        usuarioCad.setEmailUsuario(request.getParameter("email"));
        usuarioCad.setSenhaUsuario(request.getParameter("senha"));

        dao.inserirUsuario(usuarioCad);
        response.sendRedirect("index.jsp");
    }
	protected void novaTarefa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		tarefaCad.setNomeTarefa(request.getParameter("tarefa"));
		tarefaCad.setDescricaoTarefa(request.getParameter("descricao"));
		LocalDate dataTarefa = LocalDate.parse(request.getParameter("dataTarefa"));
		tarefaCad.setDataTarefa(dataTarefa);
	
		dao.inserirTarefa(tarefaCad);
		response.sendRedirect("gerTarefas.jsp");
	}
	protected void logarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeUsuario = request.getParameter("nome");
	    String senhaUsuario = request.getParameter("senha");

	    Usuarios usuario = new Usuarios();
	    usuario.setNomeUsuario(nomeUsuario);
	    usuario.setSenhaUsuario(senhaUsuario);

	    dao.conferirLogin(usuario); // Chamada ao método para verificar o login

	    if (usuario.getIdUsuario() != 0) { // Se o usuário existe no banco de dados
	        // Você pode armazenar o usuário em uma sessão para referência posterior
	        request.getSession().setAttribute("usuarioLogado", usuario);
	        response.sendRedirect("gerTarefas.jsp");
	    } else {
	        // Caso contrário, redireciona para a página de login com uma mensagem de erro
	        response.sendRedirect("index.jsp?loginError=true");
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
