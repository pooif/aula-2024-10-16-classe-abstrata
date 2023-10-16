public class Frete2 {
  
  private final int valorBase;
  private final int peso;
  private final int largura;
  private final int altura;
  private final int profundidade;
  private final int hora;
  private final int tipo;

  public Frete2(int valorBase, int peso, int largura, int altura, int profundidade, int hora, int tipo) {
    this.valorBase = valorBase;
    this.peso = peso;
    this.largura = largura;
    this.altura = altura;
    this.profundidade = profundidade;
    this.hora = hora;
    this.tipo = tipo;
  }


  public double calcularValor() {
    switch (tipo) {
      case 1: // EXPRESSO
        return valorBase + (hora == 12 ? 10 : 5);
      case 2:
        return valorBase + 2 * peso; // PAC
      case 3: 
        return this.valorBase + ((largura * altura * profundidade) / 2); // SEDEX
      default:
      return valorBase;
    }
  }
}
