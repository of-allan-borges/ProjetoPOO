package dominio;
import java.util.Scanner;

public class Usuario extends Pessoa {
    Scanner scanner = new Scanner(System.in);

    private int id;
    private String email;
    private String senha;

    public Usuario(int idade, String nome, String estadoCivil, int                      id, String email, String senha) {
        super(idade, nome, estadoCivil);
        
        this.id = id;
        this.email = email;
        this.senha = senha;
    
    }

    public Usuario(){
        super();
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

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

    

}
