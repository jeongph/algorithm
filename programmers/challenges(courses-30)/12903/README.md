# 가운데 글자 가져오기

## 문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

## Submit
<pre><code> # 중요 코드
class Solution {
    public String solution(String s) {
        String answer = "";

        int len = s.length();
        if( len % 2 == 0) answer = s.substring(len / 2-1, len / 2+1);
        else answer = s.substring(len / 2, len /2+1);

        return answer;
    }
}
</code></pre>
- 음... 1레벨이라그런지 어려운게 없었다. 짝수인지 판별하고 맞으면 길이에서 1뺀값 2글자 아닌경우 중간글자 리턴