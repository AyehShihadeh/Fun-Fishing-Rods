import java.util.Random;
import java.util.Scanner;

public class rgbFishingRod implements basicFishingRod{
    private 
    boolean baitOnHook;
    int fishCount;
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
        partyMode(fishCount);
    }

    public boolean hookBitten(){
        Random rand = new Random();
        baitOnHook = rand.nextBoolean();
        if(baitOnHook == true){
            System.out.println("You got lucky this time pal, here's your dinner!...");
            fishCount++;
        }

        else if(baitOnHook == false){
            System.out.println("YOU JUST GOT JABAITED BY A FISH HAHAHAHA...");    
        }
        return baitOnHook;
    }

    public void partyMode(int f){
        if (f>=3){ //if three or more fish are caught
            System.out.println("*RGB lights glow throughout the rod*...WOOP WOOP PARTAAAYYYY");
        }
        else 
            System.out.println("Lights not yet activated... keep fishing!");
    }

    public void fishCaught(){
         System.out.println("Total fish: " + fishCount);
    }
    

}//end of strongFishingRod class
