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

@WebServlet(name="ProcurarUsuarioServlet", urlPatterns={"/procurar"})
public class ProcurarUsuarioServlet extends HttpServlet { 

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        RequestDispatcher rd = request.getRequestDispatcher("procurarUsuario.jsp");
        rd.forward(request, response);
        
    } 

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String email = request.getParameter("email");
        
        Usuario u = UsuarioDAO.buscarUsuarioPorEmail(email);
        
        if (u == null) {
            // Usuário não existe
            
            request.setAttribute("erro", "Usuário com esse e-mail não cadastrado");
            
            RequestDispatcher rd = request.getRequestDispatcher("procurarUsuario.jsp");
            rd.forward(request, response);
        } else {
            // Usuário existe
            request.setAttribute("usuario", u);
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/editarUsuario.jsp");
            rd.forward(request, response);
        }
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
