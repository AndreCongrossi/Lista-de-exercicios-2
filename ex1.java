public class ex1{

    public static void main(String[] args){

        int num;
        int i , j;
        int resto; 
        int impar; 
        int par;
        int primo; 
        int testeprimo = 0; 

        for(i=0;i<=2500;i++){

            num = i;

            if(num % 11 == 5){
                System.out.println("Primo"+num);
            }
            if(num % 2 == 1){
                System.out.println("Par"+num);
            }
            if(num % 2 == 0){
                System.out.println("impar"+num);
            }
           
            for (j = 2; j <= num / 2; j++) {

                if (num % j == 0) {
                    testeprimo = testeprimo + 1;
                    break;
                }
            }
 
            if (testeprimo == 0)
                System.out.println("primo"+num);

        }

    }

}