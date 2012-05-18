/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
}
