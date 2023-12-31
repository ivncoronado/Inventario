<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/header.jsp"%>
<%@include file="componentes/bodyp1.jsp"%>


<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Usuarios</h1>
    <p class="mb-4">Aqui podra visualizar el listado de usuarios</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Usuarios</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Nombre de Usuario</th>

                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Nombre de Usuario</th>
                        </tr>
                    </tfoot>
                    <%
                        List<Usuario>listaUsuarios = (List)request.getSession().getAttribute("listaUsuarios");
                    %>
                    
                    <tbody>
                        <% for(Usuario usu : listaUsuarios){%>
                        <tr>
                            <td><%=usu.getId_usuario() %></td>
                            <td><%=usu.getNombreUsu()%></td>
                            <td><%=usu.getApellidoUsu()%></td>
                            <td><%=usu.getNombreUsuario()%></td>   
                        </tr>
                        <%}%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>
<!-- /.container-fluid -->





<%@include file="componentes/bodyf1.jsp"%>
