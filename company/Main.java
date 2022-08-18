package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
        // Здесь возникнет ArithmeticException, т.к. b в данном примере равно 0,
        // а деление на 0 должно обрабатываться (использование блока try-catch, использование условий if-else)
        // причем блок try-catch можно использовать в блоке лямбда-функции или здесь, при использовании метода деления
        int c = calculator.divide.apply(a, b);
        int d = calculator.abs.apply(c);

        calculator.println.accept(d);
    }
}
