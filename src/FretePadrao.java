public class FretePadrao extends Frete {

  public FretePadrao(int valorBase) {
    super(valorBase); // repassa para o supertipo
  }

  @Override
  public double calcularValor() {
    return valorBase;
  }
}
