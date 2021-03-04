<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controller" class="controllers.Controller11ConsultasEspeciales" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Consultas Especiales</h1>
        <form method="post">
            <!--<label>Número departamento</label>
            <input type="text" name="cajanumero" required/>
            <button type="submit">Mostrar resumen</button>-->
            <label>Seleccione departamento</label>
            <select name="cajanumero">
                <%=controller.getOptionsDepartamento()%>
            </select>
            <button type="submit">ver</button>
        </form>
        <hr/>
        <%
            String dato = request.getParameter("cajanumero");
            if(dato != null){
                int id = Integer.parseInt(dato);
                %>
                <%=controller.getResumenDepartamento(id)%>
                <%
            }
        %>
    </body>
</html>
