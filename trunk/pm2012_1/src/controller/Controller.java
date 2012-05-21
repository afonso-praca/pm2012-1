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
    private static Price[] array_precos;
    private static Sale[] array_vendas;
    private static Seller[] array_vendedores;
    
    //mes e path para saida
    private static String month;
    private static String output;
        
    //functions
    public static void init(String mes, String precos, String vendas, String vendedores, String saida){
        //load files
        array_vendas = LoadFiles.loadVendas(vendas);
        array_precos = LoadFiles.loadPrecos(precos);
        array_vendedores = LoadFiles.loadVendedores(vendedores);
        
        //
        month = mes;
        output = saida;
        
        System.out.println(array_precos[0]);
        System.out.println(array_vendas);
        System.out.println(array_vendedores);
        
        //
        //calc(mes, precos, vendas, vendedores, saida);
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
