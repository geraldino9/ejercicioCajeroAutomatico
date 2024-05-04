import java.util.Scanner;

public class EjercicioCajeroAutomatico {

    //variable para realizar las lecturas por teclado
    static Scanner lectura = new Scanner(System.in);
    //numero de cuenta
    static int numeroCueta = 12345;
    //numero de identificacion personal
    static int nip=19988;

    public static void main(String[] args) {
        System.out.println("Bienvenido!! \n \n");
        //lee el número de cuenta del ciente
        System.out.print("Ingrese su número de cuenta: ");
        int inNumeroCuenta =lectura.nextInt();

        //lee el número de identificacion personal del cliente
        System.out.print("Ingrese su número de cuenta: ");
        int inNip =lectura.nextInt();

        int opcionesDisponibles=0;

        //valida que el número de cuenta y el únmero de identificación personal si correspondan al cliente
        //aqui se aplican los condicionales y los operadores lógicos
        // en caso de que no cumpla las conodiciones establcidas en el if entra por el else (si no)
        // UNA DE LAS CONDICIONES ES QUE EL NIP INGRESADO (inNip) debe ser un digito de 5 cifraz
        //vara validar que un numero sea de cinco cifras se puede realizar teniendo el cuenta el rango de 10000 a 99999
        if(  numeroCueta == inNumeroCuenta && nip==inNip && (inNip>= 10000 && inNip <= 99999)){
            //aqui imprime el menú de opciones o acciones posibles a realizar
            System.out.print("1 - Ver mi saldo \n 2 - retirar efectivo \n 3 - Depositar fondos \n 4 - Salir \n:");
            opcionesDisponibles = lectura.nextInt();
            if(opcionesDisponibles == 1){
                System.out.println("Ver saldo Disponible del usuario");
            }else if(opcionesDisponibles ==2 ){
                System.out.println("Retirar del saldo disponible del usuario");
            }else if (opcionesDisponibles == 3){
                System.out.println("depositar al saldo del usuario");
            } else if(opcionesDisponibles == 4){
                System.out.println("opcion salir");
            }else{
                System.out.println("opcion invalida");
            }

        }else{
            System.out.println("### LOS DATOS PROPORCIONADOS NO CORRESPONDEN A UN CLIENTE DE NUESTRA ENTIDAD ###");
        }

    }
}
