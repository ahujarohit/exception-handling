class Exception3 {
    public static void main(String args[]) {
        int num = 0;
        try {
            num = Integer.parseInt(args[0]);
        }
        catch(NumberFormatException ne) {
	        System.out.println("Invalid Format");
        }
        catch(IllegalArgumentException t) {
            t.printStackTrace();
        }
        catch(ArrayIndexOutOfBoundsException ae) {
	        System.out.println("Invalid Index");
        }
        catch(IndexOutOfBoundsException t) {
            t.printStackTrace();
        }
        catch(Exception e) {
	        e.printStackTrace();
        }
        catch(Throwable t) {
            t.printStackTrace();
        }

        System.out.println("Square : " + Math.pow(num,2));
    }
}