package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    Combo combo;


    public void criarCombo(int codigo) {
        switch (codigo) {

            case 1:
                combo = new Combo(
                        new Burger("Cheese Burger", 10.50),
                        new Bebida("Refrigerante", 5.00),
                        new Sobremesa("Sorvete", 3.00)
                );
                break;
            case 2:
                combo = new Combo(
                        new Burger("Cheddar Bacon", 12.00),
                        new Bebida("Suco", 6.50),
                        new Sobremesa("Pudim", 8.00)
                );
                break;
            default:
                System.out.println("Código inválido");
        }
    }

    public void exibirItens() {
        if (combo == null)
            System.out.println("Combo inválido");
        for (ItemCombo item : combo.getItens()) {
            System.out.printf("%s - R$ %.2f\n",item.getNome(),item.getPreco());
        }
    }

    public double getPrecoTotal() {
        if(combo==null){
            return 0.0;
        }
        return combo.getPrecoTotal();
    }
}
