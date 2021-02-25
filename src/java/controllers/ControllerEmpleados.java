package controllers;

import java.util.List;
import models.Emp;
import repositories.RepositoryEmpleados;

public class ControllerEmpleados {

    RepositoryEmpleados helper;

    public ControllerEmpleados() {
        this.helper = new RepositoryEmpleados();
    }

    public String getTablaEmpleados() {
        List<Emp> empleados = this.helper.getEmpleados();
        String html = "<table class='table table-bordered'>";
        html += "<thead>";
        html += "<tr><th>Empleado nro</th><th>Apellido</th>"
                + "<th>Oficio</th><th>Salario</th><th>Departamento</th></tr>";
        html += "</thead>";
        html += "<tbody>";
        for (Emp e : empleados) {
            html += "<tr>";
            html += "<td>" + e.getEmpNo() + "</td>";
            html += "<td>" + e.getApellido() + "</td>";
            html += "<td>" + e.getOficio() + "</td>";
            html += "<td>" + e.getSalario() + "</td>";
            html += "<td>" + e.getDeptNo() + "</td>";
            html += "</tr>";
        }
        html += "</tbody>";
        html += "</table>";
        return html;

    }
}
