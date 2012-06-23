/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Afonso
 */
public class ValidaMain {
    
     public static String validaMes(String mes) {
        int mesNumero = 0;
        String msg;
        //usando a comparação com aspas "" para evitar null pointer exception se a variável mês vier nula
        if (!"".equals(mes)) {
            try {
                mesNumero = Integer.parseInt(mes);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            if (mesNumero > 0 && mesNumero <=12) {
                msg = "valido";
            } else {
                msg = "Mês informado é inválido!";
            }
        } else {
            msg = "Preenchimento do mês é obrigatório!";
        }
        return msg;
    }
     
     public static String validaArquivos(String vendas_path, String precos_path, String vendedores_path, String saida_path) {
        String msg = "";

        if (vendas_path == null || "".equals(vendas_path)) {
            msg = "Arquivo de vendas é obrigatório\n";
        }

        if (precos_path == null || "".equals(precos_path)) {
            msg += "Arquivo de preços é obrigatório\n";
        }

        if (vendedores_path == null || "".equals(vendedores_path)) {
            msg += "Arquivo de vendedores é obrigatório\n";
        }

        if (saida_path == null || "".equals(saida_path)) {
            msg += "Arquivo de saída é obrigatório";
        }

        return msg;
    }
}
