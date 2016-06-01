
/**
 * Write a description of class bomb_tile_numpad_splitter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
package everyoneexplodesstoptalking;

public class bomb_tile_numpad_splitter extends bomb_tile_numpad
{
    public bomb_tile_numpad_splitter()
    {
        
    }
    public String question(){
        
        String question = new String ("");
        String[] firstTemp = getDefuse().split(","); //Split the string by commas
        String[] tempInt = firstTemp[0].split(" "); //Take the first item in the array, split it by spaces
        String[] tempChar = firstTemp[1].split(" ");//take the second item in the array, split it by spaces
        int answer = Integer.parseInt(firstTemp[2]);
        //Then put the array of ints and array of chars into string question formatted as a question
        question = "What is " + tempInt[0] + " " + tempChar[0] + " " + tempInt[1] + " " + tempChar[1] + " " + tempInt[2] + " " + tempChar[2] + " " + tempInt[3] + "?"; 
        //need to format strings into chars and ints
        return question;
    }
}
