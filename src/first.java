import java.util.Arrays;

public class first {
    public static void main(String[] args) {
        System.out.println("HEY RAM");
        String s = "Hello Iam Nandish";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(String.join("  ",arr));
    }

}
