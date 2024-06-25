class Exception5 {
    public static void main(String args[]) {
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
            if(num > 100) {
                BigException be = new BigException("Number too big.");
                num = 0;
                throw be;
            }
        }
        catch(NumberFormatException ne) {
            System.out.println("Invalid Format.");
        }
        catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("Invalid Index.");
        }
        catch(BigException b) {
            System.out.println(b.getMsg());
        }
        catch(Exception e) {
               e.printStackTrace();
        }
        System.out.println("Square : " + Math.pow(num, 2));
    }
}


