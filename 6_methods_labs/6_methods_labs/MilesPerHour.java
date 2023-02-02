//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MilesPerHour
{
    public static double getMPH( int dist, int hrs, int mins )
    {
        return (dist/(((double)mins/60)+hrs));
    }
}

