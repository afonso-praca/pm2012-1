/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marina Vinhaes
 */
public class CalculoComissao{

    private Venda v;
    private Preco p;
    private Vendedor vend;
    
    public void logicaComissao(){
        double vendas = 0;
        double comissao = 0;
    
        vendas = ((v.getQuantidadePA() * p.getPrecoPA()) + (v.getQuantidadePB() * p.getPrecoPB()) + (v.getQuantidadePC() * p.getPrecoPC()));
        
        if (vend.getCategoria() == 1 ){         
                if (vendas < 1800.00){
                   comissao = ((vendas - 1800) * 0.2 ) + 240;
                }else if((1000.00 < vendas) && (vendas < 1800.00)){
                   comissao = ((vendas - 1000) * 0.15 ) +  100;
                }else if ( vendas < 1000.00){
                   comissao = 0;
                }
                
                System.out.println("Comissao Total Categoria 1:" + comissao);
                
        }else if (vend.getCategoria() == 2 ){
                if (vendas <= 2000.00){
                   comissao = (vendas * 0.1); 
                }else if(( 2000.00 < vendas) && (vendas <= 4000.00)){
                   comissao = (vendas * 0.2);
                }else if ( vendas >= 4000.00){
                   comissao = (vendas * 0.3);
                }
                
                System.out.println("Comissao Total Categoria 2:" + comissao);
        
        }else {
        
                System.out.println("Erro! Entre com a Categoria 1 ou Categoria 2");
        }
    }
}

