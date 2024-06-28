//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Cliente vini = new Cliente("Vinicius", 333);
        Conta conta = new Conta(vini);
        Conta cc = new ContaCorrente(vini);
        Conta pp = new ContaPoupanca(vini);

        pp.depositar(100.00);
        cc.depositar(200.00);

        cc.extrato();
        pp.extrato();

        System.out.println(cc.getNumero());
        System.out.println(pp.getNumero());

        cc.transferir(pp, 50.0);

        cc.extrato();
        pp.extrato();

    }
}