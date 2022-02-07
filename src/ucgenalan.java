import java.util.Scanner;
public class ucgenalan {
    public static void main(String[] args) {
        double a, b, c, alan, u;
        Scanner input = new Scanner(System.in);


        System.out.print("Üçgenin 1.kenarını giriniz :");
        a = input.nextDouble();

        System.out.print("Üçgenin 2.kenarını giriniz :");
        b = input.nextDouble();

        c = Math.sqrt ((a*a)+(b*b));
        System.out.println("Hipotenüs :" + c);


        System.out.println("Üçgenin Alanının Hesaplaması");


        System.out.print("Üçgenin 1.kenarını giriniz :");
        a = input.nextInt();

        System.out.print("Üçgenin 2.kenarını giriniz :");
        b = input.nextInt();

        System.out.print("Üçgenin 3.kenarını giriniz :");
        c = input.nextInt();


        u=(a+b+c)/2;
        alan = Math.sqrt (u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı :" + alan);
    }

}
