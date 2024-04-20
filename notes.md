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


