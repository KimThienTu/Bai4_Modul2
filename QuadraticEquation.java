import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private  double b;
    private  double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return b * b - 4 * a * c;
    }
}

class Maiin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a, b, c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation qE = new QuadraticEquation(a, b, c);
        double delta = qE.getDiscriminant();

        if (delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("PT có 2 nghiệm là: " + x1 + " and " + x2);
        } else if (delta == 0){
            double x = -b / (2 * a);
            System.out.println("PT có 1 nghiệm là: " + x);
        } else {
            System.out.println("PT vô nghiệm");
        }
    }
}
