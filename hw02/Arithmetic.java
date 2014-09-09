//Ryan Baitch
//Brian Chen
//Homework 2-Arithmetic
//September 6, 2014

//Create a class
public class Arithmetic{
    public static void main(String[]args) {
        //Define all variables
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //($ is part of variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //Cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double totalSockCost$= nSocks*sockCost$; //Total cost of socks
        double totalGlassCost$= nGlasses*glassCost$;
        double totalEnvelopeCost$= nEnvelopes*envelopeCost$;
        
        double taxSocks=totalSockCost$*taxPercent;
        double taxGlasses=totalGlassCost$*taxPercent;
        double taxEnvelopes=totalEnvelopeCost$*taxPercent;
        
        double totalCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        double salesTax=taxSocks+taxGlasses+taxEnvelopes;
        double totalPaid$=totalCost$+salesTax;
        
        System.out.println("the item being bought is socks");
        System.out.println("the amount of socks being bought is "+nSocks);
        System.out.println("the cost of socks is $"+sockCost$);
        System.out.println("the total cost of socks is $"+totalSockCost$);
        System.out.println("the sales tax of socks is $"+taxSocks);
        
        System.out.println("the item being bought is drinking glasses");
        System.out.println("the amount of drinking glasses being bought is "+nGlasses);
        System.out.println("the cost of drinking glasses is $"+glassCost$);
        System.out.println("the total cost of drinking glasses is $"+totalGlassCost$);
        System.out.println("the sales tax of drinking glasses is $"+taxGlasses);
        
        System.out.println("the item being bought is envelopes");
        System.out.println("the amount of envelopes being bought is "+nEnvelopes);
        System.out.println("the cost of envelopes is $"+envelopeCost$);
        System.out.println("the total cost of envelopes is $"+totalEnvelopeCost$);
        System.out.println("the sales tax of envelopes is $"+taxEnvelopes);
        
        System.out.println("the total cost of the purchases (before tax) is $"+totalCost$);
        System.out.println("the total sales tax is $"+salesTax);
        System.out.println("the total cost of the purchases (including sales tax) is $"+totalPaid$);
    }
}