public class Main{
    public static void main (String[]args){

        int[][] multiD = new int[2][3];
        multiD[0][0] = 10;
        multiD[0][1] = 20;
        multiD[0][2] = 30;
       
        multiD[1][0] = 40;
        multiD[1][1] = 50;
        multiD[1][2] = 60;

        
        for(int i = 0; i < multiD.length; i++){
            for(int j = 0; j < multiD[i].length; j++){
                System.out.println(multiD[i][j]);
            }
        }
        
        
    }
}
