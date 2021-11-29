import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        Usuario u1 = new Usuario();


        do {
            System.out.println("SEJA BEM-VINDO AO S7VEN!");
            System.out.println("________________________");
            System.out.println("1 - Adicionar Nova Disciplina");
            System.out.println("2 - Adicionar Notas a Disciplina");
            System.out.println("3 - Listar Todas Disciplinas");
            System.out.println("4 - Informar Maiores Notas");
            System.out.println("_______________________________");
            System.out.print("Escolha um número para prosseguir: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("");
                    break;
                default:

            }
        } while (opcao != 0);
        if (opcao == 0) {
            System.out.println("Muito obrigado por usar os nossos serviços!");
        }
    }
}
