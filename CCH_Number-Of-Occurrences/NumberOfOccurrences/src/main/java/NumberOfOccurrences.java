import java.util.Scanner;
//import java.util.TreeMap;

/**
 *
 * @author Luchn1k
 */
public class NumberOfOccurrences {

    public static void sortDataArray(String[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if ((data[j].toLowerCase()).compareTo(data[j + 1].toLowerCase()) > 0) {
                    String temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static String countNumbers(String text) {
     if(text.length() > 0){
         text = text.replaceAll("[^\\x00-\\x7F]", "");
         text = text.replaceAll("[\\p{Cntrl}&&[^\r\n\t]]", "");
         text = text.replaceAll("[^a-zA-Z0-9]", "");
         text = text.trim().replaceAll("\\p{C}", "").replaceAll(" ", "");
         String[] data = text.split("");
         sortDataArray(data);
         String currentValue = data[0].toLowerCase();
         String returnData ="";
         int numberOfOccurrences  = 0;

         for(String s : data){
             if(s.toLowerCase().equals(currentValue)){
                 numberOfOccurrences++;
             }else{
                 returnData += currentValue+" - "+numberOfOccurrences+"\n";
                 currentValue= s.toLowerCase();
                 numberOfOccurrences = 1;
             }
         }
         returnData += currentValue+" - "+numberOfOccurrences;
         return returnData;
     }
         return "Need a text";

    }



    public static void main(String[] args) {
        Scanner scanner;
        System.out.println("Welcome to letter counter\n");
        System.out.print("Enter your text here >>> ");
        scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        System.out.println(countNumbers(text));
        // alt(data);

    }
  /*  public static void alt(String[] data){
        TreeMap<String,Integer> list = new TreeMap();
        for(String s: data){
            if(list.containsKey(s.toLowerCase())){
                list.merge(s.toLowerCase(), 1, Integer::sum);
            }else{
                list.put(s.toLowerCase(), 1);
            }
        }
        System.out.println(list.toString());
    }*/
}
