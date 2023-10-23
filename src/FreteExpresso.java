public class FreteExpresso extends Frete {
  private final int hora;

  public FreteExpresso(int valorBase, int hora) {
    super(valorBase);
    this.hora = hora;
  }

  @Override
  public double calcularValor() {
    return super.valorBase + (hora == 12 ? 10 : 5);
  }
}
