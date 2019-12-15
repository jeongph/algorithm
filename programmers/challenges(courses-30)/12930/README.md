# :bookmark_tabs: [이상한 문자 만들기][title]

## :question: Problem
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

### :information_source: Function description
- s : 문자열
- __return__ : 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴

### :warning: Constraints
- 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
- 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.

### :arrow_right: Input format example

### :arrow_left: Output format example

## :white_check_mark: Submit
### Solved code
(Important part only)
``` java
public String solution( String s )
{
    String answer = "";
    int len = s.length();

    int reader = 0;
    boolean isEven = true;
    for( int i = 0; i < len; i++ )
    {
        if( s.charAt( i ) == ' ' )
        {
            reader = 0;
            answer += ' ';
            continue;
        }

        if( reader % 2 == 0 ) isEven = true;
        else isEven = false;

        answer += isEven ? Character.toUpperCase( s.charAt( i ) ) : Character.toLowerCase( s.charAt( i ) );
        reader++;
    }

    return answer;
}
```
### Commentary
- (막 엄청 어려운 문제는 아니었다. 그리고 이 문제 어디서 풀어본것같은데..)
- 먼저, 각각의 문자를 하나씩 비교해서 짝/홀수 위치를 판별해야 하기에 문자열 길이만큼 반복으로 read
- 읽어온 값에서 띄어쓰기가 나오면 새로운 문자임을 인식하기 위한 reader 변수, 그리고 띄어쓰기마다 0으로 초기화
- 띄어쓰기를 제외하고 reader를 하나씩 증가시키면서 홀/짝수 위치를 판별. 이때, 홀수이면 UpperCase, 짝수이면 LowerCase함수 사용해서 대/소문자 변환(레퍼런스 참조)
- 이상 변환된 Character들을 하나씩 답인 answer에 ++
- 정답을 리턴

### Discussion
- [ ] 띄어쓰기를 판별하는 과정인 if문이 썩 자연스럽지 않다. (분명 더 간결하게 가능한데 생각을 못하는 듯) -> 나중에 리펙터링 할수 있을것 같다.
- [ ] 대/소문자 판별하는걸 따로 분리하면 마이크로프로세서 인가?!
- [x] String에 toUpperCase/LowerCase 있는건 알았는데 혹시나 하고 찾아보니 역시나 Char에도 있다. 여태까지 아스키 ++해서 구했는데 이방법이 더 직관적인 것 같음.(쓰라고 만들었음 써야지;)
- [x] 여태까지 docs 찾을 때 "그냥 자바면 똑같겠지뭐"하고 걍 8버전/7버전 안가리고 찾았는데, 내 자바가 13버전이니까 버전문서에 가서 찾는게 맞는 것 같음 -> 다른프로젝트 하다보니 자바도 업데이트 하면서 지원 하지않는 것들이 몇개 있는듯,,

### References
- [Character 메소드 관련(Docs.oracle.com)](https://docs.oracle.com/en/java/javase/13/docs/api/java.base/java/lang/Character.html#toUpperCase(char))

[title]: https://programmers.co.kr/learn/courses/30/lessons/12930?language=java