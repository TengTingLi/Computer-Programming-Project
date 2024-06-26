/*
 * /*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template*/
 



/**
 * @date 9/1/2022
 * @author TENG TING LI
 */
public class complex extends javax.swing.JFrame {
    double real, imaginary;
    public complex(double a, double b){
        this.real = a;
        this.imaginary = b;
    }
    /**
     * Creates new form complex
     */
    public complex() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Z1_real = new javax.swing.JTextField();
        Z1_imaginary = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Z2_real = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Z2_imaginary = new javax.swing.JTextField();
        Z3_real = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Z3_imaginary = new javax.swing.JTextField();
        Z4_real = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Z4_imaginary = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        main_output = new javax.swing.JTextArea();
        cb_zx1 = new javax.swing.JComboBox<>();
        button_display = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cb_operation = new javax.swing.JComboBox<>();
        cb_zx2 = new javax.swing.JComboBox<>();
        button_calculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("COMPLEX GUI");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Z1");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Z2");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setText("Z3");

        Z1_real.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Z1_real.setText("1");

        Z1_imaginary.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Z1_imaginary.setText("1");

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setText("+");

        Z2_real.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Z2_real.setText("2");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setText("+");

        Z2_imaginary.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Z2_imaginary.setText("2");

        Z3_real.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Z3_real.setText("-1");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setText("+");

        Z3_imaginary.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Z3_imaginary.setText("1");

        Z4_real.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Z4_real.setText("5");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel8.setText("+");

        Z4_imaginary.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        Z4_imaginary.setText("-4");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel9.setText("Z3");

        main_output.setColumns(20);
        main_output.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        main_output.setRows(5);
        jScrollPane1.setViewportView(main_output);

        cb_zx1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_zx1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Z1", "Z2", "Z3", "Z4" }));

        button_display.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_display.setText("Display");
        button_display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_displayActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel10.setText("i");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel11.setText("i");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel12.setText("i");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel13.setText("i");

        cb_operation.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_operation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        cb_operation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_operationActionPerformed(evt);
            }
        });

        cb_zx2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cb_zx2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Z1", "Z2", "Z3", "Z4" }));

        button_calculate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_calculate.setText("Calculate");
        button_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_calculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Z3_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z3_imaginary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Z4_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Z4_imaginary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Z2_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Z2_imaginary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Z1_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Z1_imaginary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_zx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_operation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cb_zx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(button_display)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(button_calculate))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(Z1_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Z1_imaginary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cb_zx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(cb_operation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb_zx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(Z2_imaginary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Z2_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(Z3_imaginary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Z3_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button_display)
                            .addComponent(button_calculate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(Z4_imaginary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Z4_real, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     void display_complex(complex a, String s){          //function to display complex number
        complex temp = new complex(0,0);
         String sign = "+";
        double temp_img = a.imaginary;
        if(a.imaginary < 0){sign = "-"; temp_img *= -1;}
        main_output.append(String.format("%s = %.2f %s %.2fi\n", s, a.real, sign, temp_img));
    }
    static complex add_complex(complex a, complex b){        //function to add 2 complex number
        complex c = new complex(0,0);
        c.real = a.real + b.real;
        c.imaginary = a.imaginary + b.imaginary;
        return c;
    }
    static complex subtract_complex(complex a, complex b){        //function to subtract 2 complex number
        complex c = new complex(0,0);
        c.real = a.real - b.real;
        c.imaginary = a.imaginary - b.imaginary;
        return c;
    }
    static complex multiply_complex(complex a, complex b){        //function to multiply 2 complex number
        complex c = new complex(0, 0);
        c.real = a.real * b.real - a.imaginary * b.imaginary;
        c.imaginary = a.real * b.imaginary + a.imaginary * b.real;
        return c;
    }
    static complex conjugate(complex a){
        complex c = new complex(0,0);
        c.real = a.real;
        c.imaginary = - a.imaginary;
        return c;
    }
    static complex divide_complex(complex a, complex b){       //function to divide 2 complex
        complex c = new complex(0, 0);
        c = multiply_complex(a, conjugate(b)); 
        c.real /= (b.imaginary * b.imaginary + b.real * b.real);
        c.imaginary /= (b.imaginary * b.imaginary + b.real * b.real);
        return c;
    }
    static complex polar(complex a){          //function to change rectengle to polar form
        complex c = new complex(0, 0);
        c.real = Math.sqrt(a.real * a.real + a.imaginary * a.imaginary);
        c.imaginary = Math.atan(a.imaginary / a.real);
        return c;
    }
    static void display_polar(complex a, String s){
        complex c = polar(a);
        System.out.printf("%s = %.2f < %.2f\n", s, c.real, c.imaginary);
    }

    
    private void button_displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_displayActionPerformed
        //input 
        double z1_real = Double.parseDouble(Z1_real.getText());
        double z1_imaginary = Double.parseDouble(Z1_imaginary.getText());
        complex z1 = new complex(z1_real, z1_imaginary);
        double z2_real = Double.parseDouble(Z2_real.getText());
        double z2_imaginary = Double.parseDouble(Z2_imaginary.getText());
        complex z2 = new complex(z2_real, z2_imaginary);
        double z3_real = Double.parseDouble(Z3_real.getText());
        double z3_imaginary = Double.parseDouble(Z3_imaginary.getText());
        complex z3 = new complex(z3_real, z3_imaginary);
        double z4_real = Double.parseDouble(Z4_real.getText());
        double z4_imaginary = Double.parseDouble(Z4_imaginary.getText());
        complex z4 = new complex(z4_real, z4_imaginary);
        String cb_str = (String)cb_zx1.getSelectedItem();
        complex zx = new complex(0,0);
        switch(cb_str){
            case "Z1" -> zx = z1;
            case "Z2" -> zx = z2;
            case "Z3" -> zx = z3;
            case "Z4" -> zx = z4;
        }
        display_complex(zx,"zx");
    }//GEN-LAST:event_button_displayActionPerformed

    private void button_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_calculateActionPerformed
        double z1_real = Double.parseDouble(Z1_real.getText());
        double z1_imaginary = Double.parseDouble(Z1_imaginary.getText());
        complex z1 = new complex(z1_real, z1_imaginary);
        double z2_real = Double.parseDouble(Z2_real.getText());
        double z2_imaginary = Double.parseDouble(Z2_imaginary.getText());
        complex z2 = new complex(z2_real, z2_imaginary);
        double z3_real = Double.parseDouble(Z3_real.getText());
        double z3_imaginary = Double.parseDouble(Z3_imaginary.getText());
        complex z3 = new complex(z3_real, z3_imaginary);
        double z4_real = Double.parseDouble(Z4_real.getText());
        double z4_imaginary = Double.parseDouble(Z4_imaginary.getText());
        complex z4 = new complex(z4_real, z4_imaginary);
        //for 1st combo box
        String cb_check_1 = (String)cb_zx1.getSelectedItem();
        complex zx1 = new complex(0,0);
        switch(cb_check_1){
            case "Z1" -> zx1 = z1;
            case "Z2" -> zx1 = z2;
            case "Z3" -> zx1 = z3;
            case "Z4" -> zx1 = z4;
        }
        //for 2st combo box
        String cb_check_2 = (String)cb_zx2.getSelectedItem();
        complex zx2 = new complex(0,0);
        switch(cb_check_2){
            case "Z1" -> zx2 = z1;
            case "Z2" -> zx2 = z2;
            case "Z3" -> zx2= z3;
            case "Z4" -> zx2 = z4;
        }
        //for operation combo box
        String cb_check_operation = (String)cb_operation.getSelectedItem();
        switch(cb_check_operation){
            case "+" -> display_complex(add_complex(zx1,zx2),
                                                       String.format("%s %s %s = ",
                                                                             (String)cb_zx1.getSelectedItem(),
                                                                             (String)cb_operation.getSelectedItem(),
                                                                             (String)cb_zx2.getSelectedItem()));
            case "-" -> display_complex(subtract_complex(zx1,zx2),
                                                       String.format("%s %s %s = ",
                                                                             (String)cb_zx1.getSelectedItem(),
                                                                             (String)cb_operation.getSelectedItem(),
                                                                             (String)cb_zx2.getSelectedItem()));
            case "*" -> display_complex(multiply_complex(zx1,zx2),
                                                       String.format("%s %s %s = ",
                                                                             (String)cb_zx1.getSelectedItem(),
                                                                             (String)cb_operation.getSelectedItem(),
                                                                             (String)cb_zx2.getSelectedItem()));
            case "/" -> display_complex(divide_complex(zx1,zx2),
                                                       String.format("%s %s %s = ",
                                                                             (String)cb_zx1.getSelectedItem(),
                                                                             (String)cb_operation.getSelectedItem(),
                                                                             (String)cb_zx2.getSelectedItem()));
        }
        
    }//GEN-LAST:event_button_calculateActionPerformed

    private void cb_operationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_operationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_operationActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(complex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(complex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(complex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(complex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new complex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Z1_imaginary;
    private javax.swing.JTextField Z1_real;
    private javax.swing.JTextField Z2_imaginary;
    private javax.swing.JTextField Z2_real;
    private javax.swing.JTextField Z3_imaginary;
    private javax.swing.JTextField Z3_real;
    private javax.swing.JTextField Z4_imaginary;
    private javax.swing.JTextField Z4_real;
    private javax.swing.JButton button_calculate;
    private javax.swing.JButton button_display;
    private javax.swing.JComboBox<String> cb_operation;
    private javax.swing.JComboBox<String> cb_zx1;
    private javax.swing.JComboBox<String> cb_zx2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea main_output;
    // End of variables declaration//GEN-END:variables
}
