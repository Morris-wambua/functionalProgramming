package DeclarativeProgram;

import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        //The Java method
        Customer alice = new Customer("Alice", 9999);
        sayHello(alice);

        //using Consumer Interface
        Customer bob = new Customer("Bob", 52221);
        sayHelloConsumer.accept(bob);
    }

    public static void sayHello(Customer customer){
        System.out.println("Hello "+customer.name
        +" thanks for registering "+ customer.phone);
    }

    static Consumer<Customer> sayHelloConsumer= customer -> {
        System.out.println("Hello "+customer.name
                +" thanks for registering "+ customer.phone);
    };

    static class Customer {
        private final String name;
        private final int phone;

        Customer(String name, int phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
