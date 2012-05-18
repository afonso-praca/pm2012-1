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
    
    //base url
    private static String base_files_url = "src/";
    
    //arrays com os itens carregados
    private static Preco[] precos;
    private static Venda[] vendas;
    private static Vendedor[] vendedores;
    
    //functions
    public static void init(){
        loadFiles lf = new loadFiles();

        //load files
        loadFiles.loadVendas(base_files_url + "resources/vendas.txt");
        loadFiles.loadPrecos(base_files_url + "resources/precos.txt");
        loadFiles.loadVendedores(base_files_url + "resources/vendedores.txt");
    }
}
