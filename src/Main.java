import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        Usuario u1 = new Usuario();


        do {
            System.out.println("SEJA BEM-VINDO AO S7VEN!");
            System.out.println("________________________");
            System.out.println("1 - Abrir nova conta");
            System.out.println("_______________________________");
            System.out.print("Escolha um número para prosseguir: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("");
                    break;
                default:

            }

        }while (opcao != 0);
        if (opcao == 0) {
            System.out.println("Muito obrigado por usar os nossos serviços!");
        }
    }
}
