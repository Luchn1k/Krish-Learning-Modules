import java.util.Scanner;

public class MissingNumberFinder {
    public static void sortArray(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tempVal = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tempVal;
                }
            }
        }
    }

    public static int[] convertToIntArray(String[] data) throws NumberFormatException {
        int[] temp = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            temp[i] = Integer.parseInt(data[i].trim());

        }

        return temp;
    }

    public static String findMissingNumber(String[] textArray) {
       try{
           int[] data=  convertToIntArray(textArray);
           if (data.length > 2) {
               sortArray(data);
               int missingNumber = data[0];
               int numberCounter = 0;
               boolean found = false;
               for (int i = data[0]; i <= data[data.length - 1]; i++) {
                   if (i != data[numberCounter]) {
                       if (!found) {
                           missingNumber = i;
                           found = true;
                           i++;
                       } else {
                           return "More than one number is missing";
                       }
                   }
                   numberCounter++;
               }
               if (found) {
                   return missingNumber + " is the missing number";
               }
               return "This is a perfect sequence. No number is missing";

           }
           return "not enough data to find missing number";
       }catch (NumberFormatException ex){
           return "You are only allowed to enter numbers dividend by a space";
       }
    }

    public static void main(String[] args) {
        Scanner scanner;
        System.out.println("Welcome to missing number finder\nplease enter your number sequence divided by a space");
        scanner = new Scanner(System.in);
        System.out.print("Enter Your Sequence >>> ");
        String numberSequence = scanner.nextLine();
        scanner.close();
        String[] splitArray = numberSequence.split(" ");
        System.out.println(findMissingNumber(splitArray));


    }

}
