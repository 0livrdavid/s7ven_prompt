import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        Usuario user = new Usuario();
        String disc, enter;
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

            switch (opcao) {
                case 1:
                    limpar();
                    System.out.println("Digite o nome da disciplina");
                    disc = input.next();
                    user.adicionaDisciplinas(disc);
                    enter = input.next();
                    break;
                case 2:
                    limpar();
                    user.listarDisciplinas();
                    System.out.println("Digite o número da disciplina a ser adicionado a nota:");
                    disc = input.next();
                    user.adicionaDisciplinas(disc);
                    enter = input.next();
                    break;
                case 3:
                    limpar();
                    user.listarDisciplinas();
                    enter = input.next();
                    break;
                default:
                    break;
            }
        } while (opcao != 0);

        if (opcao == 0) {
            System.out.println("Muito obrigado por usar os nossos serviços!");
        }
    }

    public static void limpar() throws IOException, InterruptedException {
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }
}
