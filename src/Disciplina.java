import java.util.ArrayList;
import java.util.Scanner;

public class Disciplina {
    Scanner input = new Scanner(System.in);

    ArrayList<String> nomeDisciplina = new ArrayList<>();
    ArrayList<Float> nota1 = new ArrayList<>();
    ArrayList<Float> nota2 = new ArrayList<>();
    ArrayList<Float> media = new ArrayList<>();
    ArrayList<Float> mediaFinal = new ArrayList<>();

    public Disciplina() {
    }

    public Disciplina(ArrayList<String> nomeDisciplina, ArrayList<Float> nota1, ArrayList<Float> nota2, ArrayList<Float> media, ArrayList<Float> mediaFinal) {
        this.nomeDisciplina = nomeDisciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.mediaFinal = mediaFinal;
    }

    public ArrayList<String> getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(ArrayList<String> nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public ArrayList<Float> getNota1() {
        return nota1;
    }

    public void setNota1(ArrayList<Float> nota1) {
        this.nota1 = nota1;
    }

    public ArrayList<Float> getNota2() {
        return nota2;
    }

    public void setNota2(ArrayList<Float> nota2) {
        this.nota2 = nota2;
    }

    public ArrayList<Float> getMedia() {
        return media;
    }

    public void setMedia(ArrayList<Float> media) {
        this.media = media;
    }

    public ArrayList<Float> getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(ArrayList<Float> mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public void adicionaDisciplinas() {
        System.out.println("Digite o nome da disciplina");
        String disc = input.nextLine();
        nomeDisciplina.add(disc);
        nota1.add((float) 0.00);
        nota2.add((float) 0.00);
        media.add((float) 0.00);
        mediaFinal.add((float) 0.00);
    }

    public void removeDisciplinas() {
        int disc;

        do {
            System.out.println("Digite o id da disciplina a ser removida:");
            disc = input.nextInt();
            if (disc >= 0 && disc < this.nomeDisciplina.size()) {
                break;
            }
        } while (true);

        System.out.println("Tem certeza que deseja continuar? (S ou N)");
        String resp = input.next();

        if (resp == "s") {
            this.nomeDisciplina.remove(disc);
            this.nota1.remove(disc);
            this.nota2.remove(disc);
            this.media.remove(disc);
            this.mediaFinal.remove(disc);
        }
    }

    public void listarDisciplinas(){
        for (int i = 0; i < nomeDisciplina.size(); i++) {
            if (this.mediaFinal.get(i) != 0.00) {
                System.out.println("| ID: "+i+" - "+this.nomeDisciplina.get(i) + " | " + this.nota1.get(i) + " | " + this.nota2.get(i) + " | " + this.media.get(i) + " | " + this.mediaFinal.get(i));
            } else {
                System.out.println("| ID: "+i+" - "+this.nomeDisciplina.get(i) + " | " + this.nota1.get(i) + " | " + this.nota2.get(i) + " | " + this.media.get(i) + " |");
            }
        }
    }

    public void adicionaNota(){
        int disc;

        do {
            System.out.println("Digite o id da disciplina a ser adicionado a nota:");
            disc = input.nextInt();
            if (disc >= 0 && disc < this.nomeDisciplina.size()) {
                break;
            }
        } while (true);

        System.out.println("Digite a primeira nota:");
        Float nota1 = input.nextFloat();
        System.out.println("Digite a segunda nota (coloque '0' se ainda não tiver o valor):");
        Float nota2 = input.nextFloat();

        this.nota1.set(disc,nota1);
        this.nota2.set(disc,nota2);

        float media_nota = ((this.nota1.get(disc)*2)+(this.nota2.get(disc)*3))/5;
        this.media.set(disc,media_nota);

        if (this.nota2.get(disc) != 0.00 && this.media.get(disc) < 70) {
            float media_final_nota = (250-(this.media.get(disc)*3))/2;
            this.mediaFinal.set(disc,media_final_nota);
        }
    }

    public void maioresNotas(){
        String maior_nota1 = "0.00";
        String maior_nota2 = "0.00";
        String maior_semestre = "0.00";

        for (int i = 0; i < this.nomeDisciplina.size(); i++) {
            if (Float.parseFloat(maior_nota1) < this.nota1.get(i)) {
                maior_nota1 = this.nomeDisciplina.get(i)+": ";
                maior_nota1 += String.valueOf(this.nota1.get(i));
            }
            if (Float.parseFloat(maior_nota2) < this.nota2.get(i)) {
                maior_nota1 = this.nomeDisciplina.get(i)+": ";
                maior_nota2 += String.valueOf(this.nota2.get(i));
            }
            if (Float.parseFloat(maior_semestre) < this.media.get(i)) {
                maior_semestre = this.nomeDisciplina.get(i)+": ";
                maior_semestre += String.valueOf(this.media.get(i));
            }
        }

        System.out.println("1º Bimestre -> " + maior_nota1);
        System.out.println("2º Bimestre -> " + maior_nota1);
        System.out.println("Média Semestral -> " + maior_nota1);
    }

    public void apagarBanco() {
        System.out.println("Tem certeza que deseja continuar? (S ou N)");
        String resp = input.next();

        if (resp == "s") {
            for (int i = 0; i < nomeDisciplina.size(); i++) {
                this.nomeDisciplina.remove(i);
                this.nota1.remove(i);
                this.nota2.remove(i);
                this.media.remove(i);
                this.mediaFinal.remove(i);
            }
        }
    }

    public void limpatela() {
        for (int i=0; i<100; i++) {
            System.out.println();
        }
    }


    public void adicionarDados() {
        nomeDisciplina.add("FUNDAMENTOS MATEMÁTICOS PARA COMPUTAÇÃO");
        nota1.add((float) 100.00);
        nota2.add((float) 0.00);
        media.add((float) 0.00);
        mediaFinal.add((float) 0.00);

        nomeDisciplina.add("PARADIGMA DE ORIENTAÇÃO À OBJETO");
        nota1.add((float) 100.00);
        nota2.add((float) 0.00);
        media.add((float) 0.00);
        mediaFinal.add((float) 0.00);

        nomeDisciplina.add("PROJETO INTEGRADOR: Processos de Arquitetura e Análise de Software");
        nota1.add((float) 96.00);
        nota2.add((float) 0.00);
        media.add((float) 0.00);
        mediaFinal.add((float) 0.00);

        nomeDisciplina.add("ANÁLISE E PROJETO DE PRODUTOS DE SOFTWARE");
        nota1.add((float) 73.00);
        nota2.add((float) 0.00);
        media.add((float) 0.00);
        mediaFinal.add((float) 0.00);

        nomeDisciplina.add("SISTEMAS OPERACIONAIS");
        nota1.add((float) 86.00);
        nota2.add((float) 0.00);
        media.add((float) 0.00);
        mediaFinal.add((float) 0.00);
    }
}
