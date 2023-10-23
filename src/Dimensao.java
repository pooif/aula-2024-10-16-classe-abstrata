public final class Dimensao { // Objeto de Valor

  private final int largura;
  private final int altura;
  private final int profundidade;

  public Dimensao(int largura, int altura, int profundidade) {
    this.largura = largura;
    this.altura = altura;
    this.profundidade = profundidade;
  }

  public int getAltura() {
    return altura;
  }

  public int getLargura() {
    return largura;
  }

  public int getProfundidade() {
    return profundidade;
  }

  public int getVolume() { // coesão!
    return (largura * altura * profundidade);
  }

}
