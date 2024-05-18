public class pizza implements order {

  private String sabor;
  private String tamanho;
  private double preco;

  pizza(String sabor, String tamanho, double preco) {
    this.sabor = sabor;
    this.tamanho = tamanho;
    this.preco = preco;
  }

  public String toString() {
    return "\nPizza: " + sabor + "\nTamanho: " + tamanho + "\nPreço: " + preco + " R$";
  }
}
