<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="componentes/header.jsp"%>
<%@include file="componentes/bodyp1.jsp"%>
<h1>Alta de Equipos de Cómputo</h1>
<p>Aqui puedes dar de alta los Equipos de cómputo de FMS</p>
<form class="user" action="SvEquipo"method="POST">
    <div class="form-group col">
        <div class="col-sm-6 mb-3 ">
            <input type="text" class="form-control form-control-user" id="tipoEqui" name="tipoEqui"
                   placeholder="Tipo de equipo">
        </div>
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user" id="marcaEqui" name="marcaEqui"
                   placeholder="Marca del equipo">
        </div>
    <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user"
                   id="modeloEqui" name="modeloEqui" placeholder="Modelo del equipo">
          </div>
        <div class="form-group col">
        <div class="col-sm-6 mb-3">
            <input type="text" class="form-control form-control-user"
                   id="serieEqui" name="serieEqui" placeholder="Serie del equipo">
          </div>
    <button class="btn btn-primary btn-user btn-block" type="submit">
        Guardar
    </button>
    <a href="index.jsp" class="btn btn-primary btn-user btn-block">
        Regresar
    </a>
</form>
<%@include file="componentes/bodyf1.jsp"%>
