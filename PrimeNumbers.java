public class PrimeNumbers{
    public static void
    main(strings[] args){
        for(int num = 2; num <= 500; num++){
            boolean isPrime = true;
            for(int i=2;i<=math.sqrt(num);i++){
                if(num i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                system.out.print(num+"");
            }
        }
    }
}