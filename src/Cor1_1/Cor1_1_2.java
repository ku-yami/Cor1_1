package Cor1_1;

public class Cor1_1_2 {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.err::println;

        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}
