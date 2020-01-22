package controller;

import dao.TarefaDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Tarefa;
import model.Usuario;

@WebServlet(name = "ExcluirTarefaServlet", urlPatterns = {"/excluir"})
public class ExcluirTarefaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Usuario u = (Usuario) session.getAttribute("usuarioLogado");

        String id = request.getParameter("id");
        int idInt = Integer.parseInt(id);

        Tarefa t = new Tarefa();
        t.setId(idInt);
        t.setIdUsuario(u.getId());

        boolean excluida = TarefaDAO.excluir(t);

        if (excluida) {
            request.setAttribute("msg", "Tarefa excluída com sucesso");
        } else {
            request.setAttribute("msg", "Erro ao excluir tarefa. Tente novamente");
        }

        request.getRequestDispatcher("home").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

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
