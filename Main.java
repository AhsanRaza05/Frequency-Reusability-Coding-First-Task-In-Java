import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        
     //int N[] = {0, 1, 2, 4, 0, 5, 7, 9, 13, 19,20};
     
	 System.out.println("Please Enter the value of N [For Multiple Seperate by , (comma)]:");
     String x = new Scanner(System.in).nextLine();
	 
	 
	 // Removing all white spaces
	 x = x.replace(" ","");
	 
	 // Removing all Tabs
	 x = x.replace("\t","");
	 
	 // Removing the Commas at beginning
	 x = x.replaceAll("^,+(?!$)","");
	 
	 // Removing the Commas at Ending
	 x = x.replaceAll(",$","");
	 
	 // Split the input string (lsit of numbers) to Arrays of string, to sperate the values 
	 String input[] = x.split(",");
     
     // Cast String array to array of Integers
     int N[] = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
    

      // LOOP to iterate all elements of List N
     l1:for(int a = 0; a < N.length ;a++){

         System.out.println("For N:"+N[a]);

         int sqrt = (int) Math.sqrt(N[a]) ;
         
         // To check the case # 1 when value of J = 0 
         if(sqrt * sqrt == N[a]){
             System.out.println(String.format("\t RESULT: i = %d, j = %d <>",sqrt,0));
         }
         
         else{
             
            // Loop for values of i
             l2:for(int i = 1; i <= sqrt; i++){

                // Loop for values of j
             l3:for(int j = 1; j <= (int) Math.sqrt(sqrt); j++){

                // Check the combination of i & j which staisfies the formula
                if (i * i + i * j + j * j == N[a]){

                    System.out.println(String.format("\t RESULT: i = %d, j = %d",i,j));
                    continue l1;
                }
             }

         } 
         
        System.out.println("\t i & j does not exist!");
             
         }
         
         

     }
    }
}