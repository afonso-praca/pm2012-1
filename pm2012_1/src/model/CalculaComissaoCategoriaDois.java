package model;
 
import model.entity.Comissao;

/**
 *
 * @author Afonso
 */

public class CalculaComissaoCategoriaDois implements ICalculaComissao {

    @Override
    public void CalculaComissao(Comissao comissao) {

        double valorComissao = 0;
        double valorTotalVendas = comissao.getTotal();

        if (valorTotalVendas <= 2000.00){
            valorComissao = (valorTotalVendas * 0.1); 
        } else if ((valorTotalVendas>2000.00) && (valorTotalVendas <= 4000.00)){
            valorComissao = (valorTotalVendas * 0.2);
        }else if ( valorTotalVendas > 4000.00){
            valorComissao = (valorTotalVendas * 0.3);
        }

        comissao.setComissao(valorComissao);
    }
}

