package dominio;

import java.util.Scanner;

public class MenuComprador {
    private int resposta;
    private Item item;

    public void areaMenuComprador() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Principal");
            System.out.println("1- Mostrar itens leiloados");
            System.out.println("2- Sair");
            resposta = scanner.nextInt();
            scanner.nextLine(); 

            switch (resposta) {
                case 1:
                    if (Catalogo.getInstancia().getItens().isEmpty()) {
                        System.out.println("Não há itens leiloados.");
                    } else {
                        Catalogo.getInstancia().mostrarItens();
                        int qtdItens = Catalogo.getInstancia().getItens().size();
                        Voltar voltar = new Voltar();
                        if (qtdItens != 0) {
                            System.out.println("Itens leiloados: ");
                            Catalogo.getInstancia().mostrarItens();
                            System.out.println("Deseja dar um lance?");
                            System.out.println("1- Sim");
                            System.out.println("2- Não");
                            resposta = scanner.nextInt();
                            if(resposta == 1){
                                Item item = new Item();
                                item.escolherItem();
                            } else {
                                voltar.voltarAtras();
                            }
                        };
                    }
                    break;
                case 2:
                    System.out.println("Sessão encerrada.");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            }
        }
    }

