import java.util.Random;
public class Pole {
     public int mass[][] = new int[4][4];
     public void vvod(){
         for (int i = 0; i < mass.length; i++) {
             for (int j = 0; j < mass[0].length; j++) {
                 this.mass[i][j] = 0;
             }
         }
         Randomm();

     }
     public void Randomm() {
        boolean ch = false;
         Random r1 = new Random();
         int X = new Random().nextInt(4);
         int Y = new Random().nextInt(4);
         todo:
         for (int i = 0; i < mass.length; i++) {
             if (ch) break;
             for (int j = 0; j < mass[0].length; j++) {
                 if(ch) break;
                 if (mass[i][j] == 0) {
                     if (r1.nextInt(10) < 9) {
                         mass[X][Y] = 2;
                         ch = true;
                     } else {
                         mass[X][Y] = 4;
                         ch = true;
                     }
                 }
             }


         }

     }
     public void vivod(){
         for (int x[] : mass) {
             for (int y : x)
                 System.out.print(y + "\t");
             System.out.println();
         }

     }
     public void left(){
         for (int i = 0; i < mass.length-1; i++) {
             int zero = 0;
             for (int j = 0; j < mass[0].length-1;j++) {
                if (mass[i][j]==0 ){
                    zero++;
                }
                else if(j==3 & mass[i][j]==0){
                    mass[i][j-zero] = mass[i][j];

                }
                else {mass[i][j-zero] = mass[i][j];}
             }
         }
     }
    public void right(){

    }
    public void up(){

    }
    public void down(){

    }



}
