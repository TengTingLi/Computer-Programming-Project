
/*Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template*/

package complex_number;
/**@author Teng Ting Li*/
public class complex_number {
    double real, imaginary;
    complex_number(double a, double b){             //constructor
        this.real = a;
        this.imaginary = b;
    }
    public static void main(String[] args) {
        complex_number z1 = new complex_number(3, 4);
        complex_number z2 = new complex_number(-3, 2);
        complex_number z3 = new complex_number(-2, -5);
        display_complex(z1, "z1");
        display_complex(z2, "z2");
        display_complex(z3, "z3");
        display_complex(add_complex(z1, z2),"z1 + z2");
        display_complex(subtract_complex(z1, z2),"z1 - z2");
        display_complex(multiply_complex(z1, z2),"z1 * z2");
        display_complex(divide_complex(z1, z2),"z1 / z2");
        display_polar(z1, "z1 in polar");
        }
    static void display_complex(complex_number a, String s){          //function to display complex number
        String sign = "+";
        double temp_img = a.imaginary;
        if(a.imaginary < 0){sign = "-"; temp_img *= -1;}
        System.out.printf("%s = %.2f %s %.2fi\n", s, a.real, sign, temp_img);
    }
    static complex_number add_complex(complex_number a, complex_number b){        //function to add 2 complex number
        complex_number c = new complex_number(0,0);
        c.real = a.real + b.real;
        c.imaginary = a.imaginary + b.imaginary;
        return c;
    }
    static complex_number subtract_complex(complex_number a, complex_number b){        //function to subtract 2 complex number
        complex_number c = new complex_number(0,0);
        c.real = a.real - b.real;
        c.imaginary = a.imaginary - b.imaginary;
        return c;
    }
    static complex_number multiply_complex(complex_number a, complex_number b){        //function to multiply 2 complex number
        complex_number c = new complex_number(0, 0);
        c.real = a.real * b.real - a.imaginary * b.imaginary;
        c.imaginary = a.real * b.imaginary + a.imaginary * b.real;
        return c;
    }
    static complex_number conjugate(complex_number a){
        complex_number c = new complex_number(0,0);
        c.real = a.real;
        c.imaginary = - a.imaginary;
        return c;
    }
    static complex_number divide_complex(complex_number a, complex_number b){       //function to divide 2 complex
        complex_number c = new complex_number(0, 0);
        c = multiply_complex(a, conjugate(b)); 
        c.real /= (b.imaginary * b.imaginary + b.real * b.real);
        c.imaginary /= (b.imaginary * b.imaginary + b.real * b.real);
        return c;
    }
    static complex_number polar(complex_number a){          //function to change rectengle to polar form
        complex_number c = new complex_number(0, 0);
        c.real = Math.sqrt(a.real * a.real + a.imaginary * a.imaginary);
        c.imaginary = Math.atan(a.imaginary / a.real);
        return c;
    }
    static void display_polar(complex_number a, String s){
        complex_number c = polar(a);
        System.out.printf("%s = %.2f < %.2f\n", s, c.real, c.imaginary);
    }
}
