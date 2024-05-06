// Variable scope in Java

// 1. Local variable
// 2. Instance variable
// 3. Class variables


class VariableScopes{

        int x = 100;           // Instance variable
        static int y = 200;    // Class variable
        int sum(int a, int b){  // Local variable
            int res = a + b;
            return res;
        }
        
        public void showValues(){
            System.out.println(x);
            System.out.println(y);
        }


}

DS:
    MyCollection
      10 methods
    6 Methods
    4 Methods different implementation
MyList, MySet, MyQueue, MyStack


// 1. Class and Object 
// 2. Inheritance
// 3. Polymorphism
// 4. Abstraction
// 5. Encapsulation

[
    {
        fullName
        gender
        country
        salary
        formattedSalary  $1000
    }
]


Exception in thread "main" java.lang.ArithmeticException: / by zero
at com.careerit.jfs.cj.basics.exception.ExceptionExample1.main(ExceptionExample1.java:15)


Exception:

    Exception is an event that disrupts the normal flow of the program.

    Error:
        Error is an event that disrupts the normal flow of the program. Error is caused by the environment in which the application is running.
        
    Exception:
         Exception is an event that disrupts the normal flow of the program.
    
    Bug:
        Bug is a defect in the code that causes the program to behave in an unexpected way.

    1. Checked Exception
    2. Unchecked Exception

                                Object
                                    |
                                    |
                                 Throwable
                                    |
                                    |
                        Error               Exception
                                             |      |
                                             |      |
                                 IoException        RuntimeException
                                                    SQLException        
                                                    NullPointerException