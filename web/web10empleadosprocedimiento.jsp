<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controller" class="controllers.Controller10EmpleadosProcedimiento" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String dato = request.getParameter("iddepartamento");
        if(dato != null){
            int iddepartamento = Integer.parseInt(dato);
            String data = request.getParameter("salario");
            int salario = Integer.parseInt(data);
            controller.modificarSalarioEmpleados(iddepartamento, salario);
        }
        %>
        <h1>Incremento salario empleados</h1>
        <form method="post" class="form-group">
            <label>Id Departamento: </label>
            <input type="text" name="iddepartamento" required/>
            <label>Incremento salario: </label>
            <input type="text" name="salario" required/>
            <button class="btn btn-outline-info" type="submit">Modificar salario</button>
        </form>
        <table class="table table-bordered table-dark">
            <thead>
                <tr>
                    <th>Apellido</th>
                    <th>Oficio</th>
                    <th>Salario</th> 
                    <th>Departamento</th>
                </tr>
            </thead>
            <tbody>
                <%=controller.getTablaEmpleados()%>
            </tbody>
        </table>
    </body>
</html>
