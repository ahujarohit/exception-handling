class Exception7 {
    public static void main(String args[]) {
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException ne) {
            System.out.println("Invalid Format/Index");
        }
        System.out.println("Square : " + Math.pow(num, 2));
    }
}