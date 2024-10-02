package dominio;

import java.util.Scanner;

public class PainelLogin {
    public void loginUsuario(Usuario usuario01){
        Scanner scanner = new Scanner(System.in);

        int tentativaLogin = 0;
        
        while(tentativaLogin == 0){
            System.out.println("Tela de login");

            System.out.println("Já possui uma conta? ");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            int resposta = scanner.nextInt();
            scanner.nextLine();

            if(resposta == 1){
                 System.out.println("Digite o seu nome cadastrado: ");
                                    String nome = scanner.nextLine();


                                Usuario usuario = 
                 ArmazenamentoUsuarios.buscarUsuarioPorNome(nome);

                                if(usuario != null){
                                    int tentativaSenha = 0;
                                    tentativaLogin = 1;

                                    while(tentativaSenha == 0){
                                        System.out.println("Usuario encontrado. Digite a sua senha: ");
                                        String senha = scanner.nextLine();

                                        if(usuario.getSenha().equals(senha)){
                                            System.out.println("Login bem-sucedido. Bem-vindo, " + usuario01.getNome() + "!");
                                            tentativaSenha = 1;
                                            MenuPrincipal menuPrincipal = new MenuPrincipal();
                                            menuPrincipal.areaLogin();
                                        } else {
                                            System.out.println("Senha incorreta. Tente novamente.");
                                        }
                                    }
                                } else {
                                    System.out.println("Usuário não encontrado. Por favor, verifique o nome de usuário e tente novamente!");
                                }
                            } else if(resposta == 2){

                                System.out.println("Por favor, cadastre-se antes de fazer login.");
                            PainelCadastro painelCadastro = new PainelCadastro();
                            Usuario usuario02 = new Usuario();
                            painelCadastro.adicionarUsuario(usuario02);
                    
            }
            } 

            
        }
        
}
