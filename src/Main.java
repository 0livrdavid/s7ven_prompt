import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Usuario user = new Usuario();
        String disc;
        int opcao;

        System.out.println("SEJA BEM-VINDO AO S7VEN!");
        do {
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
                    System.out.println("Digite o nome da disciplina");
                    disc = input.nextLine();
                    user.adicionaDisciplinas(disc);
                    break;
                case 2:
                    user.listarDisciplinas();
                    System.out.println("Digite o número da disciplina a ser adicionado a nota:");
                    disc = input.nextLine();
                    user.adicionaDisciplinas(disc);
                    break;
                case 3:
                    user.listarDisciplinas();
                    break;
                default:
                    break;

            }
        } while (opcao != 0);

        if (opcao == 0) {
            System.out.println("Muito obrigado por usar os nossos serviços!");
        }
    }
}
