#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
    int dr=0;
    int sh=12000*n;
    int su=0;
    int sum =n/10;
    for(int i=sum;i>0;--i){
        k--;

    }
    dr=2000*k;
    answer=sh+dr;
    return answer;
}