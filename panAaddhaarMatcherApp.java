package Project1_AadhaarLink_Pan;

import java.util.Scanner;

public class panAaddhaarMatcherApp {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        aadhaarServices aadhaarServices = new aadhaarServices();
        panService panService = new panService();

        System.out.println("Enter the AadhaarNumber");
        String aaNumber = s.nextLine();

        aadhaar aadhaars = aadhaarServices.getByNumber(aaNumber);

        Pan pans = panService.getPanByNumber(aaNumber);

        if (aadhaars !=null && pans!=null){

            System.out.println("aadhaar Details= " + aadhaars);
            System.out.println("Pan Details= "+pans);
        }
        else {
            System.out.println("No Match Found");
        }

    }
}
