package DeclarativeProgram;

import java.util.function.BiFunction;

public class _BiFunction {
    public static void main(String[] args) {

        Integer addThenMulti = addThenMultiply.apply(2, 10);
        System.out.println(addThenMulti);
    }

    //normal function
    static int addAndMultiply(int number, int multiplicationNumber){
        return (number+1)*multiplicationNumber;
    }

    //declarative function
   static BiFunction<Integer, Integer, Integer> addThenMultiply=
            (firstNumber,secondNumber) -> (firstNumber+1)*secondNumber;
}
