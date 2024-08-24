public class Demo {
    public static void main(String[] args) {

        GenericClass<Integer> integerObject= new GenericClass<>(1234);
        System.out.println("Welcome to The world of Generics");
        System.out.println("We have given input as "+integerObject.getInputObject());
        System.out.println("Data type used is "+integerObject.getInputObject().getClass());
        System.out.println("Max value is : "+Integer.MAX_VALUE);

        GenericClass<String> stringObject= new GenericClass<>("Hello World");
        System.out.println("\nWe have given input as  "+stringObject.getInputObject());
        System.out.println("Data type used is "+stringObject.getInputObject().getClass());
        System.out.println("Length of the input String is "+stringObject.getInputObject().length());

    }
}
