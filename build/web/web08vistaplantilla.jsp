<!--create or replace view vistaplantilla
as
select plantilla.apellido, plantilla.funcion, plantilla.salario
, hospital.nombre, hospital.telefono
from plantilla
inner join hospital
on plantilla.hospital_cod = hospital.hospital_cod;-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controller" class="controllers.Controller08VistaPlantilla" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Vista plantilla</h1>
        <form method="post">
            <label>Introduzca hospital: </label>
            <input type="text" name="hospital" required/>
            <button class="btn btn-outline-info" type="submit">Buscar plantilla</button>
        </form>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Apellido</th>
                    <th>Oficio</th>
                    <th>Hospital</th>
                    <th>Salario</th>
                    <th>Teléfono</th>                    
                </tr>
            </thead>
            <tbody>
                <%
                String nombre = request.getParameter("hospital");
                if(nombre == null){
                    %>
                    <%=controller.getTablaVistaPlantilla()%>
                    <%
                }else{
                    %>
                    <%=controller.getTablaPlantillaHospital(nombre)%>
                    <%
                }
                %>
            </tbody>
        </table>
    </body>
</html>
