import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {

        String name = "Gabriel Martins";
        String account = "corrente";
        double balance = 5000;
        Scanner reader = new Scanner(System.in);
        int option = 0;

        System.out.println("""
                *************************************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$: %.2f
                *************************************
                """.formatted(name, account, balance));

        System.out.println("""
        Digite a opção que deseja:

        1 - Consultar saldo
        2 - Receber valor
        3 - Transferir valor
        4 - Sair
        """);
    }
}