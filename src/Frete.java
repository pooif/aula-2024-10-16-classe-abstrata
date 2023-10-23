// duck typing : tipagem pato?

// Classe ABSTRATA (oposto de CONCRETO)
// Um classe abstrata é considerada INCOMPLETA
public abstract class Frete {
  
  // Todos os fretes têm um valor base
  protected final int valorBase; // protected: acessível pelos subtipos

  public Frete(int valorBase) { // obrigação das subclasses de prover
    this.valorBase = valorBase;
  }

  public int getValorBase() {
    return valorBase;
  }

  // declarar a EXISTÊNCIA do método
  // Todo FRETE terá um método chamado calculaValor
  // Como ele calcula o valor? Depende do Frete CONCRETO!
  public abstract double calcularValor(); // assinatura do método
  

  // public double calcularValor() {
  //   switch (tipo) {
  //     case EXPRESSO: {
  //       // lógica
  //       return valorBase + (hora == 12 ? 10 : 5);
  //     }
  //     case PAC: {
  //       // LÓGICA
  //       return valorBase + 2 * peso;
  //     }
  //     case SEDEX: 
  //       return valorBase + (dimensao.getVolume() / 2);
  //     case PADRAO:
  //       return valorBase;
  //     default: // fallback
  //       throw new IllegalStateException();
  //   }
  // }

}





/*
<select id="tipo">
{ for each tipo in Frete.Tipo.Values }
  <option id="{tipo}">{tipo}</option>
{ end for}
</select>
 */
