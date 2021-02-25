package models;
// Generated 24-feb-2021 19:24:55 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Emp generated by hbm2java
 */
public class Emp  implements java.io.Serializable {


     private int empNo;
     private String apellido;
     private String oficio;
     private Integer dir;
     private Date fechaAlt;
     private Integer salario;
     private Integer comision;
     private Integer deptNo;

    public Emp() {
    }

	
    public Emp(int empNo) {
        this.empNo = empNo;
    }
    public Emp(int empNo, String apellido, String oficio, Integer dir, Date fechaAlt, Integer salario, Integer comision, Integer deptNo) {
       this.empNo = empNo;
       this.apellido = apellido;
       this.oficio = oficio;
       this.dir = dir;
       this.fechaAlt = fechaAlt;
       this.salario = salario;
       this.comision = comision;
       this.deptNo = deptNo;
    }
   
    public int getEmpNo() {
        return this.empNo;
    }
    
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getOficio() {
        return this.oficio;
    }
    
    public void setOficio(String oficio) {
        this.oficio = oficio;
    }
    public Integer getDir() {
        return this.dir;
    }
    
    public void setDir(Integer dir) {
        this.dir = dir;
    }
    public Date getFechaAlt() {
        return this.fechaAlt;
    }
    
    public void setFechaAlt(Date fechaAlt) {
        this.fechaAlt = fechaAlt;
    }
    public Integer getSalario() {
        return this.salario;
    }
    
    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    public Integer getComision() {
        return this.comision;
    }
    
    public void setComision(Integer comision) {
        this.comision = comision;
    }
    public Integer getDeptNo() {
        return this.deptNo;
    }
    
    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }




}


