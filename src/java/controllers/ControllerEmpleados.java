package controllers;

import java.util.List;
import models.Emp;
import repositories.RepositoryEmpleados;

public class ControllerEmpleados {

    RepositoryEmpleados repo;

    public ControllerEmpleados() {
        this.repo = new RepositoryEmpleados();
    }

    public String getTablaEmpleados() {
        List<Emp> empleados = this.repo.getEmpleados();
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

    public String getEmpleadosOficio(String oficio) {
        List<Emp> empleados = this.repo.buscarEmpleadosOficio(oficio);
        if (empleados == null) {
            return "<h1 style='color:red'>No existen datos del oficio: " + oficio + "</h1>";
        }
        String html = "<ul>";
        for (Emp emp : empleados) {
            html += "<li>" + emp.getApellido() + "</li>";
        }
        html += "</ul>";
        return html;
    }

}
