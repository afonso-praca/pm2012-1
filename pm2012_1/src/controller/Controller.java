/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.Price;
import model.Sale;
import model.Seller;

/**
 *
 * @author Afonso
 */
public class Controller {
    
    //arrays com os itens carregados
    private static Price[] precos;
    private static Sale[] vendas;
    private static Seller[] vendedores;
        
    //functions
    public static void init(String mes, String precos, String vendas, String vendedores, String saida){
        //load files
        LoadFiles.loadVendas(vendas);
        LoadFiles.loadPrecos(precos);
        LoadFiles.loadVendedores(vendedores);
        
    }
    
    public static void calc(String mes, String precos, String vendas, String vendedores, String saida){
        int data;
        int dataentrada = Integer.parseInt(mes);
        //int produto = Integer.parseInt(vendas);
        
        CalcCommission calcComissao = new CalcCommission();
        
        for (data = 0; data <= 12; data++){
            if (data == dataentrada){
                try {
                    calcComissao.logicaComissao(precos,vendas);
                } catch (CommissionException ex) {
                    ex.getMessage();
                }
            }
        }
   }   
    
    public static void saida (String mes, String precos, String vendas, String vendedores, String saida){
        
        
    }
}
