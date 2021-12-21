package DeclarativeProgram;

import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;

public class _BiConsumer {
    public static void main(String[] args) {

        Customer bob = new Customer("Bob", 9900);
        displayCustomer.accept(bob, false);

    }

    static BiConsumer<Customer, Boolean> displayCustomer=(customer, showPhoneNumber) ->{
        System.out.println("Hello "+customer.name+
                " thanks for registering "+
                (showPhoneNumber ? customer.phone : "xxxxxxxxxx"));
    };

    public static class Customer{
        private final String name;
        private final int phone;

        Customer(String name, int phone) {
            this.name = name;
            this.phone = phone;
        }
    }

    enum LoginStatus{
        TRUE, FALSE
    }
}
