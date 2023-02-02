//(c) A+ Computer Science
//www.apluscompsci.com

public class AsciiBox2
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 20;i++){
            for(int j =  0; j < 20; j++){
                if(i<3||i>16){
                    System.out.print('+');
                }
                else{
                    if(i==10&&j==4){
                        System.out.print("life is short");
                        j+=12;
                        continue;
                    }
                    if(j<3||j>16){
                        System.out.print('+');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}