class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class test1{
    public static void main(String[] args){
        MyThread obj = new
        MyThread();
        Thread t=new Thread(obj);
        t.start();
    }
}