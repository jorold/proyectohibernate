<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlleremp" class="controllers.ControllerEmpleados" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Hibernate Page</title>
    </head>
    <body>
        <h1>Empleados</h1>
        <%=controlleremp.getTablaEmpleados()%>
    </body>
</html>
