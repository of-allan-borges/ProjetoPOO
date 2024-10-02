import dominio.PainelCadastro;
import dominio.PainelLogin;
import dominio.Usuario;
import dominio.Item;
//import dominio.Catalogo;
import dominio.MenuPrincipal;
import dominio.Voltar;
import dominio.MenuComprador;

public class Main {
    public static void main(String[] args) {
                PainelCadastro painelCadastro = new PainelCadastro();
                //PainelLogin painelLogin = new PainelLogin();
                Usuario usuario01 = new Usuario();
                //MenuPrincipal menuPrincipal = new MenuPrincipal();
               //  MenuComprador menuComprador = new MenuComprador();
                //Voltar voltar = new Voltar();
                // Item item = new Item();

                painelCadastro.adicionarUsuario(usuario01);
                //painelLogin.loginUsuario(usuario01);
                //menuPrincipal.areaLogin();
                // menuComprador.areaMenuComprador();
                // item.darLance(item);
                //voltar.voltarAtras();
            }
        }

