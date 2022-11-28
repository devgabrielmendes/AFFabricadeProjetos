package view;
import connections.MySQL;
import javax.swing.JOptionPane;
import java.awt.Color;
import objects.Gerenciar;
import objects.User;

public class telaPrincipal extends javax.swing.JFrame{
    
    //Instanciar classes.
    MySQL conectar = new MySQL();
    User newUser = new User();
    String usuarioLogado = Gerenciar.getCpfLogado();
    
    public telaPrincipal() 
    {
        initComponents();
        usuarioLogado = Gerenciar.getCpfLogado();
        
        txtRecebeCpf.setBackground(new Color(1, 1, 1, 0));  
        txtRecebeCpf.setOpaque(false);
        txtRecebeCpf.setEditable(false);
        
        txtRecebeValor.setBackground(new Color(1, 1, 1, 0));  
        txtRecebeValor.setOpaque(false);
        txtRecebeValor.setEditable(false);
        
        System.out.println("oi teste" + Gerenciar.cpfLogado);

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voltarTela2 = new javax.swing.JButton();
        fecharTela2 = new javax.swing.JButton();
        lblNomeBanco2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblSacar = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        lblEnviar = new javax.swing.JLabel();
        btnSacar = new javax.swing.JButton();
        lblUser2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblMoeda2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtRecebeValor = new javax.swing.JTextField();
        txtRecebeCpf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        voltarTela2.setBackground(new java.awt.Color(0, 0, 0));
        voltarTela2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar_16.png"))); // NOI18N
        voltarTela2.setBorderPainted(false);
        voltarTela2.setContentAreaFilled(false);
        voltarTela2.setFocusPainted(false);
        voltarTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTela2ActionPerformed(evt);
            }
        });

        fecharTela2.setBackground(new java.awt.Color(0, 0, 0));
        fecharTela2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png_16.png"))); // NOI18N
        fecharTela2.setBorderPainted(false);
        fecharTela2.setContentAreaFilled(false);
        fecharTela2.setFocusPainted(false);
        fecharTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTela2ActionPerformed(evt);
            }
        });

        lblNomeBanco2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 68)); // NOI18N
        lblNomeBanco2.setForeground(new java.awt.Color(0, 204, 153));
        lblNomeBanco2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeBanco2.setText("BANCO DIGITAL");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));
        jPanel15.setPreferredSize(new java.awt.Dimension(56, 340));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(170, 126));

        lblSacar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 36)); // NOI18N
        lblSacar.setForeground(new java.awt.Color(0, 0, 0));
        lblSacar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/receber_32.png"))); // NOI18N
        lblSacar.setText("SACAR E DEPOSITAR");
        lblSacar.setPreferredSize(new java.awt.Dimension(113, 50));

        btnEnviar.setBackground(new java.awt.Color(255, 255, 255));
        btnEnviar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 18)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(0, 204, 153));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seta_menu_32.png"))); // NOI18N
        btnEnviar.setActionCommand("SEGUIR\n");
        btnEnviar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnEnviar.setContentAreaFilled(false);
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        lblEnviar.setBackground(new java.awt.Color(0, 204, 153));
        lblEnviar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 36)); // NOI18N
        lblEnviar.setForeground(new java.awt.Color(0, 0, 0));
        lblEnviar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pay_32.png"))); // NOI18N
        lblEnviar.setText("ENVIAR");

        btnSacar.setBackground(new java.awt.Color(255, 255, 255));
        btnSacar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 18)); // NOI18N
        btnSacar.setForeground(new java.awt.Color(0, 204, 153));
        btnSacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seta_menu_32.png"))); // NOI18N
        btnSacar.setActionCommand("SEGUIR\n");
        btnSacar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnSacar.setContentAreaFilled(false);
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnviar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSacar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        lblUser2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        lblUser2.setForeground(new java.awt.Color(255, 255, 255));
        lblUser2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/userBranco_32.png"))); // NOI18N

        jPanel16.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(0, 204, 153));
        jPanel17.setPreferredSize(new java.awt.Dimension(56, 216));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        lblMoeda2.setBackground(new java.awt.Color(0, 153, 102));
        lblMoeda2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        lblMoeda2.setForeground(new java.awt.Color(0, 0, 0));
        lblMoeda2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMoeda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coin_32.png"))); // NOI18N

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        txtRecebeValor.setBackground(new java.awt.Color(204, 204, 204));
        txtRecebeValor.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        txtRecebeValor.setForeground(new java.awt.Color(255, 255, 255));
        txtRecebeValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRecebeValor.setText("REVELAR VALOR NA CONTA");
        txtRecebeValor.setBorder(null);
        txtRecebeValor.setOpaque(true);
        txtRecebeValor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRecebeValorMouseClicked(evt);
            }
        });
        txtRecebeValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecebeValorActionPerformed(evt);
            }
        });

        txtRecebeCpf.setBackground(new java.awt.Color(204, 204, 204));
        txtRecebeCpf.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 48)); // NOI18N
        txtRecebeCpf.setForeground(new java.awt.Color(255, 255, 255));
        txtRecebeCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRecebeCpf.setText("REVELAR CPF");
        txtRecebeCpf.setBorder(null);
        txtRecebeCpf.setOpaque(true);
        txtRecebeCpf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRecebeCpfMouseClicked(evt);
            }
        });
        txtRecebeCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecebeCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarTela2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNomeBanco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecharTela2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                                    .addComponent(jSeparator2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtRecebeCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblMoeda2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(206, 206, 206))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtRecebeValor, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(106, 106, 106))))))
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNomeBanco2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(fecharTela2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(voltarTela2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRecebeCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblMoeda2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRecebeValor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void cpfUser(User newUser){
        System.out.println(Gerenciar.cpfLogado);
        txtRecebeCpf.setText(Gerenciar.cpfLogado);
    }
    
    private void valorUser(User newUser){
        
        this.conectar.conectaBanco();
        
        try{
            var valorUser = "SELECT "
                    + "valor"
                    + " FROM "
                    + "usuario"
                    + " WHERE "
                    + "cpf = '"+ Gerenciar.cpfLogado + "';";
            this.conectar.executarSQL(valorUser);
            
            while(this.conectar.getResultSet().next()){
                newUser.setValorUser(this.conectar.getResultSet().getInt(1));
            }

    }
    catch(Exception e){
            System.out.println("Erro ao cosultar funcionário! " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cosultar funcionário!");
    }
    finally{
        System.out.println(newUser.valorUser);
        txtRecebeValor.setText("R$" + newUser.valorUser);
    }    
    }
    private void fecharTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTela2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharTela2ActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        telaTransferencia telatransferencia = new telaTransferencia();
        telatransferencia.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void voltarTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTela2ActionPerformed
        int choice = JOptionPane.showConfirmDialog(null, "Sair da tela?","VOLTAR", JOptionPane.OK_CANCEL_OPTION);
        if(choice == JOptionPane.OK_OPTION){
            telaLogin telalogin = new telaLogin();
        telalogin.setVisible(true);
            this.dispose();}
        if(choice == JOptionPane.CANCEL_OPTION){

        }
    }//GEN-LAST:event_voltarTela2ActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        telaPagar_Receber telapagar_receber = new telaPagar_Receber();
        telapagar_receber.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSacarActionPerformed

    private void txtRecebeValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecebeValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecebeValorActionPerformed

    private void txtRecebeCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecebeCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecebeCpfActionPerformed

    private void txtRecebeCpfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRecebeCpfMouseClicked
        cpfUser(newUser);
    }//GEN-LAST:event_txtRecebeCpfMouseClicked

    private void txtRecebeValorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRecebeValorMouseClicked
        valorUser(newUser);
    }//GEN-LAST:event_txtRecebeValorMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton fecharTela2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEnviar;
    private javax.swing.JLabel lblMoeda2;
    private javax.swing.JLabel lblNomeBanco2;
    private javax.swing.JLabel lblSacar;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JTextField txtRecebeCpf;
    private javax.swing.JTextField txtRecebeValor;
    private javax.swing.JButton voltarTela2;
    // End of variables declaration//GEN-END:variables

    private void setDefaultCloseOperation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
