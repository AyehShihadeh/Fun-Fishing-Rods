import java.util.Random;
import java.util.Scanner;

public class doubleFishingRod implements basicFishingRod {
    private boolean baitOnHook;
    private int fishCount;
    Scanner input = new Scanner(System.in);

    public void castHook(){
        System.out.println("*You cast the fishing hook...*");
    }

    public void reelHook(){
        System.out.println("*You reel in the fishing line...*");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        hookBitten();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }

    public boolean hookBitten(){
        Random rand = new Random();
        baitOnHook = rand.nextBoolean();
        if(baitOnHook == true){
            System.out.println("You got lucky this time pal, and look! You got two fish!");
            fishCount= fishCount+2;
        }

        else if(baitOnHook == false){
            System.out.println("YOU JUST GOT JABAITED BY A FISH HAHAHAHA...");    
        }
        return baitOnHook;
    }

    public void fishCaught(){
        System.out.println("Total fish: " + fishCount);
   }
    
}//end of class
