package AdderSubtractorSyncMethod;

public class Count {
    public int value;

    public synchronized void incrementByX(int x){
        value += x;
    }
    public synchronized void decrementByX(int x){
        value -= x;
    }
    Count(int value){
        this.value = value;
    }

    Count(){
        value = 0;
    }

}
