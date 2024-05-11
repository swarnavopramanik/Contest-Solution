https://codeforces.com/contest/1971/problem/D

#include<bits/stdc++.h>
using namespace std;
int T,answer;
string S;
int main() {
	cin>>T;
	while(T--) {
		cin>>S;
		bool sp = false;
		answer = 1;
		int num;
		for(int i=1;i<S.length();i++) {
			if(S[i]!=S[i-1]) {
				answer++;
				if(S[i]=='1') sp = true;
			}
		}
		cout<<answer-sp<<endl;
	} 
	return 0;
}
