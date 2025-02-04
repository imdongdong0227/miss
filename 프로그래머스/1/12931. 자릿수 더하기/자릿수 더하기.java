import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nu=String.valueOf(n);
        for(int i=0;i<nu.length();i++){
            answer+=Integer.parseInt(nu.substring(i,i+1));
        }
        return answer;
    }
}