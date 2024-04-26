package exercicio04;

public class ContaBancaria {
    
    private Double saldo;

    public ContaBancaria (Double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("O valor do depósito deve ser positivo!");
        }
    }

    public void sacar(Double valor) throws SaldoInsuficienteException {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
