package com.careerit.jfs.cj.basics.exception;

class E1Exception extends Exception {
}
class E2Exception extends E1Exception {

}
class E3Exception extends E2Exception {

}
class E4Exception extends Exception{

}

class C1{
    public void m1() throws E3Exception {
    }
}
class C2 extends C1{
    public void m1() {
    }
}

public class ExceptionExample5 {
}
