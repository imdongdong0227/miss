class Solution {
    public int solution(int hp) {
        int answer = 0;
        int temp = 0;
        if(hp>5){
            answer += hp/5;
            temp = hp%5;
            if(temp!=0){
                if(temp<3){
                     answer += temp/1;
                }else{
                    answer += temp/3;
                    temp = temp%3;
                    if(temp<3){
                        answer += temp/1;
                    }
                }
                
            }
        }else if(hp<5){
            answer += hp/3;
            temp = hp%3;
            answer +=temp;
        }else if(hp<3){
            answer += temp/1;
        }
        
        
        
        
        return answer;
    }
}