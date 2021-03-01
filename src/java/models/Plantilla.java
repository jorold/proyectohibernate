package models;

public class Plantilla implements java.io.Serializable {

    private int empleadoNo;
    private Integer hospitalCod;
    private Integer salaCod;
    private String apellido;
    private String funcion;
    private String turno;
    private Integer salario;

    public Plantilla() {
    }

    public Plantilla(int empleadoNo) {
        this.empleadoNo = empleadoNo;
    }

    public Plantilla(int empleadoNo, Integer hospitalCod, Integer salaCod, String apellido, String funcion, String turno, Integer salario) {
        this.empleadoNo = empleadoNo;
        this.hospitalCod = hospitalCod;
        this.salaCod = salaCod;
        this.apellido = apellido;
        this.funcion = funcion;
        this.turno = turno;
        this.salario = salario;
    }

    public int getEmpleadoNo() {
        return this.empleadoNo;
    }

    public void setEmpleadoNo(int empleadoNo) {
        this.empleadoNo = empleadoNo;
    }

    public Integer getHospitalCod() {
        return this.hospitalCod;
    }

    public void setHospitalCod(Integer hospitalCod) {
        this.hospitalCod = hospitalCod;
    }

    public Integer getSalaCod() {
        return this.salaCod;
    }

    public void setSalaCod(Integer salaCod) {
        this.salaCod = salaCod;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFuncion() {
        return this.funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getTurno() {
        return this.turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Integer getSalario() {
        return this.salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

}
