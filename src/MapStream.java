import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapStream {
    public static void main(String[] args){

         Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        int age=0;
        String s1="", s2="";
        Map<String, Integer> map = new HashMap<>();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(int i=0; i<n ;i++){
            s1=sc.nextLine();
            s2=sc.nextLine();

            LocalDate dob=LocalDate.parse(s2,formatter);
            age=Period.between(dob,LocalDate.now()).getYears();

            map.put(s1,age);

        }

        /*for(Map.Entry<String,Integer> entry: map.entrySet()){
            if(entry.getValue()>55){
                System.out.println(entry.getKey());

            }
        }*/

        // via Stream API
        map.entrySet()
           .stream()
                .filter(entry -> entry.getValue()>55)
                .forEach(entry -> {System.out.println(entry.getKey());});
    }
}
