package dominio;

import java.util.ArrayList;

public class Catalogo {
    private static Catalogo instancia;
    private ArrayList<Item> itens;

    private Catalogo() {
        itens = new ArrayList<>();
    }

    public static Catalogo getInstancia() {
        if (instancia == null) {
            instancia = new Catalogo();
        }
        return instancia;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void mostrarItens() {
        Catalogo catalogo = Catalogo.getInstancia();
        ArrayList<Item> itens = catalogo.getItens();
        for (Item item : itens) {
            System.out.print(item.getName());
            System.out.println(" id: " + item.getID());
        }
    }
}