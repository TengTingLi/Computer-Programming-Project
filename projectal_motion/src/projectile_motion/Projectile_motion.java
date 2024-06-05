package projectile_motion;
/**@author Teng Ting Li*/
public class Projectile_motion {public static void main(String[] args) {
double x = 0, y = 0, t, dt = 0.1, g = 9.81, y0 = 10;
double ymax = 0, tmax = 0, tof = 0, range = 0;
double v0 = 100, v0x, v0y, vx, vy, angle = 60;
v0x = v0 * Math.cos(Math.toRadians(angle));
v0y = v0 * Math.sin(Math.toRadians(angle));
for(t = 0; t < 50; t += dt){
    if(y > ymax){tmax = t; ymax = y;}
    else if(y < 0){
        tof = t;
        range = x;
        break;
    }
    x = v0x * t;
    y = v0y * t - 0.5 * g * t * t;
    System.out.printf("%.1f  %.1f\n", x, y);
}
System.out.printf("ymax = %.1f  tmax = %.1f\n tof = %.1f  range = %.1f\n", ymax, tmax, tof, range);
}}
