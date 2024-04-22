package com.careerit.jfs.cj.basics.interfaceexamples.types;

interface MyPredicate {
    boolean test(int a);
}


class NumberPredicate {

    public boolean test(MyPredicate predicate, int num) {
        return predicate.test(num);
    }
}

public class NumberPredicateExample {

    public static void main(String[] args) {

        NumberPredicate obj = new NumberPredicate();
        int num = 19;
        MyPredicate even = (a) -> a % 2 == 0;
        MyPredicate odd = (a) -> a % 2 != 0;
        MyPredicate prime = (int a) -> {
            if (a < 2) {
                return false;
            }
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(obj.test(even, num));
        System.out.println(obj.test(odd, num));
        System.out.println(obj.test(prime, num));
    }
}
