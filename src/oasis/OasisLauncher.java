package oasis;

import javax.swing.JOptionPane;

public class OasisLauncher extends javax.swing.JFrame {
    public OasisLauncher() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oasisLogo = new javax.swing.JLabel();
        gameDescriptionScrollPane = new javax.swing.JScrollPane();
        gameDescription = new javax.swing.JTextArea();
        usernameVar = new javax.swing.JTextField();
        passwordVar = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        saveUsername = new javax.swing.JCheckBox();
        savePassword = new javax.swing.JCheckBox();
        copyrightFooter = new javax.swing.JLabel();
        updateNews = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OASIS Launcher");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        oasisLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oasis/OASIS Logo.png"))); // NOI18N

        gameDescription.setEditable(false);
        gameDescription.setBackground(getBackground());
        gameDescription.setColumns(13);
        gameDescription.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        gameDescription.setLineWrap(true);
        gameDescription.setRows(5);
        gameDescription.setText("Welcome to OASIS! OASIS is reality, without the reality! Anything can happen that can happen in reality, and then some! Property can be sold, businesses can be started, and a family can be raised, all within software! ");
        gameDescription.setWrapStyleWord(true);
        gameDescriptionScrollPane.setViewportView(gameDescription);

        usernameVar.setToolTipText("Username");

        passwordVar.setToolTipText("Password");
        passwordVar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordVarKeyPressed(evt);
            }
        });

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        saveUsername.setText("Save Username");

        savePassword.setText("Save Password");
        savePassword.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                savePasswordStateChanged(evt);
            }
        });

        copyrightFooter.setText("Copyright © 2013 [company name]             All Rights Reserved");

        updateNews.setText("Update News");
        updateNews.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNewsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oasisLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameVar)
                            .addComponent(passwordVar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savePassword)
                            .addComponent(saveUsername)))
                    .addComponent(copyrightFooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gameDescriptionScrollPane)
                    .addComponent(updateNews, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(oasisLogo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(gameDescriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveUsername)
                            .addComponent(usernameVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(savePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateNews, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(copyrightFooter, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
        saveUsername.setFocusable(false);
        savePassword.setFocusable(false);
        saveUsername.setSelected(true);
        this.setIconImage(new javax.swing.ImageIcon(getClass().getClassLoader().getResource("oasis/OASIS Logo Sun.png")).getImage());
    }//GEN-LAST:event_formWindowOpened

    private void savePasswordStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_savePasswordStateChanged
        if(savePassword.isSelected()){
            saveUsername.setSelected(true);
        }
    }//GEN-LAST:event_savePasswordStateChanged

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        login();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordVarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordVarKeyPressed
        if(evt.getKeyCode() == 10){
            login();
        }
    }//GEN-LAST:event_passwordVarKeyPressed

    private void updateNewsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNewsActionPerformed
        JOptionPane.showMessageDialog(OasisLauncher.this, "OASIS 0.0.0\n    Not yet released.", "Update News", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_updateNewsActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OasisLauncher().setVisible(true);
            }
        });
    }
    private void login(){
        String username;
        username = usernameVar.getText();
        char[] charpassword;
        charpassword = passwordVar.getPassword();
        String password;
        password = new String(charpassword);
        if("pavilion99".equals(username) && "Spencer3899$".equals(password)){
            JOptionPane.showMessageDialog(OasisLauncher.this, "Congrats, you found the SuperUser account.\nSorry, but you still can't login.", "SuperUser", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(OasisLauncher.this, "Sorry, we have no servers available to process your request.", "Server Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel copyrightFooter;
    private javax.swing.JTextArea gameDescription;
    private javax.swing.JScrollPane gameDescriptionScrollPane;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel oasisLogo;
    private javax.swing.JPasswordField passwordVar;
    private javax.swing.JCheckBox savePassword;
    private javax.swing.JCheckBox saveUsername;
    private javax.swing.JButton updateNews;
    private javax.swing.JTextField usernameVar;
    // End of variables declaration//GEN-END:variables
}
