import java.util.Arrays;

public class class3July17 {

    public static void main(String[] args) {

        //Find factorial of a number using loops
       /* for (int i = 1; i >= 5; i++) {

            int fact = i;

        }
*/
        //factorial using while loop
        /*
        int j=1;
        int fact=1;
        while (j>0) {
            fact *= j;
            j++;
        }
        */

        // using continue and break inside 2 for loops
        /*
        int k,h=0;
        for (k=0; k<2; k++){
            System.out.println("");
            System.out.println("k= "+k);
            System.out.println("");
            for (h=1; h<3; h++){
                System.out.println("h= "+h);
            }
        }
        */


        /**
         * make a switch statement
         * 1. You are. anew student to Pragra
         * 2. You are an existing student
         * 3. You are in waiting List
         * 4. YOu have gradutes the all programs
         * 5. You are not qualified to enroll
*/

        /*
        switch (student) {
            case 1:
                System.out.println("You are. anew student to Pragra");
                break;
            case 2:
                System.out.println("You are an existing student");
                break;
            case 3:
                System.out.println("You are in waiting List");
                break;
            case 4:
                System.out.println("YOu have gradutes the all programs");
                break;
            case 5:
                System.out.println("You are not qualified to enroll");
                break;
            default:
                System.out.println("invalid entry.");
        }
    */

        //arrays

        //print out length of array
        int aiMyArray[]={1,2,3,4,5,6};
            for(int ar = 0; ar < aiMyArray.length; ar++){
                aiMyArray[ar]=ar+1;
            }
        System.out.println(aiMyArray.length);
        System.out.println("end of array length");
        System.out.println("");

        //print out sum of decimal values

        double sum=0;
        double decimals[]={1.12,2.23,3.34,4.45,5.56,6.67};
            for (int i=0; i<decimals.length;i++ ){
                sum += decimals[i];
        }
        System.out.println("The sum of all decimal values is : "+sum);
        System.out.println("");


        //print out name using char array


        //2-D array
        /**
         * 1   2   3
         * 4   5   6
         */
        int aiM[][]={{1,2,3},{4,5,6}};
            for (int col=0; col<aiM.length; col++){
                for (int row=0; row< aiM[col].length; row++){
                    System.out.print(aiM[col][row]);
                }
                System.out.println(" end of row");
                System.out.println("end of col");
            }
        System.out.println("");
        System.out.println("");
/*
        int array[][]={{0,1,2},{3,4,5},{6,7,8},{9,10,11},{12,13,14}};
        for (int col=0; col<array.length; col++) {
            for (int row = 0; row < array[col].length; row++) {
                //int sum = ;
                System.out.println(aiM[col][row]);
            }
        }
*/
        // converting char array to string
        char arrch[]={'h','e','l','l','o'};
                String str4 = new String(arrch);
        System.out.println(str4);

        /**
         * using "new String" defines a different string object
         * otherwise, the
         *
         */
        String str1 = new String("Hello");
        String str2 = "Hello";
        String str3 = "Hello";
        if (str1 == str2)
            System.out.println("str1 == str2 is True");
        else
            System.out.println("str1 == str2 is False");
        if (str2 == str3)
            System.out.println("str2 == str3 is True");
        else
            System.out.println("str2 == str3 is False");




    }
}
