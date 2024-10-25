package Project1_AadhaarLink_Pan;

import java.util.HashMap;
import java.util.Map;

public class panService {

    private static Map<String ,Pan> panMap = new HashMap<>();

    static {
        panMap.put("ACSFPP45DS", new Pan("ACSFPP45DS", "1232332234",
                "HDFC Bank", "Treading Stock LIC"));

        panMap.put("ACSFPP45PS", new Pan("ACSFPP45PS", "1232332236",
                "SBI Bank", "Stock LIC Mutual Fund"));

    }

    public Pan getPanByNumber (String aadhaarNumber){
        for (Pan pan : panMap.values()){
            if (pan.getAadhaarNumber().equals(aadhaarNumber))
            {
                return pan;
            }
        }
        return null;
    }
}
