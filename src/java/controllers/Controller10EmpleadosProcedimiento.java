package controllers;

import java.util.List;
import models.Emp;
import repositories.RepositoryEmpleadosProcedimiento;

public class Controller10EmpleadosProcedimiento {

    RepositoryEmpleadosProcedimiento repo;

    public Controller10EmpleadosProcedimiento() {
        this.repo = new RepositoryEmpleadosProcedimiento();
    }

    public String getTablaEmpleados() {
        List<Emp> empleados = this.repo.getEmpleados();
        String html = "";
        for (Emp emp : empleados) {
            html += "<tr>";
            html += "<td>" + emp.getApellido() + "</td>";
            html += "<td>" + emp.getOficio() + "</td>";
            html += "<td>" + emp.getSalario() + "</td>";
            html += "<td>" + emp.getDeptNo() + "</td>";
            html += "</tr>";
        }
        return html;
    }

    public void modificarSalarioEmpleados(int iddepartamento, int salario) {
        this.repo.modificarSalarioEmpleado(iddepartamento, salario);
    }
}
