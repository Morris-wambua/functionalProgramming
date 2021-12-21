package DeclarativeProgram;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        //validate the phone number
        boolean validateMorris = isPhoneValid.test("07061894146");
        System.out.println(validateMorris);

        //check if it contains 3
        boolean check3 = contains3.test("0706114143");
        System.out.println(check3);

        //combine predicates
        boolean doubleValidation = isPhoneValid.and(contains3).test("0706118143");
        System.out.println(doubleValidation);

    }

    static Predicate<String> isPhoneValid= phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length()==10;

    static  Predicate<String> contains3= phoneNumber ->
            phoneNumber.contains("3");
}
