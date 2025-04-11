import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter yout len of numbers");
        int len = scan.nextInt();
        System.out.println("please enter yout numbers");
        int [] mainArr = new int[len];
        int [] auxArr = new int[len];
        int [] count = new int[len];
        int [] exist = new int[len];
        for(int i =0;i<len;i++){
            mainArr[i] = scan.nextInt();
            auxArr[i] = mainArr[i];
        }
        boolean isexist = false;
        int c = 0;
        for(int j = 0 ; j<len;j++){
            for(int n = 0;n<exist.length;n++){
                if((mainArr[j] == exist[n])){
                    isexist = true;
                }
            }
            if(!isexist){
                System.out.println("_");
                for(int k = 0;k<len ; k++){
                    if(mainArr[j] == auxArr[k]){
                        count[c]++;
                        exist[c] = mainArr[j];
                    }
                }
                if(!isexist){
                    System.out.println("+++++++++++++++++++++");
                    System.out.println(mainArr[j] +" "+ count[c]);
                    c++;
                }
            }
        }
    }
}