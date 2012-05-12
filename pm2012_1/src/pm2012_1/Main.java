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

    /**
     * @param args the command line arguments
     */
      public static void main(String[] args) {

        //load files
        loadVendas();
        loadPrecos();
        loadVendedores();

        //calc and generate output file
        calcCommission();
        buildCommissionFile();

        System.out.println("Application Started!");
    }

    private static void loadVendas() {

        BufferedReader vendasReader = null;
        try {
            try {
                vendasReader = new BufferedReader(
                        new FileReader("src/pm2012_1/vendas.txt"));
                System.out.println(vendasReader.readLine());

            } finally {
                if (vendasReader != null)
                    vendasReader.close();
            }
        } catch (Exception e) {

        }
    }

    private static void loadVendedores() {

        BufferedReader vendedoresReader = null;
        try {
            try {
                vendedoresReader = new BufferedReader(
                        new FileReader("src/pm2012_1/vendedores.txt"));
                System.out.println(vendedoresReader.readLine());

            } finally {
                if (vendedoresReader != null)
                    vendedoresReader.close();
            }
        } catch (Exception e) {

        }
    }

    private static void loadPrecos() {

        BufferedReader precosReader = null;
        try {
            try {
                precosReader = new BufferedReader(
                        new FileReader("src/pm2012_1/precos.txt"));
                System.out.println(precosReader.readLine());

            } finally {
                if (precosReader != null)
                    precosReader.close();
            }
        } catch (Exception e) {

        }
    }

    private static void calcCommission(){

    }

    private static void buildCommissionFile(){

    }

}
