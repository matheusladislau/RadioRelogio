package classes;
//import com.sun.xml.internal.txw2.TXW;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
public class InterfaceGrafica extends javax.swing.JFrame{
    static ArrayList<File> musicas=new ArrayList<>();
    static boolean tocando;
    static TocadorMusica tocador;
    static Tempo t;  
    static int linhas=0;
    static int nMusicaAtual=0;
//
    public InterfaceGrafica(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_titulo = new javax.swing.JLabel();
        txt_hora = new javax.swing.JLabel();
        btn_incluir = new javax.swing.JButton();
        btn_parar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_musica = new javax.swing.JTable();
        btn_informarHoras = new javax.swing.JButton();
        btn_proximaMusica = new javax.swing.JButton();
        btn_tocar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(500, 100));

        txt_titulo.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_blue.jpg"))); // NOI18N
        txt_titulo.setText("Rádio do Sucesso");
        txt_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_hora.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt_hora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_hora.setText("20:20:20");

        btn_incluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_incluir.setText("Incluir Música");
        btn_incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incluirActionPerformed(evt);
            }
        });

        btn_parar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_parar.setText("Parar");
        btn_parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pararActionPerformed(evt);
            }
        });

        tbl_musica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbl_musica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Músicas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_musica);

        btn_informarHoras.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_informarHoras.setText("Informar Hora");
        btn_informarHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informarHorasActionPerformed(evt);
            }
        });

        btn_proximaMusica.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_proximaMusica.setText("Próxima Musica");
        btn_proximaMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximaMusicaActionPerformed(evt);
            }
        });

        btn_tocar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_tocar.setText("Tocar");
        btn_tocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tocarActionPerformed(evt);
            }
        });

        btn_excluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_excluir.setText("Excluir Música");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_proximaMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_incluir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_tocar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn_informarHoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_parar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_hora)
                                .addGap(107, 107, 107)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_excluir)
                    .addComponent(btn_incluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tocar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_parar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_proximaMusica)
                    .addComponent(btn_informarHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incluirActionPerformed
        JFileChooser arquivo=new JFileChooser();
        arquivo.setFileSelectionMode(JFileChooser.APPROVE_OPTION);
        FileNameExtensionFilter filtroMP3=new FileNameExtensionFilter("Arquivos MP3","mp3");
        arquivo.setFileFilter(filtroMP3);
        arquivo.showOpenDialog(arquivo);
        if(arquivo.getSelectedFile()!=null){
            File mp3Selecionado=arquivo.getSelectedFile();
            musicas.add(mp3Selecionado);
            ((DefaultTableModel)tbl_musica.getModel()).addRow(new Object[]{mp3Selecionado.getName()});
            linhas++;
        }else{
            JOptionPane.showMessageDialog(null,"Arquivo não selecionado!");
        }
    }//GEN-LAST:event_btn_incluirActionPerformed
        public static void setHora(){
            txt_hora.setText(new Tempo().getHoraCompletaAtual());
            if(new Tempo().getMinutoAtual()=="00"){
                //continuar
                
            }
        }
    private void btn_informarHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informarHorasActionPerformed
        new InformaHora().start();
    }//GEN-LAST:event_btn_informarHorasActionPerformed

    private void btn_pararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pararActionPerformed
        this.tocador.stop();
        this.tocando=false;
    }//GEN-LAST:event_btn_pararActionPerformed

    private void btn_proximaMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximaMusicaActionPerformed
            
    }//GEN-LAST:event_btn_proximaMusicaActionPerformed

    private void btn_tocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tocarActionPerformed
        if(linhas<=0){
            JOptionPane.showMessageDialog(null,"Não há músicas selecionadas");
        }else{
            if(!tocando){
                this.tocador=new TocadorMusica(musicas.get(nMusicaAtual));
                this.tocador.start();
                this.tocando=true;
            }
        }
    }//GEN-LAST:event_btn_tocarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        if(this.linhas>0){
            ((DefaultTableModel)tbl_musica.getModel()).removeRow(linhas-1);
            this.linhas--;
        }else{
            JOptionPane.showMessageDialog(null,"Não há musicas a serem excluídas");
        }
    }//GEN-LAST:event_btn_excluirActionPerformed
    public static void main(String args[]){
        try{
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone(); //To change body of generated methods, choose Tools | Templates.
            }
            public void run(){
                new InterfaceGrafica().setVisible(true);
            }
            @Override
            public boolean equals(Object obj) {
                return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_incluir;
    private javax.swing.JButton btn_informarHoras;
    private javax.swing.JButton btn_parar;
    private javax.swing.JButton btn_proximaMusica;
    private javax.swing.JButton btn_tocar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_musica;
    private static javax.swing.JLabel txt_hora;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
