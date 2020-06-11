package Day1;

public class Goh {
    public static void main(String[] args) {
        System.out.println("Nuqak");

    evenjan();
    oddjan();
    }

   public static void evenjan (){

        int even = 100;
        for(int i=0; i<even;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void oddjan (){

        int even = 100;
        for(int i=0; i<even;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }


}
