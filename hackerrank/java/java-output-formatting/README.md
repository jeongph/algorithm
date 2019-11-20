# [Java Output Formatting]

## Problem
자바의 `System.out.printf` 함수는 출력 포맷을 출력할때 사용한다.
이 실습의 목적은 출력 포맷의 이해와 `printf`의 사용을 테스트하는 것 이다.


## Function Description
\

## Input Format
Every line of input will contain a String followed by an integer.
Each String will have a maximum of ***10*** alphabetic characters, and each integer will be in the inclusive range from ***0*** to ***999***.

## Output Format
In each line of output there should be two columns: 
The first column contains the String and is left justified using exactly ***15*** characters. 
The second column contains the integer, expressed in exactly ***3*** digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

## Submit
<pre><code> # 중요 코드
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++)
        {
            String s1=sc.next();
            int x = sc.nextInt();
            //Complete this line
            System.out.printf( "%-15s%03d\n", s1, x);
        }
        System.out.println("================================");

    }
</code></pre>
- 사실 풀이는 필요없다. 일찍자려고 쉬운 문제라도 풀어보는 꼼수를 부려본다..
- 소름돋는건 %\[지시자\]사이에 -넣으면 왼쪽정렬 되는구나..

[Java Output Formatting]: https://www.hackerrank.com/challenges/java-output-formatting/problem