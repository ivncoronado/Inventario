/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
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
import logica.Equipo;


@WebServlet(name = "SvEquipo", urlPatterns = {"/SvEquipo"})
public class SvEquipo extends HttpServlet {

    Controladora control = new Controladora();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Equipo>listaEquipos = new ArrayList<Equipo>();
        
        listaEquipos = control.getEquipos();
        
        HttpSession misession =request.getSession();
        misession.setAttribute("listaEquipos", listaEquipos);
        
        response.sendRedirect("verEquipos");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String tipoEquipo = request.getParameter("tipoEqui");
        String marcaEquipo = request.getParameter("marcaEqui");
        String modeloEquipo = request.getParameter("modeloEqui");
        String serieEquipo = request.getParameter("serieEqui");
        
        control.altaEquipo(tipoEquipo, marcaEquipo, modeloEquipo, serieEquipo);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
