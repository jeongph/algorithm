- Elapsed time: 19m

# 문자열 내림차순으로 배치하기
출처: https://programmers.co.kr/learn/courses/30/lessons/12917?language=java

## :question: Problem
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

### Function description
- `s` : 문자열

### Constraints
- `str`은 길이 1 이상인 문자열입니다.

### Input/Output example
| s       | return  |
| ------- | ------- |
| Zbcdefg | gfedcbZ |

## :exclamation: Submit
### Solved code
(Important part only)
``` java
public String solution( String s )
{
    String answer = "";
    int len = s.length();

    char temp_arr_ch[] = new char[len];

    for( int i = 0; i < len; i++ )
    {
        temp_arr_ch[i] = s.charAt(i);
    }

    for(int i = 0; i < len; i++)
    {
        for(int j = 0; j < len; j++)
        {
            if( (int)temp_arr_ch[i] > (int)temp_arr_ch[j] )
            {
                char temp = temp_arr_ch[i];
                temp_arr_ch[i] = temp_arr_ch[j];
                temp_arr_ch[j] = temp;
            }
        }
    }

    answer = arrToString(temp_arr_ch);
    return answer;
}

public String arrToString( char arr[] )
{
    String temp = "";
    for(int i = 0; i < arr.length; i++ )
    {
        temp += arr[i];
    }

    return temp;
}
```

### Commentary
- 문제보고 처음 "대문자는 소문자보다 작다"니까 아스키로 처리하자고 생각
- 정렬 할 때 배열로 존재해야 비교하기 쉬으므로 일단 배열에 때려넣음
- 정렬 알고리즘을 쓸까 함수로 만들까 하다가 일단 제일 구현하기 쉬운 버블정렬로 배열 정렬
- `toString` 함수를 써봤는데 이것마저 구현하는건가? 싶어서 그냥 함수로 구현 (자바 특징상 어렵진 않음)
- 리턴

### Discussion
- [ ] 싹다 함수화해서 보기 쉽게 할 껄 그랬나

### References
- [ASCII - 위키백과, 우리 모두의 백과사전](https://ko.wikipedia.org/wiki/ASCII)