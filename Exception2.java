class Exception2 {
    public static void main(String args[]) {
        int a = 10, b = 0, c = 0;
        try {
            c = a / b;
        }
        catch(ArithmeticException ae) {
            // System.out.println("Division by Zero.");
            // System.out.println(ae.getMessage());
            ae.printStackTrace();
        }
        System.out.println("Result : " +  c);
    }
}
//Division by 0 results in ArithmeticException