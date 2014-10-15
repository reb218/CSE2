//Ryan Baitch
//CSE2-Brian Chen
//HW06-Getting Loopy Roulette Program
//October 10, 2014

//Define the class
public class Roulette
{
    //Add main method
    public static void main(String[] args)
    {
        double spin = (Math.random() * 38) + 1;
        int spin2 = (int) spin;
        
        double bet = (Math.random() * 38) + 1;
        int bet2 = (int) bet;
        
        int counter = 1;
        int totalWinnings = 0;
        int wins = 0;
        int walkAwayProfit = 0;
        int lostEverything = 0;
        
        while(counter < 1000){
            counter++;
            int counter2 = 1;
            
            while (counter2 < 100)
            {
                counter2++;
                
                if(bet2 == spin2){
                    wins++;
                    
                    if(wins > 3){
                    totalWinnings = (wins*36)-100;
                    walkAwayProfit++;
                }
                if (wins == 0){
                    lostEverything++;
                }
                }
            }
        }
        System.out.println("The number of times you lost everything was "+lostEverything);
        System.out.println("The total winnings are "+totalWinnings);
        System.out.println("The number of times you walked away with a profit in one session of 100 spins is "+walkAwayProfit);
    }
}