//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleFive
{
    public static String go( int amount, char letter )
    {
        String output="";
        for(int i = amount; i > 0; i--){
            for(int j = 0; j < i; j++){
                for(int k = 0; k < amount-j; k++){
                    int b = letter-'A';
                    int c = ((b+j)%26);
                    char a = (char)('A'+(c));
                    output+=a;
                }
                output+=' ';
            }
            output+="\n";
        }
        return output;
    }
}