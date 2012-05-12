/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pm2012_1;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author PC
 */
public class Main {
    
    //base url
    private static String base_files_url = "src/pm2012_1";
    
    //arrays com os itens carregados
    private static Preco[] precos;
    private static Venda[] vendas;
    private static Vendedor[] vendedores;

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {
        System.out.println("Application Started!!!!");
          
        //load files
        loadVendas(base_files_url + "/vendas.txt");
        loadPrecos(base_files_url + "/precos.txt");
        loadVendedores(base_files_url + "/vendedores.txt");

        //calc and generate output file
        calcCommission();
        buildCommissionFile();
    }

    private static void loadVendas(String vendasFile) {

        BufferedReader vendasReader = null;
        try {
            try {
                vendasReader = new BufferedReader(
                        new FileReader(vendasFile));
                System.out.println(vendasReader.readLine());

            } finally {
                if (vendasReader != null)
                    vendasReader.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void loadVendedores(String vendedoresFile) {

        BufferedReader vendedoresReader = null;
        try {
            try {
                vendedoresReader = new BufferedReader(
                        new FileReader(vendedoresFile));
                System.out.println(vendedoresReader.readLine());

            } finally {
                if (vendedoresReader != null)
                    vendedoresReader.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void loadPrecos(String precosFile) {

        BufferedReader precosReader = null;
        try {
            try {
                precosReader = new BufferedReader(
                        new FileReader(precosFile));
                System.out.println(precosReader.readLine());

            } finally {
                if (precosReader != null)
                    precosReader.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void calcCommission(){

    }

    private static void buildCommissionFile(){

    }

}
