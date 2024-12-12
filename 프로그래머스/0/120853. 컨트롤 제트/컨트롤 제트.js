function solution(s) {
    var answer = 0;
    var temp=[];
    temp = s.split(' ');
    for(var i=0;i<temp.length;i++){
        if(temp[i]=='Z'){
            answer-=parseInt(temp[i-1]);
        }
        else{
            answer+=parseInt(temp[i]);
        }
    }
    return answer;
}