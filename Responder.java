import java.util.*;
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
    private HashMap<String,String> rExacta;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {        
        nAleat = new Random();
        listaStrings = new ArrayList<>();
        rExacta = new HashMap<String,String>();
        
        listaStrings.add ("Yeah.");
        listaStrings.add("No, that's imposible.");
        listaStrings.add("Of course.");
        listaStrings.add("Your problem is my problem...");
        listaStrings.add("I can't help you, sorry...");
        
        rExacta.put("HI","Hello, can I help you?");
        rExacta.put("THANKS", "It's nothing!");
        rExacta.put("HELLO","Hello, can I help you?");
        rExacta.put("PROBLEM","Your problem is my problem...");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
        String respuesta = listaStrings.get(nAleat.nextInt(listaStrings.size()));
        if (rExacta.containsKey(input)){
            respuesta = rExacta.get(input);
        }        
        return respuesta;
    }
}
