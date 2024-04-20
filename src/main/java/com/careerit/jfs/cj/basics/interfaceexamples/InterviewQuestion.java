package com.careerit.jfs.cj.basics.interfaceexamples;

interface MyCollection{
    boolean add(Object obj);
    boolean remove(Object obj);
    boolean contains(Object obj);
    int size();
    void clear();
    boolean isEmpty();
    boolean containsAll(MyCollection collection);
    boolean addAll(MyCollection collection);
}
abstract class AbstractMyCollection implements MyCollection{
    @Override
    public boolean add(Object obj){
        return false;
    }
    @Override
    public boolean remove(Object obj){
        return false;
    }
    @Override
    public boolean contains(Object obj){
        return false;
    }
    @Override
    public int size(){
        return 0;
    }
    @Override
    public void clear(){
    }
    @Override
    public boolean isEmpty(){
        return false;
    }

}
class MyList extends  AbstractMyCollection implements MyCollection{

    @Override
    public boolean containsAll(MyCollection collection){
        return false;
    }

    @Override
    public boolean addAll(MyCollection collection){
        return false;
    }
}
public class InterviewQuestion {
}
