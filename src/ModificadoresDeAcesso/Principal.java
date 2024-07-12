package ModificadoresDeAcesso;
//Codigo criado em estudo de Romulo Nogueira de Souza na Alura
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.depositar(100);
        System.out.println(c1.getSaldo());

        Conta c2 = new Conta();
        c2.depositar(200);

        c1.transferir(50, c2);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
    }
    /* Classe Principal
       Criando Contas:
       Criamos duas contas (c1 e c2).
       Depositamos 100 na conta c1 e 200 na conta c2.
       Transferência:
       Transferimos 50 da conta c1 para a conta c2.
       Imprimimos os saldos das duas contas para ver o resultado.
     */
     /* Explicação Didática
        Saldo: É o dinheiro que temos no cofrinho.
        Sacar: É tirar dinheiro do cofrinho.
        Depositar: É colocar dinheiro no cofrinho.
        Transferir: É tirar dinheiro do seu cofrinho e colocar
        no cofrinho do seu amigo.
      */

}
