
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import javax.swing.JFrame;

/*
 * /*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template*/
 



/**
 *
 * @author Teng Ting Li
 * date 5-4-2023
 */
public class Baseball_Effect_of_Spin extends javax.swing.JFrame {

    /**
     * Creates new form Radioactive_Decay_2023
     */
    public Baseball_Effect_of_Spin() {
        initComponents();
    }

    //provided by Assosiate Prof ABD Rahman Tamuri
    //edited by Teng Ting Li
    //version 1.1.1
    // <editor-fold defaultstate="collapsed" desc=" ${Changelog} ">
    /*
    1.1.0 - initPlot will clear panel with background colour
          - defult draw format is size 1 and black to draw axis more nicely
          - rename PlotPanel to plot_panel
    1.1.1 - change clear background code to use .update method
    */
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc=" ${UrusanJavaPlot} ">


Graphics2D gg;
@Override 
public void paint(Graphics g){
gg = (Graphics2D) g;
super.paint(gg);
gg=(Graphics2D)plot_panel.getGraphics();
}

double convfx, convfy;
int offsetj,offseti;
public void initPlot(double x1,double y1,double x2, double y2,int xoffset,int yoffset){
    //clear panel but keep bg colour
    plot_panel.update(gg);  //because gg.clearRect is bs and gg.fillRect need one more code
    
    //set axis drawing format
    setPenSize(1);
    setPenColor(Color.black);
    
    //magic
    convfx=plot_panel.getWidth()/(x2-x1);
    convfy=plot_panel.getHeight()/(y2-y1);
    double dpx = xoffset/100.0;
    double dpy = yoffset/100.0;
    offseti=(int)(plot_panel.getWidth()*dpx);   //location of the axis line
    offsetj=(int)(plot_panel.getHeight()*dpy);
    double W = plot_panel.getWidth();
    double H = plot_panel.getHeight();
    gg.drawLine(0, offsetj ,plot_panel.getWidth(),offsetj );
    gg.drawLine(offseti, 0,offseti,plot_panel.getHeight());
    //plot_panel.setBackground(Color.GREEN);
    //draw scale x
    for(int l=0;l<plot_panel.getWidth();l=l+(plot_panel.getWidth()/10)){
    gg.drawLine(offseti+l, offsetj,offseti+l,offsetj+5);
    gg.drawLine(offseti-l, offsetj,offseti-l,offsetj+5);
    gg.drawString(""+String.format("%.0f",x2*(l/W)), offseti+l-5, offsetj+20);
    gg.drawString(""+String.format("%.0f",x2*(-l/W)), offseti-l-5, offsetj+20);
}
//draw scale y
for(int p=0;p<H;p= p +(int)H/10){
gg.drawLine(offseti, offsetj-p,offseti-5,offsetj-p);
gg.drawLine(offseti, offsetj+p,offseti-5,offsetj+p);
gg.drawString(""+String.format("%.0f",y2*(p/H)), offseti-20, offsetj-p+5); 
gg.drawString(""+String.format("%.0f",y2*(-p/H)), offseti-25, offsetj+p+5);
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
 
 public void label_x(String xlab){
        char[] ch = xlab.toCharArray();
        
        
        int axisBounds = 10;
        drawString(xlab, plot_panel.getWidth()-offseti,axisBounds);
        
    }

    public void label_y(String ylab){  
        char[] ch = ylab.toCharArray();
        int charspace = 10; 
        int axisBounds = 10;
        for(int i=0; i<ch.length;i++){
            drawString(Character.toString(ch[i]),axisBounds,-charspace*(1+i)+offsetj);
        }
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
        button_resistance = new javax.swing.JButton();
        plot_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_output = new javax.swing.JTextArea();
        text_initial_velocity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("<html>\nBaseball Effect of Spin\n</html>\n\n");

        button_resistance.setBackground(new java.awt.Color(255, 102, 102));
        button_resistance.setForeground(new java.awt.Color(255, 255, 255));
        button_resistance.setText("Calculate");
        button_resistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resistanceActionPerformed(evt);
            }
        });

        plot_panel.setBackground(new java.awt.Color(204, 255, 204));
        plot_panel.setForeground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout plot_panelLayout = new javax.swing.GroupLayout(plot_panel);
        plot_panel.setLayout(plot_panelLayout);
        plot_panelLayout.setHorizontalGroup(
            plot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 555, Short.MAX_VALUE)
        );
        plot_panelLayout.setVerticalGroup(
            plot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
        );

        txt_output.setColumns(20);
        txt_output.setRows(5);
        jScrollPane1.setViewportView(txt_output);

        text_initial_velocity.setText("40");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Initial velocity");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_initial_velocity, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_resistance, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(plot_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_resistance)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(text_initial_velocity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(200, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(plot_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
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

    //globle variable
    double dt = 0.001;
    double v0;
    double theta = 55;
    double A_m = 4e-5;      //A2/m, propotional to drag force
    double x[] = new double[20000];
    double y[] = new double[20000];
    double z[] = new double[20000];
    double omega = -30 * 2 * Math.PI;
    double S0m = 4.1e-4;
    
    double find_max(double num[]){
        double max = 0;
        for(int i = 0; i < num.length - 1; i++){
            max = max < num[i] ? max = num[i] : max;
        }
        return max;
    }
    
    //Simulation of v vs t of cannon with air resistence
    void calculate(double x[], double y[], double z[], double dt, double v0, double theta, 
                   double A_m, double omega, double S0m){
        x[0] = y[0] = z[0] = 0;    //hard code for initial value
        double theta_r = Math.toRadians(theta);
        double vx = v0 * Math.cos(theta_r);
        double vy = v0 * Math.sin(theta_r);
        double vz = 0;
        for(int i = 0; i < 10000; i++){
            double f = A_m * Math.sqrt(vx*vx+vy*vy+vz*vz);
            vx = vx - f * vx * dt;
            vy = vy - 9.9 * dt;   //mf be hardcoding gravity
            vz = vz - S0m * vx * omega * dt - f * vx * dt;
            x[i+1] = x[i] + vx * dt;
            y[i+1] = y[i] + vy * dt;
            z[i+1] = z[i] + vz * dt;
            if(y[i]<0) break;   //prevent ploting below ground
            plotPoint(x[i], y[i]);
            plotPoint(x[i], z[i]);
        }
        
        txt_output.append(String.format("Theta: %.2f\n", theta));
        txt_output.append(String.format("Max Height: %.2f\n", find_max(y)));
        txt_output.append(String.format("Max Distance: %.2f\n", find_max(x)));
        txt_output.append(String.format("Max Deflection: %.2f\n\n", find_max(z)));

        drawString(String.format("theta = %.0f", theta), 400, (int)(theta*2)+200);  //display theta
    }
    
    
    private void button_resistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resistanceActionPerformed
        v0 = Double.parseDouble(text_initial_velocity.getText());
        initPlot(0,0,250,100,10,85);
        drawString("Distance (m)", 200, -30);
        drawString("Heigth (m)", 10, 300);
        for(theta = 5; theta < 55; theta += 10){
            int r = (int)(Math.random()*255);   //get random color value
            int g = (int)(Math.random()*255);
            int b = (int)(Math.random()*255);
            Color random_color = new Color(r,g,b);  //construct custum color
            setPenColor(random_color);
            calculate(x, y, z, dt, v0, theta, A_m, omega, S0m);
        }
        
    }//GEN-LAST:event_button_resistanceActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(Baseball_Effect_of_Spin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Baseball_Effect_of_Spin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Baseball_Effect_of_Spin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Baseball_Effect_of_Spin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Baseball_Effect_of_Spin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_resistance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel plot_panel;
    private javax.swing.JTextField text_initial_velocity;
    private javax.swing.JTextArea txt_output;
    // End of variables declaration//GEN-END:variables
}
