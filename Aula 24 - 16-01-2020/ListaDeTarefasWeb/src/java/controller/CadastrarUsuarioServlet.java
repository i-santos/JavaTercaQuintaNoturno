package controller;

import dao.UsuarioDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

@WebServlet(name = "CadastrarUsuarioServlet", urlPatterns = {"/cadastrar"})
public class CadastrarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/cadastro.jsp");
        dispatcher.forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Processar o cadastro de um novo usuário
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
        // Instanciar uma classe modelo (Usuario)
        Usuario u = new Usuario();
        u.setEmail(email);
        u.setSenha(senha);
        
        boolean cadastrado = UsuarioDAO.inserir(u);
        
        if (cadastrado) {
            request.getRequestDispatcher("WEB-INF/cadastroSucesso.jsp").forward(request, response);
        } else {
            request.setAttribute("erro", "Erro ao cadastrar usuário");
            request.getRequestDispatcher("WEB-INF/cadastro.jsp").forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
