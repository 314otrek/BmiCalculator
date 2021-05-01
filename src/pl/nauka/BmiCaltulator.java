package pl.nauka;

public class BmiCaltulator {
    private  int weight;
    private int height;
    private float Bmi ;


    public BmiCaltulator(int weight, int height) {
        this.weight = weight;
        this.height = height;
        Bmi =(float) weight/ ((float)height*(float) height)*10000;
    }

    public float countBMI(){

        return Bmi;
    }

    public BmiLevel WeightStatus(){
        if(Bmi< 18.5)
            return BmiLevel.UnderWeight;
        else if(Bmi>=18.5 && Bmi<24.99)
            return BmiLevel.Healthy_Weight;
        else if(Bmi>=25 && Bmi <29.99)
            return BmiLevel.UnderWeight;
        else{
            return BmiLevel.Obese;
        }

    }

}
