package com.company;

public class Main {
    //Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
    //Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого отрицательного числа и вывести его на экран

    public static void main(String[] args) {
        double[] nums = {10.2, 20.4, 35.2, -32.6, 12.5, -55.6, 66.7, 99.9, -23.3, 40.4, -44.5, 60.9, 29.4, -16.2, 28.7};
        double sum=0;
        double kol=0 ;
        boolean isOtr = false;
        for (double num:nums) {
            if (num < 0){
                isOtr = true;
            } else {
                if (isOtr){
                    sum = sum+num;
                    kol++;
                }

            }
        }
        System.out.println(kol);
        System.out.println(sum/kol);






        }
    }




