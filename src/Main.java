import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        System.out.println("hello world");
        int age = 17;
        double gpa = 1.8;
        boolean isRaining = false;
        System.out.println(age + "|" + gpa + "|" + isRaining);

        String city = "england";
        System.out.println(city);
        System.out.println(city.toUpperCase());

        int dailyHighs[] = {50, 60, 70, 80, 90};
        System.out.println(dailyHighs.length);

        for(int i=0; i<dailyHighs.length; i++) {
            System.out.println(dailyHighs[i]);


        }

        Scanner input = new Scanner(System.in);

        System.out.println("what is though name?????????????");
        String name = input.nextLine();
        System.out.println(name.toLowerCase());
    }
}