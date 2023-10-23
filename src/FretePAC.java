public final class FretePAC extends Frete {
  private final int peso;

  public FretePAC(int valorBase, int peso) {
    super(valorBase);
    this.peso = peso;
  }

  @Override
  public double calcularValor() {
    return valorBase + 2 * peso;
  }
}
