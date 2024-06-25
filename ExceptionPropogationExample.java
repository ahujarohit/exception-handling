class ExceptionPropogationExample {
    public static void main(String args[]) {
        try {
            methodA();
        }
        catch(ArithmeticException ae) {
            System.out.println("Division by Zero - main");
        }
    }
    public static void methodA() {
        try {
            methodB();
        }
        catch(ArithmeticException ae) {
            System.out.println("Division by Zero - methodA");
            throw ae;
        }
    }
    public static void methodB() {
        int a = 10, b = 0, c = 0;
        c = a / b;
    }
}