public interface IConta {
    public void depositar(double valor);
    public void sacar(double valor);
    public void transferir(IConta contaDestino, double valor);
    public void extrato();
}
