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

        while(option != 4){
            option = reader.nextInt();

            if(option == 1){
                System.out.println(
                        "Saldo atualizado R$ %.2f"
                                .formatted(balance)
                );
            }
            else if(option == 2){

                System.out.println("Valor recebido:");

                double value = reader.nextDouble();

                balance += value;

                System.out.println(
                        "Saldo atualizado R$ %.2f"
                                .formatted(balance)
                );
            }
            else if(option == 3){

                System.out.println(
                        "Informe o valor a transferir:"
                );

                double value = reader.nextDouble();
            }
        }
    }
}