import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PACKAGE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer n = Integer.valueOf(in.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            for (int j = 0; j < b; j++)
                list.add(a);
            in.nextLine();
        }
        Collections.sort(list);
        System.out.println(list.get(in.nextInt() - 1));
    }
}
//#include <iostream>
//#include <bits/stdc++.h>
//        using namespace std;
//
//        int main() {
//        int N;
//
//
//        cin >> N;
//        vector<long> v;
//
//        for (int i = 0; i < N; i++) {
//        long a, b;
//        cin >> a >> b;
//        for( int j = 0;j<b;j++){
//        v.push_back(a);
//        }
//        }
//        sort(v.begin(), v.end());
//        int c;
//        cin>>c;
//        cout<<v[c-1];
//        }

