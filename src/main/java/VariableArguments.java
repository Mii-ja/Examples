import java.util.Arrays;

public class VariableArguments {

    public static void main(String[] args) {

        m3(12);
        m3(12,null);

    }

    private static void m3(int a, String... p) {

        System.out.println(a + " " + Arrays.toString(p));
    }

    private static void m3(int a) {


        System.out.println(a);
    }
}
