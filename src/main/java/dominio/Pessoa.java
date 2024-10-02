package dominio;

public abstract class Pessoa{
  private int idade;
  private String nome;
  private String estadoCivil;

  public Pessoa(int idade, String nome, String estadoCivil){
    this.idade = idade;
    this.nome = nome;
    this.estadoCivil = estadoCivil;
  }

  public Pessoa(){
    
  }

  public int getIdade(){
    return idade;
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public String getEstadoCivil(){
    return estadoCivil;
  }

  public void setEstadoCivil(String estadoCivil){
    this.estadoCivil = estadoCivil;
  }
}

