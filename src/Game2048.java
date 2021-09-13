
import java.io.IOException;
import java.util.Scanner;

import static java.lang.Runtime.getRuntime;

public class Game2048 {
    public static void main(String[] args) throws IOException {
        Pole p1 = new Pole();
        p1.vvod();
        p1.vivod();
        char k;
        do{
            k =(char) System.in.read();
            if(k == 'a'){
                p1.left();
                p1.Randomm();
                p1.vivod();

            }
        }while(k !='q');

    }

}

