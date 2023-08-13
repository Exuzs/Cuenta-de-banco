public class Banco {
    private Cuenta cuenta1;
    private Cuenta cuenta2;

    public Banco(Cuenta cuenta1, Cuenta cuenta2) {
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    public void realizarTransferenciaEntreCuentas(Cuenta origen, Cuenta destino, double cantidad) {
        if (cantidad <= origen.getSaldoCuenta()) {
            origen.setReintegro(cantidad);
            destino.setIngreso(cantidad);
            System.out.println("Transferencia realizada correctamente.");
        } else {
            System.out.println("Saldo insuficiente para la transferencia.");
        }
    }

    public void imprimirNumeroCuentas() {
        System.out.println("Número de cuenta 1: " + cuenta1.getSaldoCuenta());
        System.out.println("Número de cuenta 2: " + cuenta2.getSaldoCuenta());
    }
}
