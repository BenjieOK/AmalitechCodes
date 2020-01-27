package org.amalitech.javarecap;

import java.util.Scanner;

public class JosWheel {

	public static void main(String[] args) {
		
		 //Initializations
        boolean programRunningBool = false;
        String code_trigger_starter_str = "start";
        String code_trigger_ender_str = "end";

        re_run_kybd_input(code_trigger_starter_str);
        //2. we need a trigger to end the code 
        
    }//END OF while{...}

	public static void re_run_kybd_input(String code_trigger_starter_str) {
		boolean programRunningBool;
		Scanner kybdInput = new Scanner(System.in);
        String keyboardInput_str = kybdInput.nextLine();

        if (keyboardInput_str.equalsIgnoreCase(code_trigger_starter_str)) {
        	
        	programRunningBool=true;
        	
            int x = 0;
            int y = 5;

            //we need a trigger to run/start the program
            while (programRunningBool == true) {
                if (x < y) {
                    //the immediate code above is the same as this very code below
                /*while (programRunningBool == true)
                System .out.println("We are still in the while " + Integer.to
                 */

                    System.out.println("we are still in the while loop" + Integer.toString(x));
                    x = x + 1;
                }
                else {
                	programRunningBool=false;
                    System.out.println("we are still in the while loop");
                }
                //x = x + 1;
                //if we need the program to stop, then we have to move the above code into the if block
            //we need a trigger to end the code
        } 
            System.out.println("Hurray, we are out of the loop");
    		
    	}else {
            System.out.println("Please restart and enter");
            re_run_kybd_input(code_trigger_starter_str);
        }
	}
		
}
