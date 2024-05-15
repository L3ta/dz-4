public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world. Java test\n");

        MyClass myObject = new MyClass();

        int returnedValue1 = myObject.printAndReturn();
        System.out.println("~~~ " + returnedValue1 + " ~~~");

        int returnedValue2 = myObject.printAndReturn();
        System.out.println("~~~ " + returnedValue2 + " ~~~");
    }
}
