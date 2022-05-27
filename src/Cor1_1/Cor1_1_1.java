package Cor1_1;

public class Cor1_1_1 {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int y = calc.multiply.apply(2, 3);
        int p = calc.pow.apply(3);
        int t = calc.abs.apply(6);

        int c = calc.devide.apply(8, 0); //TODO a и b не существовал из-за этого возникала ошибка;

        calc.println.accept(c);
    }
}