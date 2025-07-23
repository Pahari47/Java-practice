import java.util.Scanner;

public class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    Complex substract(Complex c) {
        return new Complex(this.real - c.real, this.imag - c.imag);
    }
    Complex multiply(Complex c) {
        int r = this.real * c.real - this.imag * c.imag;
        int i = this.real * c.imag + this.imag * c.real;
        return new Complex(r, i);
    }

    void display() {
        if (imag >= 0) {
            System.out.println(real + "+" + imag + "i");
        } else {
            System.out.println(real + "-" + Math.abs(imag) + "i");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the real and imaginary part of first complex number : ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        System.out.print("Enter the real and imaginary part of second complex number : ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.add(c2);
        Complex diff = c1.substract(c2);
        Complex prod = c1.multiply(c2);

        System.out.print("Sum : ");
        sum.display();

        System.out.print("Differece : ");
        diff.display();

        System.out.print("Product : ");
        prod.display();
    }
}
