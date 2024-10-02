package dominio;

public class Pagamento {
    private int id;
    private int valor;
    private String metodoPagamento;
    private String dataPagamento;
    private String horaPagamento;
    private Usuario usuarioComprador;

    public Pagamento(int id, int valor, String metodoPagamento, String dataPagamento, String horaPagamento, Usuario usuarioComprador) {
        this.id = id;
        this.valor = valor;
        this.metodoPagamento = metodoPagamento;
        this.dataPagamento = dataPagamento;
        this.horaPagamento = horaPagamento;
        this.usuarioComprador = usuarioComprador;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public String getHoraPagamento() {
        return horaPagamento;
    }

    public void setHoraPagamento(String horaPagamento) {
        this.horaPagamento = horaPagamento;
    }

    public Usuario getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(Usuario usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }
}
