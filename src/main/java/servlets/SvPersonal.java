package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Personal;

@WebServlet(name = "SvPersonal", urlPatterns = {"/SvPersonal"})
public class SvPersonal extends HttpServlet {

    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Personal> listaPersonal = new ArrayList<Personal>();

        listaPersonal = control.getPersonal();

        HttpSession misession = request.getSession();
        misession.setAttribute("listaPersonal", listaPersonal);

        response.sendRedirect("verPersonal.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String nombrePersonal = request.getParameter("nombrePers");
        String apellidoPersonal = request.getParameter("apellidoPers");
        String departamentoPersonal = request.getParameter("departamentoPers");
        String correoPersonal = request.getParameter("correoPers");

        control.crearPersonal(nombrePersonal, apellidoPersonal, departamentoPersonal, correoPersonal);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
