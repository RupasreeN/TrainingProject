package com.rupa.java.exceptionexample;

 
class InvalidException extends Exception {
	
	    public InvalidException(String s)
	    {
	        // Call constructor of parent Exception
	        super(s);
	    }
	}

	 class Example1 {
		void productCheck(int weight) throws InvalidException {
			if (weight < 100) {
				throw new InvalidException("Product Invalid");
			}
		}

		public static void main(String args[]) {
			Example1 obj = new Example1();
			try {
				obj.productCheck(60);
			} catch (InvalidException ex) {
				System.out.println("Caught the exception");
				System.out.println(ex.getMessage());
			}
		}

	}

