    public class diamondOfStars {

        public static void main(String[] args) {

            int diamondHeight=6;

             for (int row = 0; row <= diamondHeight; row++){

                 for (int space = diamondHeight; space >= row; space--){
                     System.out.print(" ");
                 }
                 //number of stars directly related to number of row. ex: 2nd row will have 2 stars
                 for (int star = 1; star <= row; star++){
                     System.out.print("* ");
                 }
                 System.out.println();
             }

            //counting the rows backwards from 5
            for (int row = diamondHeight-1; row >= 0; row--){

                for (int space = row; space <= diamondHeight; space++){
                    System.out.print(" ");
                }
                //number of stars directly related to number of row: 2nd row will have 2 stars
                for (int star = row; star >= 1; star--){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

    }