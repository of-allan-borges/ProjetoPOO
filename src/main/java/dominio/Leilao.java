package dominio;

public class Leilao {
    private int ID;
    private String item;
    private String dataInicio;
    private String dataTermino;
    private int lanceAtual;
    private Usuario usuario;
    private String status;

    public Leilao(int ID, String item, String dataInicio, String dataTermino, int lanceAtual, Usuario usuario, String status) {
        this.ID = ID;
        this.item = item;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.lanceAtual = lanceAtual;
        this.usuario = usuario;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getLanceAtual() {
        return lanceAtual;
    }

    public void setLanceAtual(int lanceAtual) {
        this.lanceAtual = lanceAtual;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


}
