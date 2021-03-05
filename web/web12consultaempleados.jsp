<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controller" class="controllers.Controller12ConsultaEmpleados" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consulta Empleados</h1>
        <form method="post" class="form-inline">
            <label>Introducir oficio: </label>
            <select name="oficio">
                <%=controller.getOptionsOficios()%>
            </select>
            <!--<input type="text" name="oficio"/>-->
            <button class="btn btn-outline-info" type="submit">Ver datos</button>
        </form>
        <%
        String oficio = request.getParameter("oficio");
        if(oficio != null){
            %>
            <table class="table table table-bordered">
                <thead>
                    <tr>
                        <th>Apellido</th>
                        <th>Oficio</th>
                        <th>Salario</th>
                        <th>Salario Anual</th>
                        <th>Salario Total</th>
                    </tr>
                </thead>
                <tbody>
                    <%=controller.getTablaEmpleadosOficio(oficio)%>
                </tbody>
            </table>
            <%
        }
        %>
    </body>
</html>
