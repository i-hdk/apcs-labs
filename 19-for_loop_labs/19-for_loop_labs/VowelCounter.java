//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class VowelCounter
{
    public static String getNumberString( String s)
    {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if(a<='Z'&&a>='A') a+= 'a'-'A';
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                s = s.substring(0,i) + count + s.substring(i+1);
                if(count==9) count = 0;
                else count++;
            }
        }
        return s;
    }
}


