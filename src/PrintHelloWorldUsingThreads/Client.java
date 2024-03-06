package PrintHelloWorldUsingThreads;

public class Client {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 100 ; i++){
            PrintNumber task = new PrintNumber(i);
            Thread t = new Thread(task);
            t.start();
        }
    }
    //thread order in which they will be executed is not guranteed
}
