class EvenNumbers implements Runnable {
    public void run(){
    for(int i=2 ; i<=112 ; i+=2){
        System.out.println("Even : " + i);
    }
    }
}

class OddNumbers implements Runnable {
    public void run(){
    for(int i=1 ; i<=111 ; i+=2){
        System.out.println("Odd : " + i);
    }
    }
}

public class OddEvenThread{
    public static void main(String[] args){
        Thread t1 = new Thread(new EvenNumbers());
        Thread t2 = new Thread(new OddNumbers());

        t1.start();
        t2.start();
}
}