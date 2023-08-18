<%@page import="logica.Equipo"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/header.jsp"%>
<%@include file="componentes/bodyp1.jsp"%>


<div class="container-fluid">

    <!-- Page Heading -->
    <h1 class="h3 mb-2 text-gray-800">Ver Equipos</h1>
    <p class="mb-4">Aqui podra visualizar el listado de equipos</p>

    <!-- DataTales Example -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Equipos</h6>
        </div>
        <div class="card-body">
            <div class="table-responsive">
                <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Tipo de quipo</th>
                            <th>Marca</th>
                            <th>modelo</th>
                        </tr>
                    </thead>
                    <tfoot>
                        <tr>
                            <th>Id</th>
                            <th>Tipo de quipo</th>
                            <th>Marca</th>
                            <th>modelo</th>
                        </tr>
                    </tfoot>
                    <%
                    List<Equipo>listaEquipos = (List)request.getSession().getAttribute("listaEquipos");
                    %>
                                        <tbody>
                        <% for(Equipo equip : listaEquipos){%>
                        <tr>
                            <td><%=equip.getId_equipo() %></td>
                            <td><%=equip.getTipoEquipo() %></td>
                            <td><%=equip.getMarcaEquipo() %></td>
                            <td><%=equip.getModeloEquipo() %></td> 
                            <td><%=equip.getSerieEquipo()%></td>
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
