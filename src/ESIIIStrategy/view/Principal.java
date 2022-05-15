package ESIIIStrategy.view;

import ESIIIStrategy.controller.Imposto;
import ESIIIStrategy.controller.ImpostoSaoPaulo;
import ESIIIStrategy.model.Propriedade;
import ESIIIStrategy.model.PropriedadeBuilder;

public class Principal {
  public static void main(String[] args) {
    Propriedade propriedade = PropriedadeBuilder.builder()
        .addAreaTotal(10000)
        .addNumeroComodos(5)
        .get();

    Imposto impostoStrategy = new ImpostoSaoPaulo();
    // IImposto impostoStrategy = new ImpostoBeloHorizonte();
    // IImposto impostoStrategy = new ImpostoCuritiba();
    // IImposto impostoStrategy = new ImpostoPortoAlegre();

    System.out.println(impostoStrategy.calcularImposto(propriedade));

  }
}