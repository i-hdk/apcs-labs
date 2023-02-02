//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

class StringRemover
{
   private String remove;
   private String sentence;

    public StringRemover( String sen, String rem )
    {
        remove = rem;
        sentence = sen;
        removeStrings();
    }

    public void removeStrings()
    {
        int a = sentence.indexOf(remove);
        while(a!=-1){
            if(a-1>0) sentence = sentence.substring(0,a-1) + sentence.substring(a+remove.length());
            else sentence = sentence.substring(a+remove.length());
            a=sentence.indexOf(remove);
        }
    }

    public String toString()
    {
        return sentence;
    }
}