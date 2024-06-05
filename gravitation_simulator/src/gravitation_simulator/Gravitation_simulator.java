package gravitation_simulator;

/**
 * @author Teng Ting Li
 */
public class Gravitation_simulator {public static void main(String[] args) {
/*
step to calculate resultent force for a mass body for one step
1) define 6 mass body of mass, position xy, force component xy , resultent force
    >only calculate force of 1st body mass (act as center)
2) using Gmm/r^2 to find x and y component of force for all body
3) calculate resultent force
*/
double mass[] = {10,50,40,30,5,10};                        
double px[] = {0, 9.4, -4.0, 0.6, 6.7, -9.2};               
double py[] = {0, -7.7, -4.0, 1.1, 5.9, 9.4};
double fx = 0, fy = 0;                                              //initial resultent force component of x & y 
double G = 6.674e-11;                                             //G is gravitaional constant
for(int i = 1; i < 6 ; i++){                                            //loop 5 times for 5 body
    double fx_temp = (G*mass[i])/(px[i]*px[i]);           //find force component x between just 2 body
    fx += px[i] >= 0 ? fx_temp : (-1*fx_temp);                //add or subtract ^^^ force to resultent fx
    double fy_temp = (G*mass[i])/(py[i]*py[i]);           //same with ^^^^ but for y
    fy += py[i] >= 0 ? fy_temp : (-1*fy_temp);                
    System.out.printf("result with mass %.0fkg at x = %.1f, y = %.1f, new fx = %.3e, fy = %.3e \n", mass[i], px[i], py[i], fx, fy);
    }
double resultent_force = Math.sqrt(fx*fx+fy*fy);
double direction = Math.atan2(fy, fx)/Math.PI*180;
System.out.println("the resultent force is " + resultent_force + "N at " + direction + " in degree");
}}
