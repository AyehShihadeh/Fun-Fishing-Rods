import java.util.Scanner;

public class interfaceRunner{
    public static void main(String[] args) throws Exception{
        rgbFishingRod rod1 = new rgbFishingRod();
        doubleFishingRod rod2 = new doubleFishingRod();
        magicFishingRod rod3 = new magicFishingRod();
        Scanner obj1 = new Scanner(System.in);
        Scanner obj2 = new Scanner(System.in);


        System.out.println("Do you wanna go fishin?(y/n): ");
        String input1 = obj1.nextLine();
        Thread.sleep(1000); 
        do{
            if(input1.equals("n")){
                System.out.println("alrighty, SEA you next time!");
                System.exit(0);
            }

            else {
                System.out.println("Choose your rod: (1- RGB FishingRod, 2- X2 FishingRod, or 3- magic FishingRod) ");
                String input2 = obj2.nextLine();
                Thread.sleep(1000); 
                if (input2.equals("1")){
                    do{
                        rod1.castHook();  
                        Thread.sleep(2000);                    
                        rod1.reelHook();                      
                        System.out.println("\n"); 
                        Thread.sleep(1000);                     
                        System.out.print("Continue?(1/0):");
                     input2= obj2.nextLine(); //maybe obj3?
        
                 }while ("1".equals(input2));//end of while loop
                 Thread.sleep(1000);
                 rod1.fishCaught(); 
                 Thread.sleep(1000);
                 System.out.println("alrighty, SEA you next time!\n\n");
                 System.exit(0);

                }//end of option1

                 else if (input2.equals("2")){
                   do{
                        rod2.castHook();
                        Thread.sleep(2000);
                        rod2.reelHook();
                        System.out.println("\n");
                        Thread.sleep(1000); 
                        System.out.print("Continue?(1/0):");
                        input2= obj2.nextLine(); 
            
                     }while ("1".equals(input2));//end of while loop
                     Thread.sleep(1000); 
                  rod2.fishCaught(); 
                  Thread.sleep(1000); 
                  System.out.println("alrighty, SEA you next time!\n\n");
                 System.exit(0);
             }//end of option2 


             else if (input2.equals("3")){
                do{
                    rod3.castHook();
                    Thread.sleep(2000);
                   rod3.reelHook();
                   System.out.println("\n");
                   Thread.sleep(1000); 
                      System.out.print("Continue?(1/0):");
                      input2= obj2.nextLine(); 
         
                  }while ("1".equals(input2));//end of while loop
                  Thread.sleep(1000); 
               rod3.fishCaught(); 
               Thread.sleep(1000); 
               System.out.println("alrighty, SEA you next time!\n\n");
              System.exit(0);
          }//end of option3


          else
              System.out.println("**input a correct option pls n ty**");
          
         }
     }while (input1.equals("y"));//main do-while
                 
    obj1.close();
    obj2.close();

    }//end of main
}//end of interface runner