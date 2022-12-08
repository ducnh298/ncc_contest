//#include <iostream>
//#include <bits/stdc++.h>
//        using namespace std;
//
//class Package {
//    public:
//    long weight;
//    long count;
//    bool operator > (const Package& p) const
//    {
//        return (weight > p.weight);
//    }
//};
//
//int main() {
//        long N;
//
//        cin >> N;
//        vector<Package> v;
//
//        for (long i = 0; i < N; i++) {
//        long a, b;
//        cin >> a >> b;
//        Package p;
//        p.weight=a;
//        p.count=b;
//        v.push_back(p);
//        fflush(stdin);
//        }
//        sort(v.begin(), v.end(),greater<Package>());
//        long c;
//        cin>>c;
//        while(c>0){
//        Package temp = v.back();
//        v.pop_back();
//        c-=temp.count;
//        if(c<=0){
//        cout<<temp.weight;
//        break;
//        }
//        }
//        }
//
//
