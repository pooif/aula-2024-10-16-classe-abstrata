public class FreteSedex extends Frete {

  // private final int largura;
  // private final int altura;
  // private final int profundidade;
  private final Dimensao dimensao;

  public FreteSedex(int valorBase, Dimensao dimensao) {
    super(valorBase);
    this.dimensao = dimensao;
  }

  @Override
  public double calcularValor() {
    return valorBase + (dimensao.getVolume() / 2);
  }
}
