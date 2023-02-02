//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleWord
{
   private String word;

    public TriangleWord(String w)
    {
        word=w;
    }

    public String toString()
    {
        String output="";
        for(int i = 0; i < word.length()-1; i++){
            for(int j = word.length()-1; j > i; j--) output+=" ";
            output+= word.substring(i,i+1);
            for(int j = 0; j < i*2-1; j++){
                output+=" ";
                if(j==i*2-2) output+=word.substring(i,i+1);
            }
            output+="\n";
        }
        for(int i = word.length()-1; i>0; i--) output+=word.substring(i,i+1);
        output+=word;
        return output+"\n";
    }
}