package es.ulpgc.DuplicateEncoderV2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public String enconder(String msg){
        String res = "";
        if (msg.length() == 1) return "(";

        System.out.println(msg.substring(0,1));
        if (msg.substring(1).contains(msg.substring(0,1))){
            System.out.println("entre en el if");
            return "))";

        }


        System.out.println("No entre en el if");
        return "((";
    }
}
