package dominio;
import dominio.PainelLogin;
import dominio.Usuario;
import java.util.Scanner;

import static dominio.ArmazenamentoUsuarios.adicionarUsuarioo;

public class PainelCadastro {

    public void adicionarUsuario(Usuario usuario01){
        Scanner scanner = new Scanner(System.in);

        usuario01.setID(01);
        System.out.println("Tela de cadastro");
        System.out.println("Deseja fazer um cadastro?: ");
        System.out.println("1- Sim");
        System.out.println("2- Não");
        int resposta = scanner.nextInt();
        scanner.nextLine();

        if(resposta==2){
            System.out.println("Sessão encerrada.");
            scanner.close();
        } else {
            System.out.println("Digite o seu nome: ");
            usuario01.setNome(scanner.nextLine());
            

            int emailValido = 0;
            while(emailValido == 0){

                System.out.println("Digite o seu email: ");
                usuario01.setEmail(scanner.nextLine());
                String email = usuario01.getEmail();

                if (isValidEmail(email)) {
                    System.out.println("Email válido: " + usuario01.getEmail());

                    emailValido = 1;
                } else {
                    System.out.println("Email inválido. Por favor, insira um email válido");
                }
            }


            System.out.println("Digite a sua senha");
            usuario01.setSenha(scanner.nextLine());
            System.out.println("Parabéns " + usuario01.getNome() + "! Seu cadastro foi realizado com sucesso, o                                   seu ID é: " + usuario01.getID());
            adicionarUsuarioo(usuario01);
            PainelLogin painelLogin = new PainelLogin();
            painelLogin.loginUsuario(usuario01);
        }


        


    }

    public static boolean isValidEmail(String email) {
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(regex);
    }
}