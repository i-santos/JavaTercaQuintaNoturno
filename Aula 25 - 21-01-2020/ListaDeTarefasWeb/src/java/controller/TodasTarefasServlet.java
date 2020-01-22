package controller;

import dao.TarefaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Tarefa;

@WebServlet(name = "TodasTarefasServlet", urlPatterns = {"/todasTarefas"})
public class TodasTarefasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        ArrayList<Tarefa> tarefas = TarefaDAO.buscarTarefas();

        for (Tarefa t : tarefas) {

            out.println(
                    "id:" + t.getId()
                    + ",titulo:" + t.getTitulo()
                    + ",finalizada:" + t.isFinalizada()
                    + ",idUsuario:" + t.getIdUsuario()
                    +";"
            );

        }
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
