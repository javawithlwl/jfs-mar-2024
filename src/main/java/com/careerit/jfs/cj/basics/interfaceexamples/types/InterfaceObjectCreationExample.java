package com.careerit.jfs.cj.basics.interfaceexamples.types;

import com.careerit.jfs.cj.basics.day6.MathOperations;

@FunctionalInterface
interface Operation{
    int perform(int a,int b);
}
/*class AddOperation implements Operation{

    @Override
    public int perform(int a, int b) {
        return a + b;
    }

}
class SubOperation implements Operation{

    @Override
    public int perform(int a, int b) {
        return a - b;
    }

}

class MulOperation implements Operation{

    @Override
    public int perform(int a, int b) {
        return a * b;
    }

}

class DivOperation implements Operation{

    @Override
    public int perform(int a, int b) {
        return a / b;
    }

}*/

class MathOperation{

    public int calculate(Operation operation,int a,int b){
        return operation.perform(a, b);
    }

}



public class InterfaceObjectCreationExample {

    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        int res = obj.calculate((a,b)->a - b, 10, 5);
        System.out.println(res);
    }
}
