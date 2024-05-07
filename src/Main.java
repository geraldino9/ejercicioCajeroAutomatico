import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // ejemplo de usos de las clases, metodos de acceso, constructore y variables de instancia
        ClienteBanco cliente1 = new ClienteBanco();
        cliente1.imprimirDatosCliente();
        cliente1.setNombre("Luis");
        cliente1.setApellido("Castro");
        cliente1.setNip(78564);
        cliente1.setNumeroCueta(44444);
        cliente1.imprimirDatosCliente();

        ClienteBanco cliente2 = new ClienteBanco("Pedro", "Perez",12345,56789);
        cliente2.setSegundoNombre("Juan");
        cliente2.imprimirDatosCliente();

        System.out.println("Numero cuento cliente2 : "+cliente2.getNumeroCueta());





    }
}