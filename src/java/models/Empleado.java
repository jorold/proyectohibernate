package models;

public class Empleado {

    private String apellido;
    private String oficio;
    private int salario;
    private int salarioanual;
    private int salariototal;

    public Empleado() {
    }

    public Empleado(String apellido, String oficio, int salario, int anual, int total) {
        this.apellido = apellido;
        this.oficio = oficio;
        this.salario = salario;
        this.salarioanual = anual;
        this.salariototal = total;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalarioanual() {
        return salarioanual;
    }

    public void setSalarioanual(int salarioanual) {
        this.salarioanual = salarioanual;
    }

    public int getSalariototal() {
        return salariototal;
    }

    public void setSalariototal(int salariototal) {
        this.salariototal = salariototal;
    }
}
