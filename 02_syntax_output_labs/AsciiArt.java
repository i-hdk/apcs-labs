//(c) A+ Computer Science
//www.apluscompsci.com

public class AsciiArt
{
    public static void main ( String[] args )
    {
        System.out.println("isabella \n\n" );
        System.out.println("hamster" );
        System.out.println("\n\n\n\n" );
        
        //line 1
        for(int i = 0; i < 5; i++) System.out.print(' ');
        System.out.print("/\\");
        for(int i = 0; i < 13; i++) System.out.print(' ');
        System.out.println("/\\");
        
        //line 2
        for(int i = 0; i < 4; i++) System.out.print(' ');
        System.out.print("/ _\\_");
        for(int i = 0; i < 3; i++) System.out.print('-');
        for(int i = 0; i < 3; i++) System.out.print('*');
        for(int i = 0; i < 4; i++) System.out.print('-');
        System.out.println("/_ \\");
        
        //line 3
        for(int i = 0; i < 3; i++) System.out.print(' ');
        System.out.print('/');
        for(int i = 0; i < 19; i++) System.out.print(' ');
        System.out.println('\\');
        
        //line 4
        for(int i = 0; i < 2; i++) System.out.print(' ');
        System.out.print('/');
        for(int i = 0; i < 21; i++) System.out.print(' ');
        System.out.print('\\');
        for(int i = 0; i < 8; i++) System.out.print(' ');
        System.out.println("/~~~/");
        
        //line 5
        System.out.print('/');
        for(int i = 0; i < 6; i++) System.out.print(' ');
        System.out.print("<o>");
        for(int i = 0; i < 6; i++) System.out.print(' ');
        System.out.print("<o>");
        for(int i = 0; i < 5; i++) System.out.print(' ');
        System.out.print('\\');
        for(int i = 0; i < 7; i++) System.out.print(' ');
        System.out.println("/~~/");
        
        //line 6
        System.out.print('|');
        for(int i = 0; i < 25; i++) System.out.print(' ');
        System.out.println("\\__/-/");
        
        //line 7
        System.out.print('\\');
        for(int i = 0; i < 11; i++) System.out.print(' ');
        System.out.print('`');
        for(int i = 0; i < 12; i++) System.out.print(' ');
        System.out.println('/');
        
        //line 8
        System.out.print(" \\");
        for(int i = 0; i < 21; i++) System.out.print(' ');
        System.out.println('/');
        
        //line 9
        System.out.print("   **- ");
        for(int i = 0; i < 13; i++) System.out.print('_');
        System.out.print("-*");
    }
}