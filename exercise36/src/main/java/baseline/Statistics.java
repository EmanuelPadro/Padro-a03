package baseline;

import java.util.ArrayList;
import java.util.Collections;

public class Statistics {
    static ArrayList<Double> ResponseTimes= new ArrayList<>();

    //typical return

    static double average(){
        return ResponseTimes.stream().mapToDouble(val -> val).average().orElse(0.0);
    }

    static double minimum(){
        return Collections.min(ResponseTimes);
    }

    static double max(){
        return Collections.max(ResponseTimes);
    }

    //all calculations for Std
    static double Std(){
        double mean = average();
        double TotalDTM = 0;

        for (Double responseTime : ResponseTimes) {
            double differenceToMean = Math.pow(responseTime - mean, 2);
            TotalDTM = differenceToMean + TotalDTM;
        }
        double meanOfDTM = TotalDTM / (double) (ResponseTimes.size());

        return ((int)(100*Math.sqrt(meanOfDTM)))/(double) 100;

    }

}
