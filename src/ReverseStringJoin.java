public class ReverseStringJoin {
    public static void main(String[] args){
        String str="Java is fun";
        String output="avaJ si nuf";

        String[] strArr= str.split(" ");
        StringBuilder result=new StringBuilder();

        for(String s: strArr){
            StringBuilder reversed = new StringBuilder(s).reverse();
            result.append(reversed).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
