class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max=0;
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers.length;j++){
                if(i!=j){
                    sum = numbers[i]*numbers[j];    
                }
                  
                
                if(max<sum){
                    max=sum;
                }
            }
           
        }
        answer=max;
        return answer;
    }
}