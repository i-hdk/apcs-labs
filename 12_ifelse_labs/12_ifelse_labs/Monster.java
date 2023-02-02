//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class Monster
{
    private String name;
    private int howBig;    

    public Monster(String n, int size)
    {
        name = n;
        howBig = size;
    }

    public String getName()
    {
        return name;
    }
    
    public int getHowBig()
    {
        return howBig;
    }
    
    public boolean isBigger(Monster other)
    {
        if(howBig>other.getHowBig()) return true;
        return false;
    }
    
    public boolean isSmaller(Monster other)
    {
        //call isBigger() use !
        if(howBig==other.getHowBig()) return false;
        return (!isBigger(other));
    }

    public boolean namesTheSame(Monster other)
    {
        if(howBig==other.getHowBig()) return true;
        return false;
    }
    
    public String toString()
    {
        String s = name + " " + howBig;
        return s;
    }
}