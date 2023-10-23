public class Pedido {
  
  private String produto;
  private Double valor;
  private Frete frete; // agnóstico de Frete

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

  public Double getValorTotal() {
                  // chamada polimórfica ao calculaValor
    return valor + frete.calcularValor();
  }
}
