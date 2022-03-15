package calculate_water_bill;

import java.util.Scanner;

public class WaterBill {

    public static double calculateWaterBill(int gallonsUsage){

        double minimumWaterBill = 18.84;
        double numberOfGallonsInCCF = 748;
        double includedGallons = 2 * numberOfGallonsInCCF;

        if(gallonsUsage <= includedGallons){
            return minimumWaterBill;
        }else{
            double extraGallonsUsed = gallonsUsage - includedGallons;
            double extraAmountOwed = Math.ceil(extraGallonsUsed / numberOfGallonsInCCF) * 3.90;

            return minimumWaterBill + extraAmountOwed;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int gallonUsage = scanner.nextInt();

        System.out.println("Your water bill is "+calculateWaterBill(gallonUsage));
    }
}
