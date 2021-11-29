import java.util.ArrayList;

public class Disciplina {
    ArrayList<String> nomeDisciplina = new ArrayList<>();
    ArrayList<Float> nota1 = new ArrayList<>();
    ArrayList<Float> nota2 = new ArrayList<>();
    ArrayList<Float> media = new ArrayList<>();
    ArrayList<Float> mediaFinal = new ArrayList<>();

    public void adicionarNotas(Disciplina d){
        for (int i=0; i <= disciplinas.size(); i++){
            if (disciplinas.get(i).getNomeDisciplina().equals(d)) {
                System.out.print("Digite a primeira nota:");
                disciplinas.get(i).setNota1(entrada.nextFloat());
                System.out.print("Digite a segunda nota:");
                disciplinas.get(i).setNota2((entrada.nextFloat()));
            }
        }
    }

    public void statusNotas(){

    }

}
