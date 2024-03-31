/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class LinearEquation {

    private double a, b, c, d, e, f;

    public LinearEquation() {
        this(0, 0, 0, 0, 0, 0);
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (a * d) - (b * c) != 0;
    }

    public double getX() {
        if (isSolvable()) {
            return (e * d - b * f) / (a * d - b * c);
        } else {
            return Double.NaN;
        }
    }

    public double getY() {
        if (isSolvable()) {
            return (a * f - e * c) / (a * d - b * c);
        } else {
            return Double.NaN;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai a: ");
        double a = scanner.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = scanner.nextDouble();

        System.out.print("Masukkan nilai d: ");
        double d = scanner.nextDouble();

        System.out.print("Masukkan nilai e: ");
        double e = scanner.nextDouble();

        System.out.print("Masukkan nilai f: ");
        double f = scanner.nextDouble();

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            System.out.println("Solusi untuk persamaan:");
            System.out.printf("x = %.2f\n", equation.getX());
            System.out.printf("y = %.2f\n", equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
    }
}
