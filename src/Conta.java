public abstract class Conta implements IConta {

    protected static int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL_NUMERO = 1;
    //Protected: classe filha pode acessar
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected String nome;

    //Constructor
    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL_NUMERO++;
        //Aumenta número da conta na própria classe
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

    public String getNome() {
        return nome;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor); //Coolll
    }
}
