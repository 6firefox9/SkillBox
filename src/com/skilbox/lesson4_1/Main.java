package com.skilbox.lesson4_1;


public class Main {
    public static void main(String[] args) {
        Integer first = 12345;
        Integer second = 10;
        Integer third = 5059191;

        System.out.println("Сумма цифр " + first + " равна " + sumDigits(first));
        System.out.println("Сумма цифр " + second + " равна " + sumDigits(second));
        System.out.println("Сумма цифр " + third + " равна " + sumDigits(third));
        //Дополнительное задание*
        char a1 = '8';
        int a2 = Integer.parseInt(String.valueOf(a1));
        System.out.println("Перевод символа '" + a1 + "' в целое число: " + a2);
    }

    public static int sumDigits(Integer number){
        String digitStr = number.toString();
        int result = 0;
        for (int i = 0; i < digitStr.length(); i++) {
            result += Integer.parseInt(String.valueOf(digitStr.charAt(i)));
        }
        return result;
    }


}
