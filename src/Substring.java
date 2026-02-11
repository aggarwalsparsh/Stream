import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Substring {
    public static void main(String[] args){

        /*Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str1="", str2="", str3="";
        List<String> list = new ArrayList<>();

        for(int i=0; i<n*2; i++){
            str1=sc.next();
            list.add(str1);
        }*/

        int n=2;
        String str1="", str2="", str3="";

        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Bye");
        list.add("Hello");
        list.add("World");


        for(int i=0; i< list.size(); i++) {
         System.out.println(list.get(i));
        }

        int count=0;
        for(int j=0; j< list.size();j++) {
            str2 = list.get(j);
            str3 = list.get(j + 1);

            //System.out.println(str2);
            //System.out.println(str3);

            for(int k=0; k<str2.length(); k++) {
                if(str3.contains(str2.valueOf(str2.charAt(k)))) {
                    count++;
                }
               // System.out.println(count);
            }
            if(count==0){
                System.out.println("NO");
            }
            else
                System.out.println("YES");

            j=j+1;

        }
    }
}
