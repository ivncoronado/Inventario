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
import logica.Consumible;
import logica.Controladora;


@WebServlet(name = "SvConsumible", urlPatterns = {"/SvConsumible"})
public class SvConsumible extends HttpServlet {
    
    Controladora control = new Controladora();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Consumible>listaConsumibles = new ArrayList<Consumible>();
        
        listaConsumibles = control.getConsumibles();
        
        HttpSession misession =request.getSession();
        misession.setAttribute("listaConsumibles", listaConsumibles);
        
        response.sendRedirect("verStock.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String cantidadConsumible = request.getParameter("contidadConsu");
        String marcaConsumible = request.getParameter("marcaConsu");
        String tipoConsumible = request.getParameter("tipoConsu");
        
        control.altaCosumible(cantidadConsumible, marcaConsumible, tipoConsumible);
        response.sendRedirect("index.jsp");
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
