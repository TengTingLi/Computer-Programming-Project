
/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template*/

package open_file_and_plot;
/**@author Teng Ting Li*/
import java.io.*;
public class open_file_and_plot {
    public static void main(String[] args) {
        PrintStream ps = openfile("Example.dat");
        
        double x, t;
        for(t = -50; t < 50 ; t += 0.5){
            x = 3.4 * Math.sin(t) + t;
            System.out.printf("%.2f %.2f\n", t, x);
            ps.printf("%.2f %.2f\n", t, x);
        }
        ps.close();
    }
    
    //method open file
    public static PrintStream openfile(String file_name){
        PrintStream ps = null;
        try{
            ps = new PrintStream(file_name);
        } catch(Exception e) {System.out.printf("Fail to open file\n");}
        return ps;}
    //method call gnuplot
    
}
