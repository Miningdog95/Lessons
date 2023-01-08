package com.company;

import java.lang.ref.SoftReference;
import java.util.Scanner;


public class Calc {
    public static void main (String[] args){
       Converter converter = new Converter();
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("введи выражение");
        String exp = scanner.nextLine();

        int actionIndex=-1;
        for (int i=0; i<actions.length; i++){
            if (exp.contains(actions[i])){
                actionIndex = i;
                break;}
        }
        // если не нашли арифметическую операцию, то завершаем программу
        if (actionIndex==-1){
            System.out.println("Exception //т.к. нет соответствия арифметической операции");
            return;
        }
        // сплитим по символу операции, разделяем на массивы чисел data0 и data1
        String[] data = exp.split(regexActions[actionIndex]);
        // определяем находятся ли числа в одном формате (оба арабские, оба римские)
        try {
        if(converter.isRoman(data[0])==converter.isRoman(data[1])){
        int a,b;
        // определяем римские ли это числа
        boolean isRoman = converter.isRoman(data[1]);
        if (isRoman){
            // если римские, то конвертируем их в арабские
            a = converter.romanToInt(data[0]);
            b = converter.romanToInt(data[1]);

        }
        else
        {
            // если числа арабские, то конвертируем их из строки в число
        a = Integer.parseInt(data[0]);
        b = Integer.parseInt(data[1]);
        }
        if (b<=10){
        if (a<=10){
        // выполняем с числами арифметическое действие
        int result = a+b;
        switch (actions[actionIndex]){
            case "+":
                result = a+b;
                break;
                case "-" :
                    result = a-b;
                    break;
                case "*":
                    result = a*b;
                    break;
                case "/" :
                    result = a/b;
                    break;
            }
            if(isRoman){
                // если числа были римские, возвращаем результат в римском числе
                System.out.println(converter.intToRoman(result));
            }
        else {
            // если числа были арабские, возвращаем результат в арабском числе
            System.out.println(result);
            }}
        else {
            System.out.println("Exception, Только число от 1 до 10 включительно");}}
        else {
            System.out.println("Exception, Только число от 1 до 10 включительно");}
        }
    else{
        System.out.println("Exception, используются одновременно разные системы счисления");
    }
    } catch (NumberFormatException w) {
            System.out.println("Exception, только целые числа");
        }
        catch (NullPointerException a) {
            System.out.println("Exception, Римские цифры не могут быть отрицательными");
        }

}}