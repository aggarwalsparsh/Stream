public class CountOccurenceOfSubstring {
    public static void main(String[] args){
        String Str="scfdsa";
        String sub="sc";

        int count=0, index=0;
        //output: 3
        while((index = Str.indexOf(sub,index))!=-1){
            count++;
            index=index+sub.length();
        }
        System.out.println(count);




    }
}
