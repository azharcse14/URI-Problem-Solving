import java.util.Scanner;

public class URI1011 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double R = scanner.nextDouble();

        double pi =  Math.PI;

        double volume = (4.00/3) * pi * Math.pow(R,3);

        System.out.printf("VOLUME = %.2f\n", volume);
    }
}
