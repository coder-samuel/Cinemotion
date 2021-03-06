package br.com.cinemotion.Entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Samuel
 */
@Entity
public class Entrada {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    private Date fechaHoraFuncion;
    private Date fechaHoraVenta;
    @OneToOne(cascade = CascadeType.ALL)
	@JoinColumn//(name="")
    private Funcion funcion;
    private BigDecimal precioCobrado;
    private int ticketNro; // Singleton posible

    /**
     * Constructor por Defecto
     */
    public Entrada() {
    }

    /**
     * Este constructor incluye todos los atributos de la clase Entrada
     * 
     * @param fechaHoraFuncion
     * @param fechaHoraVenta
     * @param funcion
     * @param precioCobrado
     * @param ticketNro 
     */
    public Entrada(Date fechaHoraFuncion, Date fechaHoraVenta, Funcion funcion, BigDecimal precioCobrado, int ticketNro) {
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.fechaHoraVenta = fechaHoraVenta;
        this.funcion = funcion;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
    }
    
    // A continuación se listan todos los métodos de seteo 
    // de cada atributo de la clase

    public Date getFechaHoraFuncion() {
        return fechaHoraFuncion;
    }

    public void setFechaHoraFuncion(Date fechaHoraFuncion) {
        this.fechaHoraFuncion = fechaHoraFuncion;
    }

    public Date getFechaHoraVenta() {
        return fechaHoraVenta;
    }

    public void setFechaHoraVenta(Date fechaHoraVenta) {
        this.fechaHoraVenta = fechaHoraVenta;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public BigDecimal getPrecioCobrado() {
        return precioCobrado;
    }

    public void setPrecioCobrado(BigDecimal precioCobrado) {
        this.precioCobrado = precioCobrado;
    }

    public int getTicketNro() {
        return ticketNro;
    }

    public void setTicketNro(int ticketNro) {
        this.ticketNro = ticketNro;
    }
    
}
