package controllers;

import java.util.List;
import models.VistaplantillaId;
import repositories.RepositoryVistaPlantilla;

public class Controller08VistaPlantilla {

    RepositoryVistaPlantilla repo;

    public Controller08VistaPlantilla() {
        this.repo = new RepositoryVistaPlantilla();
    }

    public String getTablaVistaPlantilla() {
        List<VistaplantillaId> plantilla = this.repo.getVistaPlantilla();
        String html = "";
        for (VistaplantillaId p : plantilla) {
            html += "<tr>";
            html += "<td>" + p.getApellido() + "</td>";
            html += "<td>" + p.getFuncion() + "</td>";
            html += "<td>" + p.getNombre() + "</td>";
            html += "<td>" + p.getSalario() + "</td>";
            html += "<td>" + p.getTelefono() + "</td>";
            html += "</tr>";
        }
        return html;
    }

    public String getTablaPlantillaHospital(String nombre) {
        List<VistaplantillaId> plantilla = this.repo.getPlantillaHospital(nombre);
        if (plantilla == null) {
            return "<h1 style='color:red'>NO hay empleados en hospital" + nombre + "</h1>";
        }
        String html = "";
        for (VistaplantillaId p : plantilla) {
            html += "<tr>";
            html += "<td>" + p.getApellido() + "</td>";
            html += "<td>" + p.getFuncion() + "</td>";
            html += "<td>" + p.getNombre() + "</td>";
            html += "<td>" + p.getSalario() + "</td>";
            html += "<td>" + p.getTelefono() + "</td>";
            html += "</tr>";
        }
        return html;
    }
}
