// "static void main" must be defined in a public class.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        String[] words = str.split("\\W+");
        System.out.println("array of words is : ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]+" ");
        }
        System.out.println("array of words is : "+Arrays.toString(words));
        System.out.println("\n");
        Arrays.toString(words);
        for(int i =0;i<words.length/2;i++){
            String temp = words[i];
            words[i]=words[words.length-i-1];
            words[words.length-i-1] = temp;
            
        }
        System.out.println("The reverse array is : ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]+" ");
        }
      System.out.println("The reversed array is : "+Arrays.toString(words));  
    }
}
