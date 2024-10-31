public class Banco {
    public static void main(String[] args) {
        Conta corrente = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        IConta poupanca1 = new ContaPoupanca();
        //Como contas extendem de conta, que implementa IConta, não problema acima

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        corrente.depositar(1000);
        corrente.imprimirExtrato();
        corrente.transferir(250, corrente);
        corrente.imprimirExtrato();
        corrente.transferir(250, poupanca);
        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

        poupanca1.depositar(100);
        poupanca1.imprimirExtrato();
    }
}
