package Day1;

public class OddNumberAndEven {
    public static void main(String[] args) {
         int odd = 100;
         for(int i=0; i<=odd; i++ ){
             if(i % 2!=0  ){
                 System.out.print(i+",");
             }
         }
        System.out.println();
        int even=100;
        for(int a=1; a<=even; a++){
            if(a%2==0){
                System.out.print(a+",");
            }
        }
    }
}
