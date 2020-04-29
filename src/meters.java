import java.util.Scanner;
public class meters {
    public static void main(String[] args) {

        int num1,num2,inch;
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter first number:");
        num1 = keyboard.nextInt();
        System.out.print("Enter second number:");
        num2 = keyboard.nextInt();
        System.out.println(num1*num2);

        System.out.print("Enter inches to convert to meters:");
        inch=keyboard.nextInt();
        meterConvert(inch);
    }

    public static void meterConvert(int x){
        //converts inches to meters
        double meter=x*0.0254;
        System.out.print(meter+" Meters");

    }
}
