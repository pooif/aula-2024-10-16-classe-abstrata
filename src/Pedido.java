public class Pedido {
  
  private String produto;
  private Double valor; // BigDecimal
  private Frete frete;

  public Pedido(String produto, Double valor, Frete frete) {
    this.produto = produto;
    this.valor = valor;
    this.frete = frete;
  }

  public String getProduto() {
    return produto;
  }

  public Double getValor() {
    return valor;
  }

  public Frete getFrete() {
    return frete;
  }

  public void setFrete(Frete frete) {
    this.frete = frete;
  }

  public Double getValorTotal() {
    // polimórfico
    // getFrete().calcularValorTotal()
    return this.getValor() + this.getFrete().calcularValor();
  }
}
