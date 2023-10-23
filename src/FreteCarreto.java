public abstract class FreteCarreto extends Frete {

  protected final int comissao;

  public FreteCarreto(int valorBase, int comissao) {
    super(valorBase);
    this.comissao = comissao;
  }

}
