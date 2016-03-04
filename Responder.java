import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random nAleat;
    private ArrayList<String> listaStrings;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        nAleat = new Random();
        listaStrings = new ArrayList<>();
        listaStrings.add ("Yeah.");
        listaStrings.add("No, that's imposible.");
        listaStrings.add("Of course.");
        listaStrings.add("Your problem is my problem...");
        listaStrings.add("I can't help you, sorry...");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return listaStrings.get(nAleat.nextInt(listaStrings.size()));
    }
}
