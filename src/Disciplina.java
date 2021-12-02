import java.util.ArrayList;

public class Disciplina {
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

    public void adicionaDisciplinas(String d) {
        nomeDisciplina.add(d);
    }

    public void removeDisciplinas(int d) {
        for (int i = 0; i <= this.nomeDisciplina.size(); i++) {
            if (this.nomeDisciplina.get(i).equals(d)) {
                this.nomeDisciplina.remove(i);
                this.nota1.remove(i);
                this.nota2.remove(i);
                this.media.remove(i);
                this.mediaFinal.remove(i);
            }
        }
    }

    public void listarDisciplinas(){
        for (int i = 0; i < nomeDisciplina.size(); i++) {
            System.out.println("|| "+i+" - "+this.nomeDisciplina.get(i));
        }
    }

}
