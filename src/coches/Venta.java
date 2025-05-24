package coches;

import java.time.LocalDate;

public class Venta {
    private int CodigoVenta;
    private LocalDate fechaVenta;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private double precio;
    private String formaDePago;

    public Venta(int codigoVenta, LocalDate fechaVenta, Cliente cliente, Vehiculo vehiculo, double precio, String formaDePago) {
        CodigoVenta = codigoVenta;
        this.fechaVenta = fechaVenta;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.precio = precio;
        this.formaDePago = formaDePago;
    }

    public int getCodigoVenta() {
        return CodigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        CodigoVenta = codigoVenta;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(String formaDePago) {
        this.formaDePago = formaDePago;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "CodigoVenta=" + CodigoVenta +
                ", fechaVenta=" + fechaVenta +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", precio=" + precio +
                ", formaDePago='" + formaDePago + '\'' +
                '}';
    }
}
