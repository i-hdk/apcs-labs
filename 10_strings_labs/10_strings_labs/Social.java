//(c) A+ Computer Science
//www.apluscompsci.com

public class Social
{
    private int ans;
    public Social (String ssn){
        ans = Integer.parseInt(ssn.substring(0,ssn.indexOf("-"))) + Integer.parseInt(ssn.substring(ssn.indexOf("-")+1,ssn.lastIndexOf("-"))) + Integer.parseInt(ssn.substring((ssn.lastIndexOf("-")+1),ssn.length()-1));
    }
    public int sum(){
        return ans;
    }
}