package Project1_AadhaarLink_Pan;

import java.util.HashMap;
import java.util.Map;

public class aadhaarServices {

//    private static Map<String , aadhaar> adhaarMap= new HashMap<>();
//
//    static {
//        adhaarMap.put("1232332234", new aadhaar("1232332234", "Pratham Patil",
//                "Jaywant Patil" , "Vaitarna"));
//
//        adhaarMap.put("1232332236", new aadhaar("1232332236", "Parth Bhagat",
//                "Amit Bhagat", "Vaitarna"));
//    }

    private  Map<String , aadhaar> adhaarMap;

    public aadhaarServices()
     {
        adhaarMap = new HashMap<>();

        adhaarMap.put("1232332234", new aadhaar("1232332234", "Pratham Patil",
                "Jaywant Patil" , "Vaitarna"));

        adhaarMap.put("1232332236", new aadhaar("1232332236", "Parth Bhagat",
                "Amit Bhagat", "Vaitarna"));
    }


    public aadhaar getByNumber(String aadhaarNumber){
        return adhaarMap.get(aadhaarNumber);
    }
}
