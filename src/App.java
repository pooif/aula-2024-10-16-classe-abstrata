
// subtipagem/herança
class Pessoa {
  String nome;
}

class PessoaFisica extends Pessoa {
  String cpf;
}

class PessoaJuridica extends Pessoa {
  String cnpj;
}
// herança do estado,
// herança do comportamento =>
//   polimorfismo por subtipagem (sobrescrita/overwrite)


public class App {
  public static void main(String[] args) {
    
    Frete qualquer = new Frete() { // classe anônima
      @Override
      public double calcularValor() {
        return 0.0;
      }
    };

    Frete pac = new Pac(10);

    Frete sedex = new Sedex(10, 10, 10);

    Frete expresso = new Expresso(12); // hora

    System.out.println(qualquer.calcularValor()); // 
    System.out.println(pac.calcularValor()); // ?
    //System.out.println(sedex.calcularValor()); // ?

    Pedido p = new Pedido("Teclado RK64", 500.0, qualquer);
    System.out.println(p.getValorTotal());
    
    p.setFrete(pac);
    System.out.println(p.getValorTotal());
    
    p.setFrete(sedex);
    System.out.println(p.getValorTotal());

    p.setFrete(expresso);
    System.out.println(p.getValorTotal());

  }
}




// Polimorfismo ad-hoc (sobrecarga / overload)
// Texto.preencher("asdsa", "-");
// Texto.preencher("asdsa", "-", 10);
class Texto {

  String preencher(String t, String c) {
    return null;
  }

  String preencher(String t, String c, int qtd) {
    return null;
  }
}

/*
 * Single Reponsibility Principle (Princípio da Responsabilidade Única)
 * Open/Close Principle (Princípio Aberto/Fechado)
 * Liskov Substitution Principle (Princípio da Substituição de Liskov)
 * Interface Segregation Principle (Princípio da Segregação da Interface)
 * Dependency Inversion Principle (Princípio da Inversão da Dependência)
 * 
 * Todo sistema deve estar aberto à extensão, mas fechado à modificação.
 * 
 */


