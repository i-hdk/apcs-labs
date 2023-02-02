//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringStuff
{
    private String a;
    public StringStuff(String b){
        a = b;
    }
    public String firstlast(){
        String b = a.substring(0,1) + a.substring(a.length()-1);
        return b;
    }
    public String m(){
        return a.substring(a.length()/2,a.length()/2+1);
    }
    public boolean same(){
        if(a.substring(0,1).equals(a.substring(a.length()-1))) return true;
        else return false;
    }
}