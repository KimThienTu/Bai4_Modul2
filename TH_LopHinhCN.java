import java.awt.*;
import java.util.Scanner;

public class TH_LopHinhCN {
   double width, height;
   public TH_LopHinhCN(){
   }

   public TH_LopHinhCN(double width, double height){
       this.width = width;
       this.height = height;
   }

   public double getArea(){
       return this.width * this.height;
   }

   public double getPerimeter(){
       return (this.width * this.height) * 2;
   }

   public String display(){
       return "Rectangle{" + "width=" + width + ", height=" + height + "}";
   }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập width: ");
        double width = sc.nextDouble();

        System.out.println("Nhập height");
        double height = sc.nextDouble();

        TH_LopHinhCN rc = new TH_LopHinhCN(width, height);
        System.out.println("Hình chữ nhật là: " + rc.display());
        System.out.println("Chu vi hình chữ nhật là: " + rc.getPerimeter());
        System.out.println("Diện tích hình chữ nhật là: " + rc.getArea());
    }
}