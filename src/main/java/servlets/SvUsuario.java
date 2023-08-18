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
import logica.Usuario;

@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {
    
    Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario>listaUsuarios = new ArrayList<Usuario>();
        
        listaUsuarios = control.getUsuarios();
        
        HttpSession misession =request.getSession();
        misession.setAttribute("listaUsuarios", listaUsuarios);
        
        System.out.println("Usuario" + listaUsuarios.get(0));
        response.sendRedirect("verUsuarios.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String nombreUsuario = request.getParameter("usuarioUsu");
        String apellidoUsuario = request.getParameter("apellidoUsu");
        String nombreUsu = request.getParameter("nombreUsu");
        String contraseniaUsuario = request.getParameter("contrasenia");
        
        control.crearUsuario(nombreUsu, apellidoUsuario, nombreUsuario, contraseniaUsuario);
        response.sendRedirect("index.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
