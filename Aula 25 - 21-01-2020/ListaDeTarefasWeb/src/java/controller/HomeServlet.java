package controller;

import dao.TarefaDAO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Tarefa;
import model.Usuario;

@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        Usuario u = (Usuario) session.getAttribute("usuarioLogado");

        ArrayList<Tarefa> tarefas = TarefaDAO.buscarTarefasDoUsuario(u);

        u.setTarefas(tarefas);

        request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();

        Usuario u = (Usuario) session.getAttribute("usuarioLogado");

        String acao = request.getParameter("acao");
        String[] idTarefas = request.getParameterValues("tarefas");

        boolean erro = false;
        if (acao.equals("finalizar")) {

            for (String id : idTarefas) {

                Tarefa t = new Tarefa();
                int idInt = Integer.parseInt(id);
                t.setId(idInt);
                t.setIdUsuario(u.getId());

                boolean finalizada = TarefaDAO.finalizar(t);

                if (!finalizada) {
                    erro = true;
                }
            }

        } else if (acao.equals("excluir")) {

            for (String id : idTarefas) {

                Tarefa t = new Tarefa();
                int idInt = Integer.parseInt(id);

                t.setId(idInt);
                t.setIdUsuario(u.getId());

                boolean excluida = TarefaDAO.excluir(t);

                if (!excluida) {
                    erro = true;
                }
            }
        }
        
        if (erro) {
            request.setAttribute("msg", "Erro ao " + acao + " alguma tarefa");
        } else {
            request.setAttribute("msg", "Todas as tarefas foram processadas com sucesso");
        }

        // Pegar a lista atualizada
        ArrayList<Tarefa> tarefas = TarefaDAO.buscarTarefasDoUsuario(u);

        u.setTarefas(tarefas);

        request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);

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
