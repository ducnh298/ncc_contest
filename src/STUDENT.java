import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class STUDENT {

    public static long tinhGiaithua(int n){

        long ketqua=1;
        int i;
        for(i=2;i<=n;i++)
        {
            ketqua*=i;
        }
        return ketqua;
    }
    public static long tinhTohop(int k, int n){
        return tinhGiaithua(n)/(tinhGiaithua(k)*tinhGiaithua(n-k));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Integer n = Integer.valueOf(in.nextLine());
        String[] student = in.nextLine().split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if(map.get(student[i])!=null)
                map.put(student[i],map.get(student[i])+1);
            else map.put(student[i],1);
        }

        for (int i = 0; i < n; i++) {
            long result = 0;
            for (Map.Entry<String, Integer> item : map.entrySet()) {
                if (student[i].equalsIgnoreCase(item.getKey())) {
                    if (n > 2)
                        result += tinhTohop(2, item.getValue() - 1);
                }
                else if(item.getValue()>=2) result += tinhTohop(2, item.getValue());
            }
            System.out.println(result);
        }

    }
}

//
//#include <iostream>
//#include <bits/stdc++.h>
//        using namespace std;
//
//class Student {
//    private:
//    int rank;
//    int count;
//    long result;
//    bool isCal=0;
//    public:
//    int getRank(){
//        return rank;}
//    int getCount(){
//        return count;}
//    long getResult(){
//        return result;
//    }
//    bool getIsCal(){
//        return isCal;}
//
//    void setRank(int x){
//        rank = x;
//    }
//    void setCount(int x){
//        count = x;
//    }
//    void setResult(long x){
//        result = x;}
//    void setIsCal(bool x){
//        isCal = x;}
//
//    bool operator<(Student const &p) const {
//        return getRank() < p.getRank() || (getRank() == p.getRank() && getCount() < p.getCount());
//    }
//};
//
//int C(int k, int n) {
//        if (k == 0 || k == n) return 1;
//        if (k == 1) return n;
//        return C(k - 1, n - 1) + C(k, n - 1);
//        }
//
//        long calResult(set<Student> set,int rank ){
//        long result = 0;
//        for(Student item: set){
//        cout<<"-----"<<item.getCount()<<endl;
//        if(rank==item.getRank()){
//        if(item.getCount()>2)
//        result += C(2,item.getCount()-1);
//        }
//        else if(item.getCount()>1)
//        result += C(2,item.getCount());
//        }
//        //cout<<endl<<"-------"<<endl<<result<<endl<<"-------"<<endl;
//        return result;
//        }
//
//        int main() {
//        int N;
//        cin >> N;
//
//        set<Student> set;
//        vector<int> num;
//
//
//        for(int i =0 ;i<N;i++){
//        int temp;
//        cin>>temp;
//
//        num.push_back(temp);
//        Student s;
//        s.setRank(temp);
//        set.insert(s);
//        }
//
//        for(Student item:set){
//        int count = std::count(num.begin(), num.end(),item.getRank());
//        item.setCount(count);
//        }
//
//        for(int i:num){
//        for (Student item:set){
//        if(i==item.getRank()){
//        if(item.getIsCal()==0){
//        item.setResult(calResult(set,i));
//        item.setIsCal(1);
//        cout<<"rank: "<<item.getRank()<<" ,count: "<<item.getCount()<<" ,result: "<<item.getResult()<<" ,isCal: "<<item.getIsCal()<<endl;
//        }
//        cout<<item.getResult()<<endl;
//        }
//        }
//        }
//        }