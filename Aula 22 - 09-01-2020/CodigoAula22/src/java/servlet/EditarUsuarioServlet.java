package servlet;

import dao.UsuarioDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Usuario;

@WebServlet(name = "EditarUsuarioServlet", urlPatterns = {"/editar"})
public class EditarUsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        int idInt = Integer.parseInt(id);
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Usuario u = new Usuario();
        u.setId(idInt);
        u.setEmail(email);
        u.setSenha(senha);

        boolean atualizado = UsuarioDAO.atualizarUsuario(u);

        if (atualizado) {
            request.setAttribute("msg", "Dados salvos com sucesso");
        } else {
            request.setAttribute("msg", "Erro ao salvar dados. Tente novamente");
        }

        request.setAttribute("usuario", u);
        RequestDispatcher rd = request.getRequestDispatcher("editarUsuario.jsp");
        rd.forward(request, response);
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
