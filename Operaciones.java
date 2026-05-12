public class Operaciones {

    int numOp;

    public void depositar(Cliente cliente, double monto) {

        cliente.saldo = cliente.saldo + monto;

        System.out.println("Deposito realizado ");

    }

    public void giroCCorriente(Cliente cliente, double monto){

        double comision = monto*00.1;
        double total = monto + comision;

        if(cliente.saldo >= total){

            cliente.saldo = cliente.saldo - total;

            System.out.println("Giro realizado");
        } else {

            System.out.println("Saldo insuficiente");
        }
    }

    public void giroAhorro(Cliente cliente,double monto){

        double maximo = cliente.saldo * 0.75;

        if(monto <= maximo){

            cliente.saldo = cliente.saldo - monto;

            System.out.println("Giro realizado");
        } else {

            System.out.println("No puede realizar mas del 75%");
        }
    }

    public void mostrarSaldo(Cliente cliente){

        System.out.println("=====SALDO====");

        System.out.println("Numero Cuenta: " + cliente.numeroCuenta);

        System.out.println("Tipo Cuenta: " + cliente.tipoCuenta);

        System.out.println("Saldo Actual: " + cliente.saldo);
    }
}


