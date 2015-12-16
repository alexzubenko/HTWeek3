package alex.hwWeek1;

import java.util.Scanner;

/**
 * Created by alex on 28.11.15.
 */
public class CalculatorImpl {

    Scanner sc = new Scanner(System.in);

    public CalculatorImpl() {
        start();
    }




    Number num = new Number();



    public void start() {

        boolean exit = false;

        do {

        System.out.println("Please choose from the following options: ");
        System.out.println("1:Sum");
        System.out.println("2:Minus");
        System.out.println("3:Multiply");
        System.out.println("4:Divide");
        System.out.println("5:Exit");


        int input = sc.nextInt();




            switch (input) {
                case 1:num.sum(num.numberInput());break;
                case 2:num.minus(num.numberInput());break;
                case 3:num.multiply(num.numberInput());break;
                case 4:num.divide(num.numberInput());break;
                case 5:exit = true;break;
                default:System.out.println("Wrong input");

            }
        }

        while (!exit) ;


    }


}
