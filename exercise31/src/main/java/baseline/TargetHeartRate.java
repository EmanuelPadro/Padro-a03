package baseline;

public class TargetHeartRate {
    private static int Pulse;
    private static int Age;

    //each of this does the job of filling the age variables or returning them
    static void FillPulse(int InputRestingPulse){
        Pulse = InputRestingPulse;
    }

    static void FillAge(int InputAge){
        Age = InputAge;
    }

    static int ReturnAge(){
        return Age;
    }

    static int ReturnPulse(){
        return Pulse;
    }

    //this last method is the one that actually calculates and returns the THR
    static int THRCalc(double Intensity){

        return (int) Math.round((((220 - Age) - Pulse)*Intensity) + Pulse);
    }

}
