import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> (y != 0) ? x / y : error();
    /* Попробовал сделать и лямбду и ссылку на метод, пока ничего не получилось.
    * Привычным способом вызвал отдельный метод, который сообщил в консоле об ошибке и вернул int (0) */
    private static int error(){
        System.out.print("Ошибка! Вы пытаетесь разделить на ");
        return 0;
    }

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
