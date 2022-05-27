package Cor1_1;

import java.util.function.*;

public class Calculator {

    Calculator() {
    }

    static Supplier<Cor1_1.Calculator> instance = Cor1_1.Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0; //TODO функуция divide по умолчанию не обрабатывает деление на ноль. Для этого решения есть делитель равен 0, возвращаем 0

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}