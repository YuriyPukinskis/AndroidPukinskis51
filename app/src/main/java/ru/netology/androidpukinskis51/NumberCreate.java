package ru.netology.androidpukinskis51;

public class NumberCreate {
    public static double numbering(boolean point, double number, double digit, int elem){
        if (point){
            number=number+elem/digit;
        }
        else
        {
            number=number*10+elem;
        }
        return number;
    }
}
