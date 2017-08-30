package classes;
//import com.sun.xml.internal.txw2.TXW;
public class InterfaceGrafica extends javax.swing.JFrame{
        static Tocador musica=new Tocador();
        static Tempo t=new Tempo();
        static String hora=t.getHora();
    public InterfaceGrafica(){
        initComponents();
        musica.setNMusicas(2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_titulo = new javax.swing.JLabel();
        txt_hora = new javax.swing.JLabel();
        btn_play = new javax.swing.JButton();
        btn_pause = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_musica = new javax.swing.JTable();
        btn_falar = new javax.swing.JButton();
        btn_proxima = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        txt_titulo.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(255, 255, 255));
        txt_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background_blue.jpg"))); // NOI18N
        txt_titulo.setText("Rádio do Sucesso");
        txt_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_hora.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        txt_hora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_hora.setText("20:20:20");

        btn_play.setText("Play");
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });

        btn_pause.setText("Stop");
        btn_pause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pauseActionPerformed(evt);
            }
        });

        tbl_musica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_musica);

        btn_falar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_falar.setText("Informar Hora");
        btn_falar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_falarActionPerformed(evt);
            }
        });

        btn_proxima.setText("Next");
        btn_proxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proximaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_play)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_pause)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_proxima)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_falar)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(txt_hora)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_play)
                    .addComponent(btn_pause)
                    .addComponent(btn_proxima)
                    .addComponent(btn_falar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed
        txt_hora.setText(t.horaCompleta);
        musica.run();
    }//GEN-LAST:event_btn_playActionPerformed

    private void btn_falarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_falarActionPerformed
        String hora=t.getHora();
        musica.falar("HRS"+t.getHora()); 
        musica.falar("MIN"+t.getMinuto()); 
    }//GEN-LAST:event_btn_falarActionPerformed

    private void btn_pauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pauseActionPerformed
        musica.stop();
    }//GEN-LAST:event_btn_pauseActionPerformed

    private void btn_proximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proximaActionPerformed
            
    }//GEN-LAST:event_btn_proximaActionPerformed
    public static void main(String args[]){
        musica.start();
        t.start();
//
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
        while(true){
            //txt_hora.setText(horaCompleta);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_falar;
    private javax.swing.JButton btn_pause;
    private javax.swing.JButton btn_play;
    private javax.swing.JButton btn_proxima;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_musica;
    private static javax.swing.JLabel txt_hora;
    private javax.swing.JLabel txt_titulo;
    // End of variables declaration//GEN-END:variables
}
