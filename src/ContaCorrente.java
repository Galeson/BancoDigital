public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println(getNumero());
        System.out.println("Saldo Corrente: " + getSaldo());
    }
}
