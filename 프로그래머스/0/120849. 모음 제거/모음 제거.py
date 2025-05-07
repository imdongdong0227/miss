def solution(my_string):
    answer = ''
    for i in 'aeiou':
        my_string = my_string.replace(i,"")
    answer=my_string
    return answer