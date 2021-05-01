package pl.nauka;

public class BmiCaltulator {
    private  int weight;
    private int height;


    public BmiCaltulator(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public float countBMI(){

        return  (float) weight/ ((float)height*(float) height)*10000;

    }
}
