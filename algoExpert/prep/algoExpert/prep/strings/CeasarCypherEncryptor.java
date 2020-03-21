package  algoExpert.prep.strings;

class CeasaerCypherEncryptor {
    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(ceaserCypherEncryptor("xyz", 4));
    }

    public static String ceaserCypherEncryptor(String str, int key){
        
        int newKey = key % 26;
        char[] lastword = new char[str.length()];

        for(int i=0; i < str.length(); i++){
            char c = str.charAt(i);
            lastword[i] = newLetter(c, newKey);
        }

        return new String(lastword);
    }

    public static char newLetter(char c, int key){
        int unicodenumber = c + key;
        return unicodenumber <= 122 ? (char) unicodenumber : (char) (96 + unicodenumber % 122); 
    }
}