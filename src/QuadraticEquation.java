import java.util.Scanner;

public class QuadraticEquation {
    int a;
    int b;
    int c;
    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.pow(getDiscriminant(),0.5))/(2*a);
    }
    public double getRoot2(){
        return (-b-Math.pow(getDiscriminant(),0.5))/(2*a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao a:");
        int a = input.nextInt();
        System.out.println("Nhap vao b:");
        int b = input.nextInt();
        System.out.println("Nhap vao c:");
        int c = input.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        double x1 = quadraticEquation.getRoot1();
        double x2 = quadraticEquation.getRoot2();
        if (delta<0) System.out.println("Phuong trinh vo nghiem!");
        else if (delta ==0) System.out.println("co nghiem kep:" + x1);
        else System.out.printf("Phuong trinh co 2 nghiem: x1%f va x2=%f", x1,x2);


        }
    }

