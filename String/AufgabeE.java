package QC_Java.String;

public class AufgabeE {
    /*
        Gegeben sei folgendes Snippet:
                ...
                String result = "";
                for(int i = 0; i < 10000; i++) {
                    result += generateRandomString()
                }
                ...
        Optimieren Sie diesen Code.
    */
    public static String addRandomString(){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < 10; i++) {
            result.append(generateRandomString());
        }
        return(result.toString()) ;
    }
    public static String generateRandomString(){

        // byte b = 5;
        // ASCII 65 - 90
        StringBuilder wort = new StringBuilder();
        int rZS = (int) (Math.random() * (10 - 1 + 1) + 1); // Randomzahl für String 1-10 chars
        for(int i = 0; i < rZS ; i++ ) {
            int z = (int) (Math.random() * (90 - 65 + 1) + 65); // math.random in ChatGPT gefunden
            char wortzahl = (char) (z);
            wort.append(String.valueOf(wortzahl));
        }
        //char c = (char) (z);
        //System.out.println(String.valueOf(c));
        return(wort.toString());
    }
    public static void main(String[] args) {
        String result = addRandomString();
        System.out.println(result);
    }
}

