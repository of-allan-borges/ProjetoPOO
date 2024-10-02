package dominio;
import java.util.Scanner;
import dominio.Voltar;
import java.util.ArrayList;

public class Item {
    private int id;
    private String name;
    private String descricao;
    private String categoriaStr;
    private String condicaoStr;
    private int lanceAtual;
    private int lanceMinimo;

    public Item() {}

    public Item(int id, String name, String descricao, String categoriaStr, String condicaoStr, int lanceAtual, int lanceMinimo) {
        this.id = id;
        this.name = name;
        this.descricao = descricao;
        this.categoriaStr = categoriaStr;
        this.condicaoStr = condicaoStr;
        this.lanceAtual = lanceAtual;
        this.lanceMinimo = lanceMinimo;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoriaStr;
    }

    public void setCategoria(String categoriaStr) {
        this.categoriaStr = categoriaStr;
    }

    public String getCondicao() {
        return condicaoStr;
    }

    public void setCondicao(String condicaoStr) {
        this.condicaoStr = condicaoStr;
    }

    public int getLanceAtual() {
        return lanceAtual;
    }

    public void setLanceAtual(int lanceAtual) {
        this.lanceAtual = lanceAtual;
    }

    public int getLanceMinimo() {
        return lanceMinimo;
    }

    public void setLanceMinimo(int lanceMinimo) {
        this.lanceMinimo = lanceMinimo;
    }

   

    public void adicionarItem(Item item) {
        Catalogo catalogo = Catalogo.getInstancia();
        catalogo.adicionarItem(item);
    }

    public void adicionarItemAoCatalogo(Item item) {
        Scanner scanner = new Scanner(System.in);
        Catalogo catalogo = Catalogo.getInstancia();

        System.out.println("Adicionando Item ao Catálogo");
        System.out.println("Digite o nome do item: ");
        String nome = scanner.nextLine();
        System.out.println("Digite a descrição do item: ");
        String descricao = scanner.nextLine();
        System.out.println("Escolha a categoria do item: ");
        System.out.println("1 - Eletrônico");
        System.out.println("2 - Roupa");
        System.out.println("3 - Alimento");
        System.out.println("4 - Outros");
        int categoria = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        String categoriaStr;
        switch (categoria) {
            case 1:
                categoriaStr = "Eletrônico";
                break;
            case 2:
                categoriaStr = "Roupa";
                break;
            case 3:
                categoriaStr = "Alimento";
                break;
            case 4:
                System.out.println("Digite a categoria do item: ");
                categoriaStr = scanner.nextLine();
                break;
            default:
                categoriaStr = "Outros";
        }

        System.out.println("Digite a condição do item: ");
        System.out.println("1 - Novo");
        System.out.println("2 - Seminovo");
        System.out.println("3 - Outro");
        int condicao = scanner.nextInt();
        scanner.nextLine();

        String condicaoStr;

        switch (condicao) {
            case 1:
                condicaoStr = "Novo";
                break;
            case 2:
                condicaoStr = "Seminovo";
                break;
            case 3:
                System.out.println("Digite a condição do item: ");
                condicaoStr = scanner.nextLine();
                break;
            default:
                condicaoStr = "Outros";
        }

        System.out.println("Digite o lance mínimo do item: ");
        int lanceMinimo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        // Criando o objeto Item com as informações coletadas
        Item item0 = new Item(0, nome, descricao, categoriaStr, condicaoStr, 0, lanceMinimo);

        // Adicionando o item0 ao catálogo
        catalogo.adicionarItem(item0);
        item0.setID(catalogo.getItens().size());

        System.out.println("Item adicionado com sucesso ao catálogo.");
    }

    public void escolherItem() {
        Catalogo catalogo = Catalogo.getInstancia();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um item digitando seu ID: ");
        int itemEscolhido = scanner.nextInt();
        for (Item item0 : catalogo.getItens()) {
            if (item0.getID() == itemEscolhido) {
                String nomeItem = item0.getName();
                System.out.println("Item escolhido: " + nomeItem);
                darLance(item0);
                break;
            }
        }
    }

    public void darLance(Item itemEscolhido) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu lance: ");
        int lance = scanner.nextInt();
        int lanceMaior;

        if (lance < itemEscolhido.getLanceAtual()) {
            lanceMaior = itemEscolhido.getLanceAtual();
        } else {
            lanceMaior = itemEscolhido.getLanceMinimo();
        }

        if (lance > lanceMaior) {
            itemEscolhido.setLanceAtual(lance);
            System.out.println("Lance registrado: " + lance);
            Voltar voltar = new Voltar();
            voltar.voltarAtras();
        } else {
            System.out.println("Lance inválido. O lance deve ser maior que o lance de " + lanceMaior);
            System.out.println("Deseja dar outro lance?");
            System.out.println("1- Sim");
            System.out.println("2- Não");
            int resposta = scanner.nextInt();
            if (resposta == 1) {
                darLance(itemEscolhido);
            } else {
                System.out.println("Lance não registrado.");
                Voltar voltar = new Voltar();
                voltar.voltarAtras();
            }
        }
    }
}
