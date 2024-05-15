class MyClass {
    private int number = 0;

    public int printAndReturn() {
        System.out.println("---" + (++number) + "---");
        return number;
    }
}