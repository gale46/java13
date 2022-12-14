import static java.lang.System.out;

import java.io.*;
public class Class13 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if (str.equals("520")) {
            out.println("這是由字串520所引起的例外");
        } else {
            out.println(str);
        }

    }
}
