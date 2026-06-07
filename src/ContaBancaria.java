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
    }
}