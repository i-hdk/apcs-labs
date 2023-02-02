//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleThree
{
    public static String go( int size, String let )
    {
        String output="";
        for(int i = 0; i < size; i++){
            for(int j = 0; j<size-1-i; j++) output+=' ';
            for(int j = 0; j<i+1;j++)output+=let;
            output+="\n";
        }
        return output+"\n";
    }
}