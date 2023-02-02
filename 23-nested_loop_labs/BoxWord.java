//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class BoxWord
{
    public static String go( String word )
    {
        String output=word+"\n";
        for(int i = 0; i < word.length()-2;i++){
            output+=word.substring(i+1,i+2);
            for(int j = 0; j < word.length()-2;j++)output+=" ";
            output+=word.substring(word.length()-2-i,word.length()-1-i)+"\n";
        }
        for(int i = word.length()-1; i>=0; i--) output+=word.substring(i,i+1);
        return output+"\n";
    }
}