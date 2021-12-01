import java.util.ArrayList;
import java.util.Scanner;

public class Usuario extends Disciplina {
    // ATRIBUTOS
    private String email;
    private String senha;

    Scanner entrada = new Scanner(System.in);

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

    public void setEmail(String email) { this.email = email; }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
