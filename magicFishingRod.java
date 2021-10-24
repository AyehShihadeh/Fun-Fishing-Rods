import java.util.Random;
import java.util.Scanner;

public class magicFishingRod implements basicFishingRod{

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
                Random rand2 = new Random(); //for switch statement
                int junk= rand2.nextInt(6); //random number 0-5
                switch (junk){

                    case 0:
                        System.out.println("WOAH YOU GOT 5 FISHIES...");
                        fishCount= fishCount+5;
                         break;

                    case 1:
                        System.out.println("You caught a boot... good job...");
                        break;

                    case 2: 
                        System.out.println("How did you even manage to catch a fork?...");
                        break;
                        
                    case 3:
                        System.out.println("Oh look you found aunty Linda's wig from last halloween...");
                        break;

                    case 4:
                        System.out.println("A plastic bottle... yummmm...");
                        break;    
                    
                    case 5:
                        System.out.println("magic rod said gimmi back my fish and stole all your fishies...");
                        fishCount=0;
                        break;       
                }//end of switch statment
            }//end of if statement
    
            else if(baitOnHook == false){
                System.out.println("YOU JUST GOT JABAITED BY A FISH HAHAHAHA...");    
            }
            return baitOnHook;
        }
    
        public void fishCaught(){
            System.out.println("Total fish: " + fishCount);
       }
    
}
