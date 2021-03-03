<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controller" class="controllers.Controller09Procedimiento" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String dato = request.getParameter("cajaiddoctor");
        if(dato != null){
            int iddoctor = Integer.parseInt(dato);
            String especialidad = request.getParameter("especialidad");
            controller.modificarEspecialidadDoctor(iddoctor, especialidad);
        }
        %>
        <h1>Procedimiento almacenados</h1>
        <form method="post" class="form-group">
            <label>Id Doctor: </label>
            <input type="text" name="cajaiddoctor" required/>
            <label>Nueva especialidad: </label>
            <input type="text" name="especialidad" required/>
            <button class="btn btn-outline-info" type="submit">Modificar datos</button>
        </form>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Apellido</th>
                    <th>Especialidad</th>                                        
                </tr>
            </thead>
            <tbody>
                <%=controller.getTablaDoctores()%>
            </tbody>
        </table>
    </body>
</html>
