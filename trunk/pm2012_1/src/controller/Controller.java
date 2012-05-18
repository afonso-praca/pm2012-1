/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.CalculoComissao;
import model.Preco;
import model.Venda;
import model.Vendedor;

/**
 *
 * @author Afonso
 */
public class Controller {
    
    //arrays com os itens carregados
    private static Preco[] precos;
    private static Venda[] vendas;
    private static Vendedor[] vendedores;
        
    //functions
    public static void init(String mes, String precos, String vendas, String vendedores, String saida){
        //load files
        loadFiles.loadVendas(vendas);
        loadFiles.loadPrecos(precos);
        loadFiles.loadVendedores(vendedores);
    }
    
    public static void calc(String mes, String precos, String vendas, String vendedores, String saida){
        int data;
        int dataentrada = Integer.parseInt(mes);
        int produto = Integer.parseInt(vendas);

        CalculoComissao calcComissao = new CalculoComissao();
        
        for (data = 0; data <= 12; data++){
            if (data == dataentrada){
               produto ++;
               calcComissao.logicaComissao();
            }
        }
   }   
    
    public static void saida (String mes, String precos, String vendas, String vendedores, String saida){
        
        
    }
}
