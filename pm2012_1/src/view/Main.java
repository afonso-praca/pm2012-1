/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * tela_principal.java
 *
 * Created on 17/05/2012, 02:00:01
 */
package view;

import com.sun.org.apache.bcel.internal.generic.D2F;
import controller.Controller;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form tela_principal
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_title = new javax.swing.JPanel();
        label_title = new javax.swing.JLabel();
        panel_info = new javax.swing.JPanel();
        label_informacoes = new javax.swing.JLabel();
        panel_info_fields = new javax.swing.JPanel();
        label_mes = new javax.swing.JLabel();
        label_vendas = new javax.swing.JLabel();
        label_precos = new javax.swing.JLabel();
        label_vendedores = new javax.swing.JLabel();
        label_saida = new javax.swing.JLabel();
        text_field_mes = new javax.swing.JTextField();
        text_field_vendas = new javax.swing.JTextField();
        text_field_precos = new javax.swing.JTextField();
        text_field_vendedores = new javax.swing.JTextField();
        text_field_saida = new javax.swing.JTextField();
        button_calc = new javax.swing.JButton();
        btFileChooserVendas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btFileChooserPreços = new javax.swing.JButton();
        btFileChooserVendedores = new javax.swing.JButton();
        btFileChooserSaida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);

        panel_title.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_title.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        label_title.setForeground(new java.awt.Color(102, 102, 102));
        label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_title.setText("SISTEMA DE GERAÇÃO DE COMISSÕES");

        javax.swing.GroupLayout panel_titleLayout = new javax.swing.GroupLayout(panel_title);
        panel_title.setLayout(panel_titleLayout);
        panel_titleLayout.setHorizontalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_titleLayout.setVerticalGroup(
            panel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_info.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label_informacoes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_informacoes.setText("Informações Necessárias:");

        panel_info_fields.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, null, java.awt.Color.blue, java.awt.Color.lightGray));

        label_mes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_mes.setText("Mês");

        label_vendas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_vendas.setText("Arquivo de Vendas");

        label_precos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_precos.setText("Arquivo de Preços");

        label_vendedores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_vendedores.setText("Arquivo de Vendedores");

        label_saida.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_saida.setText("Arquivo de Saida");

        text_field_mes.setName(""); // NOI18N

        button_calc.setText("Calcular");
        button_calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_calcActionPerformed(evt);
            }
        });

        btFileChooserVendas.setText("localizar");
        btFileChooserVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFileChooserVendasActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        btFileChooserPreços.setText("localizar");
        btFileChooserPreços.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFileChooserPreçosActionPerformed(evt);
            }
        });

        btFileChooserVendedores.setText("localizar");
        btFileChooserVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFileChooserVendedoresActionPerformed(evt);
            }
        });

        btFileChooserSaida.setText("Salvar");
        btFileChooserSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFileChooserSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_info_fieldsLayout = new javax.swing.GroupLayout(panel_info_fields);
        panel_info_fields.setLayout(panel_info_fieldsLayout);
        panel_info_fieldsLayout.setHorizontalGroup(
            panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_info_fieldsLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_vendas)
                    .addComponent(label_mes)
                    .addComponent(label_precos)
                    .addComponent(label_vendedores)
                    .addComponent(label_saida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(panel_info_fieldsLayout.createSequentialGroup()
                        .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_field_mes, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(text_field_vendas)
                            .addComponent(text_field_precos)
                            .addComponent(text_field_vendedores)
                            .addComponent(text_field_saida))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btFileChooserVendedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFileChooserPreços, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFileChooserVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFileChooserSaida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(button_calc))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        panel_info_fieldsLayout.setVerticalGroup(
            panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_info_fieldsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_field_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_mes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_field_vendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_vendas)
                    .addComponent(btFileChooserVendas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_field_precos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_precos)
                    .addComponent(btFileChooserPreços))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_field_vendedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_vendedores)
                    .addComponent(btFileChooserVendedores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_saida)
                    .addGroup(panel_info_fieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(text_field_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btFileChooserSaida)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_calc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panel_info_fieldsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {label_mes, label_precos, label_saida, label_vendas, label_vendedores});

        javax.swing.GroupLayout panel_infoLayout = new javax.swing.GroupLayout(panel_info);
        panel_info.setLayout(panel_infoLayout);
        panel_infoLayout.setHorizontalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_info_fields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_informacoes))
                .addContainerGap())
        );
        panel_infoLayout.setVerticalGroup(
            panel_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_informacoes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_info_fields, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // funções de escuta dos objs visuais
    private void button_calcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_calcActionPerformed

        String mes = text_field_mes.getText();
        String vendas = text_field_vendas.getText();
        String precos = text_field_precos.getText();
        String vendedores = text_field_vendedores.getText();
        String saida = text_field_saida.getText();

        //chama o controler.java
        //aqui vamos passar as urls que devem ser carregadas
        Controller.init(mes, precos, vendas, vendedores, saida);
    }//GEN-LAST:event_button_calcActionPerformed

    public String geraCaminho() {
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            File arq = chooser.getSelectedFile().getAbsoluteFile();

            String caminho = arq.getPath();
            return caminho;

        } else {
            return "Arquivo não encontrado";
        }

    }

    public String geraDiretorio() {

//    public static final int YES_OPTION = 0;
//    public static final int NO_OPTION = 1;
//    public static final int CANCEL_OPTION = 2;
//    public static final int OK_OPTION = 0;
//    public static final int CLOSED_OPTION = -1;


        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(null);

        File arq = chooser.getSelectedFile().getAbsoluteFile();

        String caminho = arq.getPath();
        return caminho;

    }

    private void btFileChooserVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFileChooserVendasActionPerformed
        System.out.println("click");
        fileChooser f = new fileChooser();
        f.setDefaultCloseOperation(HIDE_ON_CLOSE);
        text_field_vendas.setText(geraCaminho());
    }//GEN-LAST:event_btFileChooserVendasActionPerformed

    private void btFileChooserVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFileChooserVendedoresActionPerformed
        System.out.println("click");
        fileChooser f = new fileChooser();
        f.setDefaultCloseOperation(HIDE_ON_CLOSE);
        text_field_vendedores.setText(geraCaminho());
}//GEN-LAST:event_btFileChooserVendedoresActionPerformed

    private void btFileChooserPreçosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFileChooserPreçosActionPerformed
        System.out.println("click");
        fileChooser f = new fileChooser();
        f.setDefaultCloseOperation(HIDE_ON_CLOSE);
        text_field_precos.setText(geraCaminho());
}//GEN-LAST:event_btFileChooserPreçosActionPerformed

    private void btFileChooserSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFileChooserSaidaActionPerformed
        System.out.println("click");
        fileChooser f = new fileChooser();
        f.setDefaultCloseOperation(HIDE_ON_CLOSE);
        text_field_saida.setText(geraDiretorio());
    }//GEN-LAST:event_btFileChooserSaidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFileChooserPreços;
    private javax.swing.JButton btFileChooserSaida;
    private javax.swing.JButton btFileChooserVendas;
    private javax.swing.JButton btFileChooserVendedores;
    private javax.swing.JButton button_calc;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel label_informacoes;
    private javax.swing.JLabel label_mes;
    private javax.swing.JLabel label_precos;
    private javax.swing.JLabel label_saida;
    private javax.swing.JLabel label_title;
    private javax.swing.JLabel label_vendas;
    private javax.swing.JLabel label_vendedores;
    private javax.swing.JPanel panel_info;
    private javax.swing.JPanel panel_info_fields;
    private javax.swing.JPanel panel_title;
    private javax.swing.JTextField text_field_mes;
    private javax.swing.JTextField text_field_precos;
    private javax.swing.JTextField text_field_saida;
    private javax.swing.JTextField text_field_vendas;
    private javax.swing.JTextField text_field_vendedores;
    // End of variables declaration//GEN-END:variables
}
