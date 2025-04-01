package Display;

import Display.Display;

public class Display {
    private int value=0;
    private int limit=0;

    public Display(int limit) {
        this.limit=limit;
    }
    public void increase() {
        value++;
        if (value==limit) {
            value=0;
        }
    }

    public  int getValue() {
        return value;
    }
    public static void main(String[] args) {
        Display h = new Display(24);
        for(;;){
            h.increase();
            System.out.println(h.getValue());
        }
    }
}
