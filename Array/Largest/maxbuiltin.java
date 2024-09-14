import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {32,654,344,65,23};

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }
}
