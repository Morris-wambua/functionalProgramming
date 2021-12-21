package DeclarativeProgram;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int incrementedValue = incrementByOne(1);
        System.out.println(incrementedValue);

        Integer increment = incrementByOneFunction.apply(1);
        System.out.println(increment);

        Integer incrementByOneMultiplyBy10 = multiplyBy10.apply(increment);
        System.out.println(incrementByOneMultiplyBy10);


        Integer finalOutPut = add1ThenMultiplyBy10.apply(1);
        System.out.println(finalOutPut);
    }

    //imperative approach
    static int incrementByOne(int number){
        return number+1;
    }

    //declarative approach
    static Function<Integer, Integer> incrementByOneFunction= number -> number+1;

    static Function<Integer, Integer> multiplyBy10 = number -> number*10;

    static Function<Integer, Integer> add1ThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10);

}
