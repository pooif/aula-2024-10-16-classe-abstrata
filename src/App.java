public class App {
  public static void main(String[] args) {
    // Padrão de Projeto: Design Pattern: BUILDER
    // Dimensao.nova().largura(50).profundidade(12).altura(34).build();
    // Frete f1 = new Frete(10, 100, 50, 50, 50, 12, 2);

    Dimensao dimensao = new Dimensao(50, 50, 50);
    // Frete f1 = new FretePadrao(10);
    Frete f1 = new FreteSedex(10, dimensao);

    System.out.println(f1.calcularValor());

    Pedido p1 = new Pedido("Teste", 100.0, f1);
    System.out.println(p1.getValorTotal());

  }
}
