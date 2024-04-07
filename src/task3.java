import java.util.Scanner;

public class task3 {
    public static void printprimeornot(int n) {
        if (n==2){
            System.out.println("prime");
        } else if (n%2!=0) {
            System.out.println("prime");

        }

        else{
            System.out.println("composite");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printprimeornot(n);
    }


}