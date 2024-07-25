import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        intList.removeIf(x -> x <= 0);
        intList.removeIf(x -> x % 2 != 0);
        intList.sort(Comparator.naturalOrder());
        intList.forEach(System.out::println);
    }
}
