package view;
import connections.MySQL;
import java.awt.Color;
import javax.swing.*;
import objects.Gerenciar;
import objects.User;


public class telaPagar_Receber extends javax.swing.JFrame {
    
    int valorUsuario = 0;
    
    //Instanciar classes.
    MySQL conectar = new MySQL();
    User newUser = new User();
    String usuarioLogado = Gerenciar.getCpfLogado();

    public telaPagar_Receber() 
    {
        initComponents();
        this.setResizable(false);
        txtSacar.setBackground(new Color(1, 1, 1, 0));  
        txtSacar.setOpaque(false);
        
        txtDepositar.setBackground(new Color(1, 1, 1, 0));  
        txtDepositar.setOpaque(false);
        
        txtRecebeValor2.setBackground(new Color(1, 1, 1, 0));  
        txtRecebeValor2.setOpaque(false);
        txtRecebeValor2.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        voltarTela2 = new javax.swing.JButton();
        lblNomeBanco2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        fecharTela3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblValorSaqueOuDeposito = new javax.swing.JLabel();
        lblimgMoeda = new javax.swing.JLabel();
        btnSacar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblValorSaqueOuDeposito1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        btnSacar1 = new javax.swing.JButton();
        txtDepositar = new javax.swing.JFormattedTextField();
        txtSacar = new javax.swing.JFormattedTextField();
        txtRecebeValor2 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblNomeBanco3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        voltarTela2.setBackground(new java.awt.Color(0, 0, 0));
        voltarTela2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar_16.png"))); // NOI18N
        voltarTela2.setContentAreaFilled(false);
        voltarTela2.setFocusPainted(false);
        voltarTela2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTela2ActionPerformed(evt);
            }
        });

        lblNomeBanco2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 68)); // NOI18N
        lblNomeBanco2.setForeground(new java.awt.Color(0, 204, 153));
        lblNomeBanco2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeBanco2.setText("BANCO DIGITAL");

        jPanel14.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );

        jPanel15.setBackground(new java.awt.Color(0, 102, 102));
        jPanel15.setPreferredSize(new java.awt.Dimension(56, 340));

        fecharTela3.setBackground(new java.awt.Color(0, 0, 0));
        fecharTela3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/x.png_16.png"))); // NOI18N
        fecharTela3.setBorderPainted(false);
        fecharTela3.setContentAreaFilled(false);
        fecharTela3.setFocusPainted(false);
        fecharTela3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharTela3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fecharTela3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(fecharTela3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(170, 126));

        lblValorSaqueOuDeposito.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        lblValorSaqueOuDeposito.setForeground(new java.awt.Color(0, 0, 0));
        lblValorSaqueOuDeposito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorSaqueOuDeposito.setText("DEPOSITAR");

        lblimgMoeda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblimgMoeda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/coin_32.png"))); // NOI18N

        btnSacar.setBackground(new java.awt.Color(0, 0, 0));
        btnSacar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        btnSacar.setForeground(new java.awt.Color(0, 51, 51));
        btnSacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seta_32.png"))); // NOI18N
        btnSacar.setBorder(null);
        btnSacar.setContentAreaFilled(false);
        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        lblValorSaqueOuDeposito1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        lblValorSaqueOuDeposito1.setForeground(new java.awt.Color(0, 0, 0));
        lblValorSaqueOuDeposito1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorSaqueOuDeposito1.setText("SACAR");

        jLabel1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Valor disponível na Conta:");

        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnSacar1.setBackground(new java.awt.Color(0, 0, 0));
        btnSacar1.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 36)); // NOI18N
        btnSacar1.setForeground(new java.awt.Color(0, 51, 51));
        btnSacar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/seta_32.png"))); // NOI18N
        btnSacar1.setBorder(null);
        btnSacar1.setContentAreaFilled(false);
        btnSacar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacar1ActionPerformed(evt);
            }
        });

        txtDepositar.setBorder(null);
        txtDepositar.setForeground(new java.awt.Color(0, 0, 0));
        txtDepositar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtDepositar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepositar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        txtDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepositarActionPerformed(evt);
            }
        });

        txtSacar.setBorder(null);
        txtSacar.setForeground(new java.awt.Color(0, 0, 0));
        txtSacar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtSacar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSacar.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        txtSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSacarActionPerformed(evt);
            }
        });

        txtRecebeValor2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 24)); // NOI18N
        txtRecebeValor2.setForeground(new java.awt.Color(0, 0, 0));
        txtRecebeValor2.setText("Revelar Valor");
        txtRecebeValor2.setBorder(null);
        txtRecebeValor2.setFocusable(false);
        txtRecebeValor2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRecebeValor2MouseClicked(evt);
            }
        });
        txtRecebeValor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRecebeValor2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblimgMoeda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSacar)
                                    .addComponent(lblValorSaqueOuDeposito1, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorSaqueOuDeposito, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSacar1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addComponent(txtDepositar)
                            .addComponent(jSeparator8)
                            .addComponent(txtRecebeValor2))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblimgMoeda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRecebeValor2))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorSaqueOuDeposito1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorSaqueOuDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSacar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSacar)
                            .addComponent(btnSacar1))
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(0, 204, 153));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblNomeBanco3.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 1, 48)); // NOI18N
        lblNomeBanco3.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeBanco3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNomeBanco3.setText("SAQUE E DEPOSITO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voltarTela2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNomeBanco3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNomeBanco2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeBanco2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(voltarTela2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeBanco3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))))
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
    
    private void valorUserCaixa(User newUser){
        
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
        txtRecebeValor2.setText("R$" + newUser.valorUser);
        valorUsuario = newUser.valorUser;
    }    
    }
    
    //--------------------------------------------------------------------------------------------------------------

    public void sacarUser (User newUser) {
        this.conectar.conectaBanco();
        
        try {
            
            var atualizarProdutos = " UPDATE usuario set "
                    +"valor = valor - '" + txtSacar.getText() + "' "
                    + " WHERE "
                        + " cpf = '" + Gerenciar.cpfLogado + "';"
                    ;
            this.conectar.updateSQL (atualizarProdutos);
               
        } catch (Exception e) {
            System.out.println("Erro ao Atualizar Produto"+ e.getMessage());
            JOptionPane.showMessageDialog (null, "Erro ao buscar Produto");
            
        } finally {
            System.out.println(newUser.valorUser);
            txtRecebeValor2.setText("R$" + newUser.valorUser); 
        }
    }
    
    //--------------------------------------------------------------------------------------------------------------

    public void depositarUser (User newUser) {
        this.conectar.conectaBanco();
        valorUsuario = valorUsuario + Integer.parseInt(txtDepositar.getText());
        try {
            
            var depositarValor = " UPDATE usuario set "
                    +"valor = '" + valorUsuario + "' "
                    + " WHERE "
                    + " cpf = '" + Gerenciar.cpfLogado + "';"
                    ;
            this.conectar.updateSQL (depositarValor);
               
        } catch (Exception e) {
            System.out.println("Erro ao Atualizar Produto"+ e.getMessage());
            JOptionPane.showMessageDialog (null, "Erro ao buscar Produto");
            
        } finally {
            System.out.println(newUser.valorUser);
            txtRecebeValor2.setText("R$" + newUser.valorUser); 
        }
    }
    
    private void voltarTela2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTela2ActionPerformed
        telaPrincipal telaprincipal = new telaPrincipal();
        telaprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarTela2ActionPerformed

    private void fecharTela3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharTela3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_fecharTela3ActionPerformed

    private void btnSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarActionPerformed
        sacarUser(newUser);
    }//GEN-LAST:event_btnSacarActionPerformed

    private void btnSacar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacar1ActionPerformed
        depositarUser(newUser);
    }//GEN-LAST:event_btnSacar1ActionPerformed

    private void txtDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepositarActionPerformed

    }//GEN-LAST:event_txtDepositarActionPerformed

    private void txtSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSacarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSacarActionPerformed

    private void txtRecebeValor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRecebeValor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRecebeValor2ActionPerformed

    private void txtRecebeValor2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRecebeValor2MouseClicked
        valorUserCaixa(newUser);
    }//GEN-LAST:event_txtRecebeValor2MouseClicked
    
    private void adicionaComponentes(){
        JTextField txtChavePix = new JTextField();
        JLabel lblValor = new JLabel();
        JTextField txtValor = new JTextField();
        JButton btnPagar = new JButton();

        txtChavePix.setVisible(true);
        lblValor.setVisible(true);
        txtValor.setVisible(true);
        btnPagar.setVisible(true);
        
        initComponents();
    }
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaPagar_Receber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPagar_Receber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPagar_Receber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPagar_Receber.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPagar_Receber().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacar;
    private javax.swing.JButton btnSacar1;
    private javax.swing.JButton fecharTela3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lblNomeBanco2;
    private javax.swing.JLabel lblNomeBanco3;
    private javax.swing.JLabel lblValorSaqueOuDeposito;
    private javax.swing.JLabel lblValorSaqueOuDeposito1;
    private javax.swing.JLabel lblimgMoeda;
    private javax.swing.JFormattedTextField txtDepositar;
    private javax.swing.JTextField txtRecebeValor2;
    private javax.swing.JFormattedTextField txtSacar;
    private javax.swing.JButton voltarTela2;
    // End of variables declaration//GEN-END:variables

    private void conferir(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
