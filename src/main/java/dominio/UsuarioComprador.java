package dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioComprador extends Pessoa {
    private int saldo;
    private int id;

    public UsuarioComprador(int idade, String nome, String estadoCivil) {
        super(idade, nome, estadoCivil);
        this.saldo = 0;
        this.id = 0;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

   
}
