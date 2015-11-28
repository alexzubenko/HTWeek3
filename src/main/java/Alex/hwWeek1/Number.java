package Alex.hwWeek1;

import java.util.Scanner;

/**
 * Created by alex on 28.11.15.
 */
public class Number {

    Scanner sc = new Scanner(System.in);

    private int number1;
    private int number2;

    public Number(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Number() {
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }


    public Number numberInput(){

        Number number = new Number();

        System.out.println("Please insert the first number: ");
        number.setNumber1(sc.nextInt());
        System.out.println("Please insert the second number: ");
        number.setNumber2(sc.nextInt());
        return number;
    }




    public int sum(Number number){

        int result = number.getNumber1()+number.getNumber2();
        System.out.println(result);
        return result;


    }

    public int minus(Number number){

        int result = number.getNumber1()-number.getNumber2();
        System.out.println(result);
        return result;

    }

    public int multiply(Number number){

        int result = number.getNumber1()*number.getNumber2();
        System.out.println(result);
        return result;

    }

    public int divide(Number number){

        int result = number.getNumber1()/number.getNumber2();
        System.out.println(result);
        return result;

    }


}
