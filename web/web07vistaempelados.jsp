<!--create or replace view vistaempleados
as
select emp.apellido, emp.salario, emp.salario * 12 as anual
, emp.oficio, to_char(fecha_alt, 'dd " de " month " de " yyyy') as fechaalta
, dept.dnombre as departamento, dept.loc as localidad
from emp
inner join dept
on emp.dept_no = dept.dept_no;-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controller" class="controllers.Controller07VistaEmpleados" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Vista empleados</h1>
        <form method="post">
            <label>Introduzca localidad: </label>
            <input type="text" name="localidad" required/>
            <button type="submit">Buscar empleados</button>
        </form>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Apellido</th>
                    <th>Oficio</th>
                    <th>Departamento</th>
                    <th>Fecha alta</th>
                    <th>Localidad</th>
                    <th>Salario</th>
                    <th>Salario anual</th>
                </tr>
            </thead>
            <tbody>
                <%
                String localidad = request.getParameter("localidad");
                if(localidad == null){
                //dibujamos todos los datos
                %>
                <%=controller.getTablaVistaEmpleados()%>
                <%
                }else{
                //dibujamos los datos de la búsqueda
                %>
                <%=controller.getTablaEmpleadosLocalidad(localidad)%>
                <%
                }
                %>                
            </tbody>
        </table>
    </body>
</html>
