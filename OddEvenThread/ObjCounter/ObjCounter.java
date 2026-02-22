class Counter{
    static int count = 0;

    Counter(){
        count++;
    }

    void display(){
        System.out.println("total objects created:"+ count);
    }
}

public class ObjCounter{
    public static void main(String[] args){
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        obj1.display();
    }
}