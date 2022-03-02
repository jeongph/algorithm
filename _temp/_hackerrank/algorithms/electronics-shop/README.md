# [Electronics Shop]

## Problem
Monica는 그녀가 좋아하는 전자제품 상점에서 키보드와 USB드라이브를 사고싶어한다.
그 상점은 여러개의 모델이 있다.
Monica는 정해진 예산을 가능한 채워서 2개의 아이템(키보드와 USB)를 사려고 한다.
가게의 키보드와 USB 가격 리스트와 Monica의 예산이 주어졌을 때 Monica가 쓸 돈의 양을 출력하라.
만약 그녀가 둘을 사기에 돈이 모자라면 -1을 출력.

## Function Description
Complete the getMoneySpent function in the editor below. It should return the maximum total price for the two items within Monica's budget, or ***-1*** if she cannot afford both items.

getMoneySpent has the following parameter(s):
- keyboards: an array of integers representing keyboard prices
- drives: an array of integers representing drive prices
- b: the units of currency in Monica's budget

## Input Format
The first line contains three space-separated integers ***b***, ***n***, and ***m***, her budget, the number of keyboard models and the number of USB drive models. 
The second line contains ***n*** space-separated integers ***keyboard\[i\]***, the prices of each keyboard model. 
The third line contains ***m*** space-separated integers ***drives***, the prices of the USB drives.

## Output Format
Print a single integer denoting the amount of money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.

## Submit
<pre><code> # 중요 코드
    static int getMoneySpent(int[] keyboards, int[] drives, int b)
    {
        int klen = keyboards.length;
        int dlen = drives.length;
    
        int ret = -1;
        for( int i = 0; i < klen; i++ )
        {
            for( int j = 0; j < dlen; j++ )
            {
                int temp = (keyboards[i] + drives[j]);
                if( temp > ret && temp <= b ) ret = temp;
            }
        }
    
        return ret;
    }
</code></pre>
- 크게 어려울건 없어보인다. 더 좋은 로직이 있을것 같긴 한데 일단은 빨리 해결
- 각각 길이는 알아야 하므로 klen, blen으로 길이를 저장
- for문을 돌면서 키보드의 1~n개, usb의 1~n개를 각각 더해서 가장 크면서 주어진 예산에 맞는 수를 고름
- 맞는게 없으면 당연히 -1이 나와야 하므로 ret의 초기값은 -1로 설정

[Electronics Shop]: https://www.hackerrank.com/challenges/electronics-shop/problem