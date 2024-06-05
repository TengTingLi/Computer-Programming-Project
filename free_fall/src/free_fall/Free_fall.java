package free_fall;
/**@author Teng Ting Li*/
public class Free_fall {public static void main(String[] args) {
double y, t, dt = 0.01, g = 9.81, y0 = 10, tmax = 0;
for(t = 0; t < 10; t += dt){
    y = y0 - 0.5 * g * t * t;
    if(y <= 0) break;
    tmax = t;
    System.out.printf("%.2f  %.2f\n", t, y);
}
System.out.printf("Time taken to reach ground = %.2f\n", tmax);
}}
