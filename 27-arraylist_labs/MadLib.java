//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class MadLib
{
    private ArrayList<String> verbs;
    private ArrayList<String> nouns;
    private ArrayList<String> adjectives;
    private String r;

    public MadLib(String fileName)
    {
        // initialize instance variables
        verbs = new ArrayList<String>();
        nouns = new ArrayList<String>();
        adjectives = new ArrayList<String>();
        r = "";
        //load stuff
        
        try{
            // load the story
            Scanner file = new Scanner(new File("story.txt"));
            loadNouns();
            loadVerbs();
            loadAdjectives();

            // build the story, replacing special characters with noun/verb/adj
            while(file.hasNext()){
                String a = file.next();
                if(a.equals("#")) r+= getRandomNoun();
                else if(a.equals("@")) r+=getRandomVerb();
                else if(a.equals("&")) r+=getRandomAdjective();
                else r+=a;
                r+=" ";
            }
        }
        catch(Exception e){
            out.println("Houston we have a problem!");
        }        
    }

    public void loadNouns()
    {
        try{        
            //add code here
            Scanner file = new Scanner(new File("nouns.txt"));
            while (file.hasNext()) {
                nouns.add(file.next());
            }
        }
        catch(Exception e)
        {
        }            
    }

    public void loadVerbs()
    {
        try{    
            //add code here
            Scanner file = new Scanner(new File("verbs.txt"));
            while (file.hasNext()) {
                verbs.add(file.next());
            }
        }
        catch(Exception e)
        {
        }
    }

    public void loadAdjectives()
    {
        try{
            //add code here  
            Scanner file = new Scanner(new File("adjectives.txt"));
            while (file.hasNext()) {
                adjectives.add(file.next());
            }
        }
        catch(Exception e)
        {
        }
    }

    public String getRandomVerb()
    {
        return verbs.get((int)(Math.random()*verbs.size()));
    }

    public String getRandomNoun()
    {
        return nouns.get((int)(Math.random()*nouns.size()));
    }

    public String getRandomAdjective()
    {
        return adjectives.get((int)(Math.random()*adjectives.size()));
    }        

    public String toString()
    {
        return r;
    }
}