package com.TEAM_FIVE_SOFTWARE.App_Web.Modelos;

import com.TEAM_FIVE_SOFTWARE.App_Web.Modelos.Empleado;

import javax.persistence.*;

@Entity
@Table(name = "Movimientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;
    private  long monto;
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado usuario;

    public MovimientoDinero() {
    }

    public MovimientoDinero(int id, long monto, String concepto, Empleado empleado) {
        this.id = id;
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = empleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getEmpleado() {
        return usuario;
    }

    public void setEmpleado(Empleado empleado) {
        this.usuario = empleado;
    }
}

