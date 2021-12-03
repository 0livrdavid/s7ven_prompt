import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner input = new Scanner(System.in);
        Usuario user = new Usuario();
        String disc, enter;
        int opcao;

        ArrayList<String> vet1 = new ArrayList<>();
        ArrayList<Float> vet2 = new ArrayList<>();
        ArrayList<Float> vet3 = new ArrayList<>();
        ArrayList<Float> vet4 = new ArrayList<>();
        ArrayList<Float> vet5 = new ArrayList<>();





        System.out.println("SEJA BEM-VINDO AO S7VEN!");
        do {
            System.out.println("________________________________");
            System.out.println("1 - Adicionar Nova Disciplina");
            System.out.println("2 - Adicionar Notas a Disciplina");
            System.out.println("3 - Listar Todas Disciplinas");
            System.out.println("4 - Informar Maiores Notas");
            System.out.println("5 - Zerar Banco");
            System.out.println("9 - Adicionar dados");
            System.out.println("________________________________");
            System.out.print("Escolha um número para prosseguir: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    user.adicionaDisciplinas();
                    user.limpatela();
                    break;
                case 2:
                    user.limpatela();
                    user.listarDisciplinas();
                    user.adicionaNota();
                    user.limpatela();
                    break;
                case 3:
                    user.limpatela();
                    user.listarDisciplinas();
                    break;
                case 4:
                    user.limpatela();
                    user.maioresNotas();
                    user.listarDisciplinas();
                    break;
                case 5:
                    user.limpatela();
                    user.apagarBanco();
                    break;
                case 9:
                    user.limpatela();
                    user.adicionarDados();
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
