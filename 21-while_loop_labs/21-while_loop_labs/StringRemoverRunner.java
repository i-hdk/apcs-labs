//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringRemoverRunner
{
    public static void main( String args[] )
    {
        //add test cases       
        StringRemover a = new StringRemover("xR-MxR-MHelloxR-M","R-M");
        System.out.println(a);
        StringRemover b = new StringRemover("sxsssxssxsxssexssxsess s","xs");
        System.out.println(b);
        StringRemover c = new StringRemover("fuxqwexqwertyxqwexqwertyrtyxqwertyrty n","qwerty");
        System.out.println(c);
        StringRemover d = new StringRemover("dogdogcatddodogdogdoggo g","dog");
        System.out.println(d);
    }
}