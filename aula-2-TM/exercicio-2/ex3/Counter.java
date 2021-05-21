package class4.list2.ex3;

public class Counter {
    private int value;

    public Counter(){
        this.value = 0;
    }

    public Counter(int value){
        this.value = value;
    }

    public Counter(Counter c){
        this.value = c.getValue();
    }


    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void add(){
        this.value++;
    }

    public void sub(){
        this.value--;
    }
}
