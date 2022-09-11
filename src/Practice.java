import java.util.Scanner;



public class Practice {
      private String Reverse(String w){
        String reversed = "";
        for(int i=w.length()-1; i>=0; i--){
            char ch= w.charAt(i);
            reversed +=ch;
        }
        //System.out.println(reversed);
        return reversed;
    }
    public String show(String w){
        String input_string = w;
        return  Reverse(input_string);
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your string: ");
        String word=scan.nextLine();

        Practice practice=new Practice();
        System.out.println(practice.show(word));


    }
}
