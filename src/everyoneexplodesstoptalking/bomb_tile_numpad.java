import java.util.*;
/**
 * Write a description of class bomb_tile_numpad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb_tile_numpad
{
    private static String toDefuse;
    public bomb_tile_numpad(){ 
    }
    public static String getDefuse(){
        return toDefuse;
    }
    public int randomizeNumber(){
        //returns a number to be used in operations
        return (int)(Math.floor(Math.random() * 99) + 1); //pick a random number between 1 and 100 inclusive;   
    }
    public char randomizeOperation(){
        char[] possibleOperations = {'+', '-', '*', '/'}; //new mathOp[4];
        return possibleOperations[(int)(Math.floor(Math.random()*3) + 1)];
        //function picks randomly from the char array operations
    }
    public void calculation(){
        
        toDefuse = "";
        char operation = '+'; //the operation currently in use
        int[] numbers = {0, 0, 0, 0};
        char[] utilizedOperators = {'+', '+', '+'}; // the operators to use
        for(int i = 0; i<=numbers.length; i++){
            numbers[i]=this.randomizeNumber();
        }
        for(int i = 0; i<numbers.length; i++){ //we want one less operation than there are total variables
            utilizedOperators[i] = this.randomizeOperation();
        }
        int finalAnswer = numbers[0];
        for(int i = 0; i<numbers.length; i++){
            operation = utilizedOperators[i];
            switch (operation /*Works because we use i+1*/){
                /* so at first, operation = utilizedOperators[0]
                   then after the switch, operation = utilizedOperators[1], etc.*/
                case '+': finalAnswer = finalAnswer + numbers[i+1]; break;
                case '-': finalAnswer = finalAnswer - numbers[i+1]; break;
                case '/': finalAnswer = finalAnswer / numbers[i+1]; break;
                case '*': finalAnswer = finalAnswer * numbers[i+1]; break;
            }
        }
        if(finalAnswer < 0){
            finalAnswer = finalAnswer * -1; //absolute value
        }
        
        
        /* if the operation returned is 5+2*10/7, the order will be (5+2)*10/7, which is 10, not 5+(2*10/7)
           So first thing to appear will be the first operation done*/
           /* make new class with all the possibilities of n (aka finalvalue)
            * and the right answer corresponding, and have that check against what the
              user inputs*/

        //finalAnswer = var1 (operation) var2 (operation) var3 (operation) var4;
        //have to return all the variables, operators, and the final answer in an array
        for(int i = 0; i<numbers.length; i++){
            toDefuse = toDefuse + numbers[i] + " ";
        }
        toDefuse = toDefuse + ",";
        for(int i = 0; i<utilizedOperators.length; i++){
            toDefuse = toDefuse + utilizedOperators[i] + " ";
        }
        toDefuse = toDefuse + "," + finalAnswer;
        //we want to store this someplace where we then use java api split to split up the string into the integers and chars
        //has to be done all at once because the variables and operators are local variables
        //do this to make it an integer starting with zeroes if digits less than 4 Integer.parseInt(String.format("%04d", finalAnswer));
        //file that reads this will need to distinguish between things between commas
        //todefuse should read: "1 23 55 234 , * + - , 236" so there should be 4, 3, 1 = 8 items total
    }

}