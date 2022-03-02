# [Java Currency Formatter][Java Currency Formatter]

## Submit
<pre><code> # 중요 코드
        // Write your code here.
        String us = String.format("%s%,.2f", "$", payment);
        String india = String.format("%s%,.2f", "Rs.", payment);
        String china = String.format("%s%,.2f", "￥", payment);

        DecimalFormatSymbols dfs = DecimalFormatSymbols.getInstance(Locale.FRANCE);
        NumberFormat goodNumberFormat = new DecimalFormat("#,##0.00", dfs);

/*
        DecimalFormat formatter = new DecimalFormat("#_##0,00 €");*/
        String france = goodNumberFormat.format(payment)+" €";

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
</code></pre>
- 일단 급조로 하긴 했는데 이런 방식(그니까 위치에 따라 해당 나라의 단위가 바뀌는 형식)은 신기하네 처음본다.
- 기억하고 있으면 언젠간 쓸 일 있을 듯

[Java Currency Formatter]: https://www.hackerrank.com/challenges/java-currency-formatter/problem