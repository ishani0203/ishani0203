public class FirstProgram {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 32;
        int num3 = 2;
        //double num3 = 23.12345678901234567890;
        //float num4= 2.123456789f;
        //long num5 = 6789;
        String name="ishani";

        //System.out.println("first line");
        //System.out.println(name + " " +num1);

        if (num1 < num2)
            System.out.println(num2+" is greater than "+ num1);


        //greatest number of all 3
        if (num1>num2 && num1>num3)
                System.out.println(num1 + " is the greatest number.");
            else if (num2>num1 && num2>num3)
                System.out.println(num2 + " is the greatest number.");
        else
                System.out.println(num3+" is the greatest number.");

        // positive/negative
        //if (num1>=0)

        //even/odd
        if (num1%2 == 0)
            System.out.println(num1+" is even.");
        else
            System.out.println(num1+" is odd.");

        // number of digits




    }


}




