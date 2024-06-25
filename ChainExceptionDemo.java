class ChainExceptionDemo {
	static void demoMethod() {
		NullPointerException e = new NullPointerException("Top Layer");
		e.initCause(new ArithmeticException("Cause"));
		throw e;
	}

	public static void main(String args[]) {
		try {
			demoMethod();
		}
		catch(NullPointerException ne) {
			System.out.println("Caught : " + ne);
			System.out.println("Original Cause : " + ne.getCause());
		}
	}
}

