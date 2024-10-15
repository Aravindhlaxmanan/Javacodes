package nwknvghg;

// Throws is the keyword which is used to navigate the exception to called method 

//In Java, the throws keyword is used in method declarations to indicate that the method might throw 
//certain types of exceptions during its execution. 
//It's part of the method signature and is used to specify the exceptions that the method can throw, 
//allowing the calling code to handle those exceptions appropriately.


//throws is used for mostly checked exception like SQL Database connectivity, IOexception(read,write)



class throws_example {
    public void method1() throws InterruptedException {
        // Sleeping for demonstration
        Thread.sleep(1000);
        System.out.println("Method 1 executed");
    }

    public void method2() throws InterruptedException {
        // Sleeping for demonstration
        Thread.sleep(1000);
        System.out.println("Method 2 executed");
    }

    public static void main(String[] args) throws InterruptedException {
    	
    	
    	// do not use throws in main method because it might stop the whole execution.
    	
    	
    	throws_example example = new throws_example();

        try {
            example.method1();
            example.method2();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
            // You can handle the exception here or rethrow it
            throw e;
        }
    }
}



//rethrow example

//public class RethrowExample {
//
//    public void myMethod() throws Exception {
//        try {
//            //----- Some code that may throw an exception
//            throw new Exception("Something went wrong");
//        } catch (Exception e) {
//            //-------- Handle the exception or log it
//            System.out.println("Exception caught: " + e.getMessage());
//            // Rethrow the exception
//            throw e;
//        }
//    }
//
//    public static void main(String[] args) {
//        RethrowExample example = new RethrowExample();
//        try {
//            example.myMethod();
//        } catch (Exception e) {
//            System.out.println("Exception rethrown and caught in main: " + e.getMessage());
//        }
//    }
//}


