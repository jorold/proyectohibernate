package controllers;

import java.util.List;
import models.Dept;
import models.ResumenDepartamento;
import repositories.RepositoryConsultasEspeciales;

public class Controller11ConsultasEspeciales {

    RepositoryConsultasEspeciales repo;

    public Controller11ConsultasEspeciales() {
        this.repo = new RepositoryConsultasEspeciales();
    }

    public String getResumenDepartamento(int id) {
        ResumenDepartamento resumen = this.repo.getResumenDepartamento(id);
        if (resumen == null) {
            return "<h1 style='color:red'>No existe el departamento " + id + "</h1>";
        }
        String html = "<h1>Personas: " + resumen.getPersonas() + "</h1>";
        html += "<h1>Máximo salario: " + resumen.getMaximoSalario() + "</h1>";
        html += "<h1>Mínimo salario: " + resumen.getMinimoSalario() + "</h1>";
        return html;
    }

    public String getOptionsDepartamento() {
        List<Dept> departamentos = this.repo.getDepartamentos();
        String html = "";
        for (Dept dept : departamentos) {
            html += "<option value='" + dept.getDeptNo() + "'>"
                    + dept.getDnombre() + "</option>";
        }
        return html;
    }
}
