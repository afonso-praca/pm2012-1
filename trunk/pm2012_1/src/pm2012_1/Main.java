/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pm2012_1;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.Date;

/**
 *
 * @author PC
 */
public class Main {
    
    //base url
    private static String base_files_url = "src/";
    
    //arrays com os itens carregados
    private static Preco[] precos;
    private static Venda[] vendas;
    private static Vendedor[] vendedores;

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        System.out.println("Application Started!!!!!");

        loadFiles lf = new loadFiles();

        //load files
        lf.loadVendas(base_files_url + "resources/vendas.txt");
        lf.loadPrecos(base_files_url + "resources/precos.txt");
        lf.loadVendedores(base_files_url + "resources/vendedores.txt");

        //calc and generate output file
        calcCommission();
        buildCommissionFile();
    }


    private static void calcCommission(){

    }

    private static void buildCommissionFile(){

    }

}
