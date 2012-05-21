/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import model.Price;
import model.Sale;
import model.Seller;

/**
 *
 * @author PC
 */
public class LoadFiles {

    
    public LoadFiles() {
        
    }

    public static Sale[] loadVendas(String vendasFile) {

        Sale[] vendas = new Sale[3];
        BufferedReader vendasReader = null;
        String[] str_date = new String[3];
        try {
            try {
                vendasReader = new BufferedReader(
                        new FileReader(vendasFile));

                String str;
                String aux;
                int i = 0;
                while ((str = vendasReader.readLine()) != null) {
                    //System.out.println(str);
                    String[] str_array = str.split(";");

                    str_date = str_array[0].split("/");
                    aux = str_date[1];

                    Sale venda = new Sale(aux,
                            (str_array[1]),
                            Integer.parseInt(str_array[2]),
                            Integer.parseInt(str_array[3]),
                            Integer.parseInt(str_array[4]));
                    vendas[i] = venda;
                    System.out.println(venda.toString());
                }
                

                // for (Venda v: vendas) {
                //   System.out.println(v.toString());
                //}

            } finally {
                if (vendasReader != null) {
                    vendasReader.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return vendas;
    }

    public static Seller[] loadVendedores(String vendedoresFile) {





        Seller[] vendedores = new Seller[3];
        BufferedReader vendedoresReader = null;
        
        try {
            try {
                vendedoresReader = new BufferedReader(
                        new FileReader(vendedoresFile));

                String str;
                
                int i = 0;
                while ((str = vendedoresReader.readLine()) != null) {
                    //System.out.println(str);
                    String[] str_Text = str.split(";");

                     Seller vendedor = new Seller((str_Text[0]),(str_Text[1]), Integer.parseInt(str_Text[2]));

                    vendedores[i] = vendedor;
                    System.out.println(vendedor.toString());
                }

                // for (Venda v: vendas) {
                //   System.out.println(v.toString());
                //}

            } finally {
                if (vendedoresReader != null) {
                    vendedoresReader.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return vendedores;
    }
    
    public static Price[] loadPrecos(String precosFile) {

    Price[] precos = new Price[2];
    BufferedReader precosReader = null;
    String[] str_date2 = new String[3];
        
        
        try {
            try {
                precosReader = new BufferedReader(
                        new FileReader(precosFile));

                String str2;
                String aux2;
                
                int i = 0;
                while ((str2 = precosReader.readLine()) != null) {
                    //System.out.println(str);
                    String[] str_Text2 = str2.split(";");
                    str_date2 = str_Text2[0].split("/");
                    aux2 = str_date2[1];

                    String a = str_Text2[1].replaceAll(",",".");
                    String b = str_Text2[2].replaceAll(",",".");
                    String c = str_Text2[3].replaceAll(",",".");
                    
                    Price preco = new Price(aux2, Double.parseDouble(a), Double.parseDouble(b), Double.parseDouble(c));

                    precos[i] = preco;
                    System.out.println(preco.toString());
                }

                // for (Venda v: vendas) {
                //   System.out.println(v.toString());
                //}

            } finally {
                if (precosReader != null) {
                    precosReader.close();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     
        return precos;
    }
}