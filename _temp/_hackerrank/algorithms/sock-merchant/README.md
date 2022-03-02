# [Sock Merchant]

## Problem
John은 옷가게에서 일한다. 얘는 큰 양말더미를 가지고있는데 이걸 팔려면 색상별로 쌍을 지어야한다. 양말 뭉탱이 arr이 주어질 때, 쌍의 갯수를 구하라

## Function Description
Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):
- n: the number of socks in the pile
- ar: the colors of each sock

## Input Format
The first line contains an integer ***n***, the number of socks represented in ***ar***. 
The second line contains ***n*** space-separated integers describing the colors ***ar\[i\]*** of the socks in the pile.

## Output Format
Return the total number of matching pairs of socks that John can sell.

## Submit
<pre><code> # 중요 코드
    static int sockMerchant(int n, int[] ar)
    {
        HashMap<Integer, Integer> type = new HashMap<Integer, Integer>();

        int pair = 0;
        for( int i = 0; i < n; i++)
        {
            int temp = ar[i];
            if( type.containsKey(temp) && type.get( temp ) == 1 )
            {
                type.put( temp, 0 );
                pair++;
            }
            else
                type.put( temp, 1 );
        }

        return pair;
    }
</code></pre>

- 어떻게 접근할까 하다가 바로 저번에 풀었던 문제처럼 HashMap으로 풀면 재밌을 것 같아서 이 방법으로 접근.
- 이전에 한번이라도 들어왔다면 해당 키를 1로 초기화
- 일단 양말의 타입을 정할 type에 ar에서 값을 하나씩 읽어오면서 있는 키값이고 이전에 들어온적이 있어서 1로 초기화가 되어있으면 페어를 1개 증가시키고 값을 0으로
- 쌍 값을 리턴

[Sock Merchant]: https://www.hackerrank.com/challenges/sock-merchant/problem