package ModificadoresDeAcesso;
//Codigo criado em estudo de Romulo Nogueira de Souza na Alura
public class Conta {

    private double saldo;

    void sacar(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(double valor, Conta conta) {
        sacar(valor);
        conta.sacar(valor);

         /* Classe Conta
            Saldo:
            Cada conta tem um cofrinho (saldo) onde guardamos o dinheiro.
            Método Sacar:
            O método sacar é como uma chave especial que tira dinheiro do cofrinho.
             Só a própria conta pode usar essa chave.

            Método Depositar:
            O método depositar coloca dinheiro no cofrinho.
            Método Transferir:
            O método transferir tira dinheiro do seu cofrinho (sacar(valor))
            e tenta tirar do cofrinho da outra conta (conta.sacar(valor)).
            Aqui parece que há um erro,
            pois deveria ser conta.depositar(valor) para colocar o
            dinheiro na outra conta.
          */
    }
}
