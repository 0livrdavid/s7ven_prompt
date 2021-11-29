import java.util.ArrayList;

public class Usuario {
    // ATRIBUTOS
    private String email;
    private String senha;
    ArrayList<Disciplina> disciplinas = new ArrayList<>();

    // CONSTRUTORES
    public Usuario() {
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    // GET E SET
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void adicionaDisciplinas(Disciplina d) {
        disciplinas.add(d);
    }

    public void removeDisciplinas(Disciplina d) {
        for (int i = 0; i >= disciplinas.size(); i++) {
            if (disciplinas.get(i).getNomeDisciplina().equals(d)) {
                disciplinas.remove(i);
            }
        }
    }

    // METODOS

}
