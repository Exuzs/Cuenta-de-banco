public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Titular1", 1000.0);
        Cuenta cuenta2 = new Cuenta("Titular2", 500.0);

        Banco banco = new Banco(cuenta1, cuenta2);

        banco.realizarTransferenciaEntreCuentas(cuenta1, cuenta2, 200.0);
        banco.imprimirNumeroCuentas();
    }
}

