package Clases;

public class Cuenta implements Comparable<Cuenta> {
    private Integer nroCuenta;
    private Double saldo;

    public Cuenta(int nroCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nroCuenta=" + nroCuenta +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public int compareTo(Cuenta o) {
        if (this.nroCuenta.equals(o.getNroCuenta())) {
            return 0;
        } else if (this.nroCuenta > o.getNroCuenta()) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return this.nroCuenta == ((Cuenta)obj).getNroCuenta();
    }
}
