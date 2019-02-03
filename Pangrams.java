import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Pangrams {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        char[] tmp = s.toLowerCase().toCharArray();
        Set<Character> hs = new LinkedHashSet<Character>();
        for(char c: tmp){
            if(! Character.isLetter(c))
                continue;
            hs.add(c);
        }
        System.out.println(hs.toString());
        if(hs.size() == 26)
            return "pangram";
        else
            return "not pangram";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
