package dominio;

import java.util.Scanner;

public class MenuPrincipal {
    private int resposta;
    private Item item;

    public void areaLogin() {

        Scanner scanner = new Scanner(System.in);

        // Menu Principal
        while (true) {

            System.out.println("Como deseja entrar?");
            System.out.println("1- Comprador");
            System.out.println("2- Vendedor");
            System.out.println("3- Sair");
            int tipoUsuario = scanner.nextInt();
            scanner.nextLine();

            if(tipoUsuario == 1){
                MenuComprador menuComprador = new MenuComprador();
                menuComprador.areaMenuComprador();
            } else if(tipoUsuario == 2){
                System.out.println("Menu Principal");
                    System.out.println("1- Adicionar um item ao leilão");
                    System.out.println("2- Mostrar itens leiloados");
                    System.out.println("3- Sair");
                    resposta = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner

                    switch (resposta) {
                        case 1:
                            Item item = new Item();
                            item.adicionarItemAoCatalogo(item);
                            break;
                        case 2:
                            if (Catalogo.getInstancia().getItens().isEmpty()) {
                                System.out.println("Não há itens leiloados.");
                            } else {
                                Catalogo.getInstancia().mostrarItens();
                            }
                            break;
                        case 3:
                            System.out.println("Sessão encerrada.");
                            return;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                } else if(tipoUsuario == 3){
                    System.out.println("Sessão encerrada.");
                    PainelLogin loginUsuario = new PainelLogin();
                    Usuario usuario01 = new Usuario();
                    loginUsuario.loginUsuario(usuario01);
                        break;
                    }
                }
            }

            
            
    }

