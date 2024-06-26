
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * /*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template*/
 



/**
 *
 * @author Teng Ting Li
 * date 2-4-2023
 */
public class Bicycle extends javax.swing.JFrame {

    /**
     * Creates new form Radioactive_Decay_2023
     */
    public Bicycle() {
        initComponents();
    }

    //provided by Dr    
// <editor-fold defaultstate="collapsed" desc=" ${UrusanJavaPlot} ">


Graphics2D gg;
@Override 
public void paint(Graphics g){
gg = (Graphics2D) g;
super.paint(gg);
gg=(Graphics2D)PlotPanel.getGraphics();
}

double convfx, convfy;
int offsetj,offseti;
public void initPlot(double x1,double y1,double x2, double y2,
        int xoffset,int yoffset){

convfx=PlotPanel.getWidth()/(x2-x1);
convfy=PlotPanel.getHeight()/(y2-y1);
double dpx = xoffset/100.0;
double dpy = yoffset/100.0;
offseti=(int)(PlotPanel.getWidth()*dpx);
offsetj=(int)(PlotPanel.getHeight()*dpy);
double W = PlotPanel.getWidth();
double H = PlotPanel.getHeight();
gg.drawLine(0, offsetj ,PlotPanel.getWidth(),offsetj );
gg.drawLine(offseti, 0,offseti,PlotPanel.getHeight());
//PlotPanel.setBackground(Color.GREEN);
//draw scale x
for(int l=0;l<PlotPanel.getWidth();l=l+(PlotPanel.getWidth()/10)){
gg.drawLine(offseti+l, offsetj,offseti+l,offsetj+5);
gg.drawLine(offseti-l, offsetj,offseti-l,offsetj+5);
gg.drawString(""+String.format("%.1f",x2*(l/W)), offseti+l-5, offsetj+20);
gg.drawString(""+String.format("%.1f",x2*(-l/W)), offseti-l-5, offsetj+20);
}
//draw scale y
for(int p=0;p<H;p= p +(int)H/10){
gg.drawLine(offseti, offsetj-p,offseti-5,offsetj-p);
gg.drawLine(offseti, offsetj+p,offseti-5,offsetj+p);
gg.drawString(""+String.format("%.1f",y2*(p/H)), offseti-20, offsetj-p+5); 
gg.drawString(""+String.format("%.1f",y2*(-p/H)), offseti-25, offsetj+p+5);
}
}

public void plotPoint(double datax, double datay){
double sx,sy;
int i,j;
//calculate screen coordinates
sx=datax*convfx;
sy=datay*convfy;
//converst to integer plus axis offset
i=offseti+(int)sx;
j=offsetj-(int)sy;
gg.drawLine(i,j,i,j);

}
public void plotVector(double datax, double datay){
double sx,sy;
int i,j;
//calculate screen coordinates
sx=datax*convfx;
sy=datay*convfy;
//converst to integer plus axis offset
i=offseti+(int)sx;
j=offsetj-(int)sy;
gg.drawLine(offseti,offsetj,i,j);

}
public void plotVector1(double x0, double y0, double x, double y){
double sx0,sy0,sx,sy;
int i0,j0,i,j;
//calculate screen coordinates
sx0=x0*convfx;
sy0=y0*convfy;
sx=x*convfx;
sy=y*convfy;
//converst to integer plus axis offset
i0=offseti+(int)sx0;
j0=offsetj-(int)sy0;
i=offseti+(int)sx;
j=offsetj-(int)sy;
gg.drawLine(i0,j0,i,j);

}
private void setPenSize (int penSize) {
gg.setStroke(new BasicStroke(penSize));
gg.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);

}   
 public void setPenColor(Color penColor){
        gg.setColor(penColor);
        
    }
 
 public void drawString(String ss, int x, int y){
     gg.drawString(ss, offseti+x, offsetj-y);
     
 }
 
 
 
 
//Urusan File
public PrintStream openfile (String filename){
PrintStream ps = null;
try{
ps = new PrintStream (new FileOutputStream(filename));
}catch (IOException e){
    System.err.printf("\nProblem creating file:%s\n\n",filename);}
return ps;
}

public void callGnuplot(javax.swing.JTextArea GnuplotCommand){
        PrintStream ps = openfile("gnuplotcmd.plt");
        String strCmd = GnuplotCommand.getText();
        ps.printf("%s\n", strCmd);
        ps.close();

        Runtime callgp = Runtime.getRuntime();
        try {
           // Process prcs = callgp.exec("C:\\gnuplot\\bin\\wgnuplot -persist gnuplotcmd.plt");
            Process prcs = callgp.exec("wgnuplot gnuplotcmd.plt");
        } catch (IOException e) {
           System.err.println ("Error calling gnuplot");
        }
    }

// </editor-fold>
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Calculate_Button = new javax.swing.JButton();
        PlotPanel = new javax.swing.JPanel();
        exact = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Bicycle");

        Calculate_Button.setBackground(new java.awt.Color(255, 102, 102));
        Calculate_Button.setText("Calculate");
        Calculate_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_ButtonActionPerformed(evt);
            }
        });

        PlotPanel.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout PlotPanelLayout = new javax.swing.GroupLayout(PlotPanel);
        PlotPanel.setLayout(PlotPanelLayout);
        PlotPanelLayout.setHorizontalGroup(
            PlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        PlotPanelLayout.setVerticalGroup(
            PlotPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        exact.setBackground(new java.awt.Color(153, 255, 204));
        exact.setText("Exact solution");
        exact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exactActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("<html>   v_(i+1) = v_i + P/mv_i * &Delta t  </html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(Calculate_Button)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(exact, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(PlotPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(Calculate_Button)
                        .addGap(46, 46, 46)
                        .addComponent(exact, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(PlotPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   //Simulation of v vs t of bicycle without air resistence
    void Calculate(double t[], double v[],double dt, double power, double mass, double nmax){
        setPenColor(Color.red);
        gg.drawString("No resistence", 260, 160);
        for(int i = 0; i < nmax; i++){
            t[i+1] = t[i] + dt;
            v[i+1] = v[i] + power * dt / (mass * v[i]);
            plotPoint(t[i],v[i]);
        } 
        
    }
    
    //Simulation of v vs t of bicycle without air resistence
    void CalculateAir(double t[], double v[],double dt, double power, double mass, double nmax, double A){
        double C = 0.5;     //drag coeffection
        double rho = 1.0;   //density of air
        double B = A;    //area of bicycle
        gg.drawString("With resistence", 260, 300);
        for(int i = 0; i < nmax; i++){
            t[i+1] = t[i] + dt;
            v[i+1] = v[i] + power * dt / (mass * v[i]) - C * rho * B * v[i] * v[i] * dt / mass;
            plotPoint(t[i],v[i]);
        } 
    }
    
    
    
    private void Calculate_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate_ButtonActionPerformed
        double t[] = new double[10000];
        double v[] = new double[10000];
        double dt = 1;
        double power = 400;         //watt
        double mass = 70;           //kg
        double tmax = 200;          //second
        double nmax = tmax / dt;    //no unit
        v[0] = 4;
        initPlot(0,0,210,100,5,92);
        setPenSize(2);
        gg.drawString("time(s)", 260, 360);
        gg.drawString("velocity(ms^-1)", 30, 10);
        Calculate(t, v, dt, power, mass, nmax);
        CalculateAir(t, v, dt, power, mass, nmax, 0.33);
        drawString("0.33",150, 90);
        CalculateAir(t, v, dt, power, mass, nmax, 0.5);
        drawString("0.33",150, 100);
        CalculateAir(t, v, dt, power, mass, nmax, 0.77);
        drawString("0.33",150, 110);
    }//GEN-LAST:event_Calculate_ButtonActionPerformed

    private void exactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exactActionPerformed
        double N, N0 = 100, tau = 1, t = 0.01;
        initPlot(0, 0, 5, 120, 10, 90);
        setPenSize(2);
        setPenColor(Color.blue);
        for(t = 0, N0 = 100; t < 100; t += 0.01){
            N = N0 * Math.exp(-t * tau);
            plotPoint(t, N);
        }
        gg.drawString("Exact Solution for t = 0.01", 250, 250);
        gg.drawString(String.format("tau = %.0f", tau), 255, 50);
        setPenSize(3);
        setPenColor(Color.yellow);
        for(t = 0, N0 = 100; t < 100; t += 0.1){
            N = N0 * Math.exp(-t * tau);
            plotPoint(t, N);
        }
        gg.drawString("Exact Solution for t = 0.1", 250, 100);
        gg.drawString(String.format("tau = %.0f", tau), 255, 50);
        setPenSize(4);
        setPenColor(Color.red);
        for(t = 0, N0 = 100; t < 100; t += 1){
            N = N0 * Math.exp(-t * tau);
            plotPoint(t, N);
        }
        gg.drawString("Exact Solution for t = 1", 250, 200);
        gg.drawString(String.format("tau = %.0f", tau), 255, 50);
        
    }//GEN-LAST:event_exactActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Bicycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bicycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bicycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bicycle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bicycle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate_Button;
    private javax.swing.JPanel PlotPanel;
    private javax.swing.JButton exact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
