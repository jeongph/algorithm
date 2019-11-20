import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

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
    }
}

