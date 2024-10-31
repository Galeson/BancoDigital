public class ContaPoupanca extends Conta {

    public void imprimirExtrato() {
        System.out.println(getNumero());
        System.out.println("Saldo Poupança: " + getSaldo());
    }

}
