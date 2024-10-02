package dominio;

public class Lance {
    private int id;
    private int valorLance;
    private String data;
    private String hora;
    private Usuario usuario;

    public Lance(int id, int valorLance, String data, String hora, Usuario usuario) {
        this.id = id;
        this.valorLance = valorLance;
        this.data = data;
        this.hora = hora;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValorLance() {
        return valorLance;
    }

    public void setValorLance(int valorLance) {
        this.valorLance = valorLance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}


