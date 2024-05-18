import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    String[] menu = {"Havaiana","Marguerita","Mussarela","Napolitana","Pepperoni","Portuguesa"};
    String[] len = {"Broto","Média","Grande","Gigante"};
    
    System.out.println("---Bem-vindo(à) à Pizzaria do Bruno!---\n Aqui está o nosso cardápio com as pizzas: " + Arrays.toString(menu));
    System.out.println("Aqui estão os tamanhos disponíveis: " + Arrays.toString(len));

    Scanner scan = new Scanner(System.in);
    System.out.println("Quantas pizzas gostaria de pedir?");
    int qpizzas = scan.nextInt();
    
    for (int i = 1; i <= qpizzas; i++) {
      System.out.printf("\nQual o sabor da %dª pizza?\n", i);
      String sabor = scan.next();
      boolean verifsabor = false;
      for (String k : menu) {
        if (sabor.equalsIgnoreCase(k)) {
          verifsabor = true;
          break;
        }
      }
        if (!verifsabor){
          System.out.println("Sabor inválido.");
          continue;
      }
      
      System.out.printf("\nQual o tamanho da %dª pizza?\n", i);
      String tamanho = scan.next();
      boolean veriftamanho = false;
      
      for (String j : len) {
        if (tamanho.equalsIgnoreCase(j)){
          veriftamanho = true;
          double preco = 33.99;
          
          if (tamanho.equals(len[1])){
            preco += 7.00;
          }
          
          if (tamanho.equals(len[2])){
            preco += 14.00;
          }
          
          if (tamanho.equals(len[3])){
            preco += 21.00;
          }
          
          pizza pedidopizza = new pizza(sabor,tamanho,preco);
          System.out.println(pedidopizza.toString());
          break;
        }
      }
      if (!veriftamanho){
        System.out.println("Tamanho inválido.");
    }
  }

    scan.close();
  }
}
