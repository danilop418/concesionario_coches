package coches;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(" 505060M ", " Dani ", " Lopez ", " Calle inventada ");
        Vehiculo vehiculo = new Vehiculo(" zxl5678 ", " BMW ", " 350 ", " azul ", " gasolina ", 200);
        Venta venta = new Venta(123, LocalDate.now(), cliente, vehiculo, 54454.23, " tarjeta ");

        System.out.println(venta);
    }
}

