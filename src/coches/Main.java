package coches;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(" 505060M ", " Dani ", " Lopez ", " Calle inventada ");
        Vehiculo vehiculo = new Vehiculo(" zxl5678 ", " BMW ", " 350 ", " azul ", " gasolina ", 200);
        Venta venta = new Venta(123, LocalDate.now(), cliente, vehiculo, 54454.23, " tarjeta ");

        Cliente cliente2 = new Cliente(" 808080M ", " Javi ", " Martin ", " Calle inventada 2 ");
        Vehiculo vehiculo2 = new Vehiculo(" zxl5452 ", " Mercedes ", " 570 ", " rojo ", " diesel ", 200);
        Venta venta2 = new Venta(123, LocalDate.now().plusDays(1), cliente2, vehiculo2, 54454.23, " tarjeta ");

        System.out.println(venta);
        System.out.println(venta2);

    }
}

