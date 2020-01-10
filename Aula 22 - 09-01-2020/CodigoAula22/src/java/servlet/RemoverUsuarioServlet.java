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

@WebServlet(name="RemoverUsuarioServlet", urlPatterns={"/remover"})
public class RemoverUsuarioServlet extends HttpServlet { 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        RequestDispatcher rd = request.getRequestDispatcher("removerUsuario.jsp");
        rd.forward(request, response);
        
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String email = request.getParameter("email");
        
        Usuario u = UsuarioDAO.buscarUsuarioPorEmail(email);
        
        if (u == null) {
            request.setAttribute("msg", "Usuário com esse e-mail não foi cadastrado.");
        } else {
           boolean removido = UsuarioDAO.removerUsuario(u);
           
           if (removido) {
               request.setAttribute("msg", "Usuário removido com sucesso");
           } else {
               request.setAttribute("msg", "Erro ao remover usuário. Tente novamente");
           }
        }
        
        request.getRequestDispatcher("removerUsuario.jsp").forward(request, response);
        
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
