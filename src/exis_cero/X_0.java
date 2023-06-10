package exis_cero;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class X_0 extends javax.swing.JFrame {
    
    int turno=2;
    int botonutilizado[]={0,0,0,0,0,0,0,0,0};
    int jugadorXgano[]={0,0,0,0,0,0,0,0,0};
    int jugadorOgano[]={0,0,0,0,0,0,0,0,0};
    int empate[]={0,0,0,0,0,0,0,0,0,0};

    int jugadorXgano(){
            if (jugadorXgano[0]==1 && jugadorXgano[1]==1 && jugadorXgano[2]==1){
                 return 1;
            }else
             if (jugadorXgano[3]==1 && jugadorXgano[4]==1 && jugadorXgano[5]==1){
                 return 1;
            }else
              if (jugadorXgano[6]==1 && jugadorXgano[7]==1 && jugadorXgano[8]==1){
                 return 1;
            }else
               if (jugadorXgano[0]==1 && jugadorXgano[3]==1 && jugadorXgano[6]==1){
                 return 1;
            }else
                if (jugadorXgano[1]==1 && jugadorXgano[4]==1 && jugadorXgano[7]==1){
                 return 1;
            }else
                 if (jugadorXgano[2]==1 && jugadorXgano[5]==1 && jugadorXgano[8]==1){
                 return 1;
            }else
                  if (jugadorXgano[0]==1 && jugadorXgano[4]==1 && jugadorXgano[8]==1){
                 return 1;
            }else
                   if (jugadorXgano[2]==1 && jugadorXgano[4]==1 && jugadorXgano[6]==1){
                 return 1;
            } 
    return 0;
    }
    
     int jugadorOgano(){
            if (jugadorOgano[0]==1 && jugadorOgano[1]==1 && jugadorOgano[2]==1){
                 return 1;
            }
             if (jugadorOgano[3]==1 && jugadorOgano[4]==1 && jugadorOgano[5]==1){
                 return 1;
            }else 
                 if (jugadorOgano[6]==1 && jugadorOgano[7]==1 && jugadorOgano[8]==1){
                 return 1;
            }else
               if (jugadorOgano[0]==1 && jugadorOgano[3]==1 && jugadorOgano[6]==1){
                 return 1;
            }else
                if (jugadorOgano[1]==1 && jugadorOgano[4]==1 && jugadorOgano[7]==1){
                 return 1;
            }else
                 if (jugadorOgano[2]==1 && jugadorOgano[5]==1 && jugadorOgano[8]==1){
                 return 1;
            }else
                  if (jugadorOgano[0]==1 && jugadorOgano[4]==1 && jugadorOgano[8]==1){
                 return 1;
            }else
                   if (jugadorOgano[2]==1 && jugadorOgano[4]==1 && jugadorOgano[6]==1){
                 return 1;
            }
                      
    return 0;
    }
     int empate(){
     if(jugadorXgano[0]==0 && jugadorOgano[0]==0 ){
        if(jugadorXgano[1]==0 && jugadorOgano[1]==0 ){
            if(jugadorXgano[2]==0 && jugadorOgano[2]==0 ){
                if(jugadorXgano[3]==0 && jugadorOgano[3]==0 ){
                    if(jugadorXgano[4]==0 && jugadorOgano[4]==0 ){
                        if(jugadorXgano[5]==0 && jugadorOgano[5]==0 ){
                            if(jugadorXgano[6]==0 && jugadorOgano[6]==0 ){
                                if(jugadorXgano[7]==0 && jugadorOgano[7]==0 ){
                                      if(jugadorXgano[8]==0 && jugadorOgano[8]==0 ){
                                          return 1;
                                     }
                                }
                            }
                        }
                      }
                  }
              }
           }
     }
     return 0;
     }

    public X_0() {
        initComponents();
        //      que pasaa
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fc00 = new javax.swing.JButton();
        fc01 = new javax.swing.JButton();
        fc12 = new javax.swing.JButton();
        fc02 = new javax.swing.JButton();
        fc21 = new javax.swing.JButton();
        fc22 = new javax.swing.JButton();
        fc10 = new javax.swing.JButton();
        fc11 = new javax.swing.JButton();
        fc20 = new javax.swing.JButton();
        regreso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 0));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        fc00.setBackground(new java.awt.Color(255, 255, 153));
        fc00.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        fc00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc00ActionPerformed(evt);
            }
        });

        fc01.setBackground(new java.awt.Color(255, 255, 153));
        fc01.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        fc01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc01ActionPerformed(evt);
            }
        });

        fc12.setBackground(new java.awt.Color(255, 255, 153));
        fc12.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        fc12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc12ActionPerformed(evt);
            }
        });

        fc02.setBackground(new java.awt.Color(255, 255, 153));
        fc02.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        fc02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc02ActionPerformed(evt);
            }
        });

        fc21.setBackground(new java.awt.Color(255, 255, 153));
        fc21.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        fc21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc21ActionPerformed(evt);
            }
        });

        fc22.setBackground(new java.awt.Color(255, 255, 153));
        fc22.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        fc22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc22ActionPerformed(evt);
            }
        });

        fc10.setBackground(new java.awt.Color(255, 255, 153));
        fc10.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        fc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc10ActionPerformed(evt);
            }
        });

        fc11.setBackground(new java.awt.Color(255, 255, 153));
        fc11.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        fc11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc11ActionPerformed(evt);
            }
        });

        fc20.setBackground(new java.awt.Color(255, 255, 153));
        fc20.setFont(new java.awt.Font("Viner Hand ITC", 0, 48)); // NOI18N
        fc20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fc20ActionPerformed(evt);
            }
        });

        regreso.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        regreso.setText("SALIR");
        regreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresoMouseClicked(evt);
            }
        });
        regreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fc10, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fc00, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fc20, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fc01, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fc02, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fc11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(regreso, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fc21, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fc12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fc22, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fc01, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fc02, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fc00, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fc11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fc12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fc10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fc21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fc22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fc20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(regreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fc00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc00ActionPerformed
        if(botonutilizado[0]==0){
            if (turno%2==0){
                turno++;
                fc00.setText("X");
                botonutilizado[0]=1;
                 jugadorXgano[0]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");

                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }else{
                turno++;
                fc00.setText("O");
                 botonutilizado[0]=1;
                  jugadorOgano[0]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Este boton ya esta tomado!");
        }
    }//GEN-LAST:event_fc00ActionPerformed

    private void fc02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc02ActionPerformed
        if(botonutilizado[2]==0){
            if (turno%2==0){
                turno++;
                fc02.setText("X");
                botonutilizado[2]=1;
                 jugadorXgano[2]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }else {
                turno++;
                fc02.setText("O");
                 botonutilizado[2]=1;
                 jugadorOgano[2]=1;
                  int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Este boton ya esta tomado!");
        }
    }//GEN-LAST:event_fc02ActionPerformed

    private void fc01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc01ActionPerformed
            if(botonutilizado[1]==0){
            if (turno%2==0){
                turno++;
                fc01.setText("X");
                botonutilizado[1]=1;
                 jugadorXgano[1]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }else{
                turno++;
                fc01.setText("O");
                 botonutilizado[1]=1;
                  jugadorOgano[1]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Este boton ya esta tomado!");
        }
    }//GEN-LAST:event_fc01ActionPerformed

    private void fc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc10ActionPerformed
         if(botonutilizado[3]==0){
            if (turno%2==0){
                turno++;
                fc10.setText("X");
                botonutilizado[3]=1;
                 jugadorXgano[3]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }else{
                turno++;
                fc10.setText("O");
                 botonutilizado[3]=1;
                  jugadorOgano[3]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Este boton ya esta tomado!");
        }
    }//GEN-LAST:event_fc10ActionPerformed

    private void fc11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc11ActionPerformed
         if(botonutilizado[4]==0){
            if (turno%2==0){
                turno++;
                fc11.setText("X");
                botonutilizado[4]=1;
                 jugadorXgano[4]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }else{
                turno++;
                fc11.setText("O");
                 botonutilizado[4]=1;
                  jugadorOgano[4]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Este boton ya esta tomado!");
        }
    }//GEN-LAST:event_fc11ActionPerformed

    private void fc12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc12ActionPerformed
        if(botonutilizado[5]==0){
            if (turno%2==0){
                turno++;
                fc12.setText("X");
                botonutilizado[5]=1;
                 jugadorXgano[5]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }else{
                turno++;
                fc12.setText("O");
                 botonutilizado[5]=1;
                  jugadorOgano[5]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Este boton ya esta tomado!");
        }
    }//GEN-LAST:event_fc12ActionPerformed

    private void fc20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc20ActionPerformed
        if(botonutilizado[6]==0){
            if (turno%2==0){
                turno++;
                fc20.setText("X");
                botonutilizado[6]=1;
                 jugadorXgano[6]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }else{
                turno++;
                fc20.setText("O");
                 botonutilizado[6]=1;
                  jugadorOgano[6]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
            }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Este boton ya esta tomado!");
        }
    }//GEN-LAST:event_fc20ActionPerformed

    private void fc21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc21ActionPerformed
          if(botonutilizado[7]==0){
                if (turno%2==0){
                    turno++;
                    fc21.setText("X");
                    botonutilizado[7]=1;
                     jugadorXgano[7]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
                }else{
                    turno++;
                    fc21.setText("O");
                     botonutilizado[7]=1;
                      jugadorOgano[7]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
                }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Este boton ya esta tomado!");
        }
    }//GEN-LAST:event_fc21ActionPerformed

    private void fc22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fc22ActionPerformed
         if(botonutilizado[8]==0){
                if (turno%2==0){
                    turno++;
                    fc22.setText("X");
                    botonutilizado[8]=1;
                     jugadorXgano[8]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                     int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
                }else{
                    turno++;
                    fc22.setText("O");
                     botonutilizado[8]=1;
                      jugadorOgano[8]=1;
                 int resultado1=jugadorXgano();
                  int resultado2=jugadorOgano();
                  int resultado3=empate();
                  if(resultado1==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! X HAS GANDO!!");
                  }else if (resultado2==1){
                      JOptionPane.showMessageDialog(rootPane, "FELICIDADES! O HAS GANDO!!");
                  }
                }
        }else{
                JOptionPane.showMessageDialog(rootPane, "Este boton ya esta tomado!");
        }
    }//GEN-LAST:event_fc22ActionPerformed

    private void jPanel1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorAdded
        ImageIcon fondo = new ImageIcon("C:/Users/fampa/Documents/NetBeansProjects/exis_cero/src/exis_cero/Fondo_X_0.png");
    }//GEN-LAST:event_jPanel1AncestorAdded

    private void regresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresoActionPerformed
        fc00.setText(null);
        fc01.setText(null);
        fc02.setText(null);
        fc10.setText(null);
        fc11.setText(null);
        fc12.setText(null);
        fc20.setText(null);
        fc21.setText(null);
        fc22.setText(null);
        turno=2;
        for (int i=0;i<9;i++){
            botonutilizado[i]=0;
        }
        for (int i=0;i<9;i++){
           jugadorXgano[i]=0;
        }
        for (int i=0;i<9;i++){
           jugadorOgano[i]=0;
        }
    }//GEN-LAST:event_regresoActionPerformed

    private void regresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresoMouseClicked
       MenuPrincipal menu=new MenuPrincipal();
       menu.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_regresoMouseClicked

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
            java.util.logging.Logger.getLogger(X_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(X_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(X_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(X_0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new X_0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fc00;
    private javax.swing.JButton fc01;
    private javax.swing.JButton fc02;
    private javax.swing.JButton fc10;
    private javax.swing.JButton fc11;
    private javax.swing.JButton fc12;
    private javax.swing.JButton fc20;
    private javax.swing.JButton fc21;
    private javax.swing.JButton fc22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton regreso;
    // End of variables declaration//GEN-END:variables

}

