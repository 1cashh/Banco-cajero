import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Cliente c1 = new Cliente("111", "Corriente", 1001, 500000);
        Cliente c2 = new Cliente("222", "Corriente", 1002, 300000);
        Cliente c3 = new Cliente("333", "Ahorro", 1003, 700000);

        Operaciones op = new Operaciones();

        int opcion;

        do {

            System.out.println("=====Cajero====");
            System.out.println("1.Depositar");
            System.out.println("2.Giro Cuenta Corriente");
            System.out.println("3.Giro Cuenta Ahorro ");
            System.out.println("4.Mostrar Saldo");
            System.out.println("5.Salir");
            System.out.println("Ingrese opcion");

            opcion = leer.nextInt();

            Cliente clienteSeleccionado = null;

            System.out.println("Seleccione cliente");
            System.out.println("1.Cliente 1");
            System.out.println("2.Cliente 2");
            System.out.println("3.CLiente 3");

            int cliente = leer.nextInt();

            switch (cliente){

                case 1:
                    clienteSeleccionado = c1;
                    break;

                case 2:
                    clienteSeleccionado = c2;
                    break;

                case 3:
                    clienteSeleccionado = c3;
                    break;

                default:
                    System.out.println("Cliente invalido");
            }

            switch (opcion) {

                case 1:

                    System.out.println("Monto a depositar ");
                    double deposito = leer.nextDouble();

                    op.depositar(clienteSeleccionado,deposito);

                    break;

                case 2:

                    System.out.println("Seleccione cliente corriente");
                    System.out.println("1.Cliente 1");
                    System.out.println("2.Cliente 2");

                    int clienteCorriente = leer.nextInt();

                    if(clienteCorriente == 1) {

                        clienteSeleccionado = c1;

                    } else if (clienteCorriente == 2) {

                        clienteSeleccionado = c2;
                    }

                    if (clienteSeleccionado.tipoCuenta.equals("Corriente")) {

                        System.out.println("Monto a girar");
                        double giro1 = leer.nextDouble();

                        op.giroCCorriente(clienteSeleccionado,giro1);
                    }else{
                        System.out.println("La Cuenta No es Corriente");
                    }

                    break;

                case 3:

                    if(clienteSeleccionado.tipoCuenta.equals("Ahorro")) {

                        System.out.println("Monto a girar");
                        double giro2 = leer.nextDouble();

                        op.giroAhorro(c3, giro2);
                    }else{
                        System.out.println("La cuenta no es Ahorro");
                    }

                    break;

                case 4:

                    op.mostrarSaldo(clienteSeleccionado);
                    break;

                case 5:

                    System.out.println("Saliendo...");
                    break;

            }
        }while (opcion !=5);
    }
}
