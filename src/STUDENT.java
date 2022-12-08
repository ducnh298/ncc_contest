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
//#include <iostream>
//#include <bits/stdc++.h>
//        using namespace std;
//
//class Student {
//    public:
//    int rank;
//    int count;
//};
//
//int C(int k, int n) {
//        if (k == 0 || k == n) return 1;
//        if (k == 1) return n;
//        return C(k - 1, n - 1) + C(k, n - 1);
//        }
//
//        int main() {
//        int N;
//        cin >> N;
//        vector<Student> v;
//        fflush(stdin);
//        for(int i =0 ;i<N;i++){
//        int temp;
//        cin>>temp;
//
//        Student s;
//        s.rank=temp;
//        s.count=1;
//        for(int j=0;j<v.size();j++){
//        if(temp == v[j].rank){
//        s.count = v[j].count;
//        s.count+=1;
//        v.erase(v.begin()+j);
//        break;
//        }
//        }
//        v.push_back(s);
//        }
//
//        for(int i=0;i<v.size();i++){
//        int result=0;
//        cout<<"i: "<<i<<endl;
//        for (int j=0;j<v.size();j++){
//        cout<<"   j: "<<j;
//        if(v[i].rank == v[j].rank)
//        result+=C(2,v[j].count-1);
//        else
//        result+=C(2,v[j].count);
//        cout<<"=> result: "<<result<<endl;
//        }
//
//        cout<<"====final result: "<<result<<endl;
//        }
//
//        }


