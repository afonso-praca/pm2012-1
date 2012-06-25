package view;

/**
 *
 * @author Afonso
 */

public class ValidaMain {
     
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
