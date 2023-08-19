<%@page import="logica.Personal"%>
<%@page import="logica.Personal"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/header.jsp"%>
<%@include file="componentes/bodyp1.jsp"%>


<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Personal</h1>
    <p class="mb-4">Aqui podra visualizar el listado de personal</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Personal</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Departamento</th>
                            <th>Correo</th>
                            <th style=" width:210px">Acción </th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Nombre</th>
                            <th>Apellido</th>
                            <th>Departamento</th>
                            <th>Correo</th>
                            <th style=" width:210px">Acción </th>
                        </tr>
                    </tfoot>
                    <%
                        List<Personal> listaPersonal = (List) request.getSession().getAttribute("listaPersonal");
                    %>
                    <tbody>
                        <% for (Personal pers : listaPersonal ) {%>
                        <tr>
                            <td><%=pers.getId() %> </td>
                            <td> <%=pers.getNombrePers()  %> </td>
                            <td> <%=pers.getApellidoPers() %></td>
                            <td><%=pers.getDepartamentoPers() %></td>
                            <td><%=pers.getCorreoPers() %></td>
                            <td style="display: flex; width: 230px;">
                                <form name="eliminar" action="SvElimPersonal" method="POST">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px;">
                                        <i class=" fas fa-trash-alt"></i> Eliminar
                                    </button>
                                    <input type="hidden" name="id" value="<%=pers.getId()%>">
                                </form>
                                <form name="editar" action="SvEditPersonal" method="POST">
                                    <button type="submit" class="btn btn-primary btn-user btn-block" style="background-color: red; margin-right: 5px;">
                                        <i class=" fas fa-pencil-alt"></i> Editar
                                    </button>
                                    <input type="hidden" name="id" value="<%=pers.getId()%>">
                                </form>
                            </td>
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
