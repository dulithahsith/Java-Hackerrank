import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    //\\d means [0-9] here all the correct possibilities are checked and | symbol used as or condition
    public String pattern="((\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d|\\d\\d|[0-1]\\d\\d|2[0-4]\\d|25[0-5])";
}
