import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class STUDENT {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer n = Integer.valueOf(in.nextLine());
        String[] student = in.nextLine().split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            Integer rank = Integer.valueOf(student[i]);
            if (map.containsKey(rank)) {
                Integer count = map.get(rank);
                count+=1;
                map.put(rank, count);
            } else map.put(rank, 1);
        }

    }
}
