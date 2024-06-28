
public class Conta implements IConta{
    protected int agencia;
    protected int numero;
    private double saldo;
    protected Cliente cliente;

    private static int AGENCIA = 0001;
    private static int NUMERO = 0001;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA;
        this.numero = NUMERO++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void transferir(IConta contaDestino, double valor) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void extrato() {
        System.out.printf("Saldo %s%n", saldo);
    }
}
