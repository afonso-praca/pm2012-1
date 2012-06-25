package model;

import model.entity.Comissao;

/**
 *
 * @author Afonso
 */

public class CalculaComissaoCategoriaUm implements ICalculaComissao {

    @Override
    public void CalculaComissao(Comissao comissao) {

        double valorComissao = 0;
        double valorTotalVendas = comissao.getTotal();

        if (valorTotalVendas > 1800.00){
            valorComissao = ((valorTotalVendas - 1800) * 0.2 ) + 220;
        } else if ((valorTotalVendas > 1000.00) && (valorTotalVendas <= 1800.00)){
            valorComissao = ((valorTotalVendas - 1000) * 0.15 ) +  100;
        } else if ( valorTotalVendas <= 1000.00){
            valorComissao = valorTotalVendas * 0.1;
        }

        comissao.setComissao(valorComissao);
    }
}
