import java.util.Random;

public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = generarNumeroCuenta();
    }

    public void setIngreso(double cantidad) {
        saldoDeCuenta += cantidad;
    }

    public void setReintegro(double cantidad) {
        if (cantidad <= saldoDeCuenta) {
            saldoDeCuenta -= cantidad;
        } else {
            System.out.println("Saldo insuficiente para el reintegro.");
        }
    }

    public double getSaldoCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta() {
        return "Titular: " + nombreDelTitular + "\nNúmero de cuenta: " + numeroDeCuenta + "\nSaldo: " + saldoDeCuenta;
    }

    private long generarNumeroCuenta() {
        Random random = new Random();
        return Math.abs(random.nextLong());
    }
}
