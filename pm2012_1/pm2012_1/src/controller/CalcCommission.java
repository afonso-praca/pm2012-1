/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Price;
import model.Sale;
import model.Seller;

/**
 *
 * @author Marina Vinhaes
 */
public class CalcCommission {
    private Sale sale;
    private Price price;
    private Seller seller;
    
    Sale s = new Sale();
    Price p = new Price();
    Seller sel = new Seller();
    
    
    public double logicaComissao(String precosFile, String vendasFile) throws CommissionException{
        double vendas; 
        double comissao = 0;
    
        System.out.println ("Seller:" + s);
        vendas = ((s.getQuantidadePA() * p.getPrecoPA()) + (s.getQuantidadePB() * p.getPrecoPB()) + (s.getQuantidadePC() * p.getPrecoPC()));
        System.out.println("Vendas" + vendas);
        
        System.out.println("Tenho Categoria!" + sel.getCategoria());
        if (sel.getCategoria() == 1 ){  
            System.out.println("Categoria é ..." + sel.getCategoria());
                if (vendas < 1800.00){
                   comissao = ((vendas - 1800) * 0.2 ) + 240;
                }else if((1000.00 < vendas) && (vendas < 1800.00)){
                   comissao = ((vendas - 1000) * 0.15 ) +  100;
                }else if ( vendas < 1000.00){
                   comissao = 0;
                }
                
                System.out.println("Comissao Total Categoria 1:" + comissao);
                
        }else if (sel.getCategoria() == 2 ){
                if (vendas <= 2000.00){
                   comissao = (vendas * 0.1); 
                }else if(( 2000.00 < vendas) && (vendas <= 4000.00)){
                   comissao = (vendas * 0.2);
                }else if ( vendas >= 4000.00){
                   comissao = (vendas * 0.3);
                }
                
                System.out.println("Comissao Total Categoria 2:" + comissao);
        
        }else {
              throw new CommissionException("Comissao deve ser da Categoria 1 ou Categoria2");
        }
        return vendas;
    }

}
