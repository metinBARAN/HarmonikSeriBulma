import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   int num;
       double result=0;

        Scanner inp=new Scanner(System.in);
        System.out.println("N sayisini giriniz:");
        num= inp.nextInt();

        for (double i=1;i<=num;i++){
            result+=(1/i);

        }
        System.out.println("Harmanik Seri: "+result);
    }
}
