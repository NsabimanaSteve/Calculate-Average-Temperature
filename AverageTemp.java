import java.util.Scanner;

public class AverageTemp {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter 7 temperature: ");
        double sum=0;
        for (int Count=0; Count < 7; Count++){
            double Temerature=scanner.nextDouble();
            sum=sum+Temerature;
        }
        double average=sum/7;
         System.out.println("The average temperature is :" + average);

         double[] tempereture= new double[7];
         double TOTAL_TEMPERATURE = 0;
         for ( int index=0;index < 7; index++){
            tempereture[index]=scanner.nextDouble();
            TOTAL_TEMPERATURE=TOTAL_TEMPERATURE+tempereture[index];
         }
         double avarege=TOTAL_TEMPERATURE/7;
         System.out.println("The average temperature is :" + avarege);
         
        
         System.out.println("The average temperature are: ");
         for( int index =0; index < 7; index++){
            if(tempereture[index] < avarege)
            System.out.println(tempereture[index]+ " Below Average");
            else if (tempereture[index] > avarege)
                System.out.println(tempereture[index]+ " Above Average");

            else
                 System.out.println(tempereture[index]+ " Average");

            
         }
         









        
    }
    
}
