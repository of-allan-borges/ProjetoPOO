package dominio;
import java.util.ArrayList;
import java.util.List;

public class ArmazenamentoUsuarios {
    static List<Usuario> usuarios = new ArrayList<>();

    public static void adicionarUsuarioo(Usuario usuario01){
        usuarios.add(usuario01);
    }

    public static Usuario buscarUsuarioPorNome(String nome){
        for (Usuario usuario01 : usuarios) {
            if(usuario01.getNome().equals(nome)) {
                return usuario01;
            }
        }
        return null; //Retorna null se não encontrar o usuário com o nome especifico
    }
}
