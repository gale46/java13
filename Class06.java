import static java.lang.System.out;
public class Class06 {
    public static void main(String args[]) {
        int num = 12;
        int den[] = { 12, 0, 3, 0, 0, 4 };

        try{
            for(int i = 0; i < 10; i++){
                out.println("ans=" + num/den[i]);
            }
        } catch (Exception e) {
            out.println("捕捉到例外了");
        }
    }
}
