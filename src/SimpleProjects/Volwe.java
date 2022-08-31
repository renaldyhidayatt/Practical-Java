package SimpleProjects;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Volwe {
    public static void kentang(){
        char c = ' ';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please Insert a Character");

        try{
            c = (char)br.read();
        }catch (Exception e){
            System.out.print(e);
        }

        switch(c) {

            case 'a':
                System.out.println(c + " is a vowel");
                break;
            case 'e':
                System.out.println(c + " is a vowel");
                break;

            case 'i':
                System.out.println(c + " is a vowel");
                break;

            case 'o':
                System.out.println(c + " is a vowel");
                break;

            case 'u':
                System.out.println(c + " is a vowel");
                break;
            case 'A':
                System.out.println(c + " is a vowel");
                break;

            case 'E':
                System.out.println(c + " is a vowel");
                break;

            case 'I':
                System.out.println(c + " is a vowel");
                break;

            case 'O':
                System.out.println(c + " is a vowel");
                break;

            case 'U':
                System.out.println(c + "is vowel");
                break;

            default:
                System.out.println(c + " is a consonant");
                break;
        }
    }
}
