import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class STUDENT {

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static long tinhTohop(int k,int n){

        return factorial(n)/(factorial(k)*factorial(n-k));

    }

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
            System.out.println(rank+" ------ "+map.get(rank));
        }
        for (int i = 0; i < n; i++) {
            Map<Integer,Integer> temp = new HashMap<>();
            temp.putAll(map);

            Integer rank = Integer.valueOf(student[i]);
            Integer count = temp.get(rank);
            count-=1;
            temp.put(rank, count);
            int result = 0;
            for (Map.Entry<Integer, Integer> item : temp.entrySet()) {
                if (item.getValue() > 1) result += tinhTohop(2,item.getValue());
            }
            System.out.println(result);
        }
    }
}
