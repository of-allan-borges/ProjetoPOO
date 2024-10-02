package dominio;

import java.util.Scanner;

public class Voltar{
  public void voltarAtras(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Deseja voltar?");
      System.out.println("1- Sim, ir para o menu principal");
      System.out.println("2- Sim, desejo encerrar a sessão");
      int resposta = scanner.nextInt();

      switch(resposta){
        case 1:
          MenuPrincipal menuPrincipal = new MenuPrincipal();
          menuPrincipal.areaLogin();
          break;

        case 2:
          System.out.println("Leilão encerrado");
          MenuPrincipal menuPrincipal0 = new MenuPrincipal();
          menuPrincipal0.areaLogin();
          break;
      }
  }
}

