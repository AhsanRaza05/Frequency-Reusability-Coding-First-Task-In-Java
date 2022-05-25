import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        
     //int N[] = {0, 1, 2, 4, 0, 5, 7, 9, 13, 19,20};
     
	 System.out.println("Please Enter the value of N [For Multiple Seperate by , (comma)]:");
     String x = new Scanner(System.in).nextLine();
	 
	 
	 System.out.println("%"+x+"%");
	 
	 // Removing all white spaces
	 x = x.replace(" ","");
	 
	 // Removing all Tabs
	 x = x.replace("\t","");
	 
	 // Removing the Commas at beginning
	 x = x.replaceAll("^,+(?!$)","");
	 
	 // Removing the Commas at Ending
	 x = x.replaceAll(",$","");
	 
	 
	 System.out.println("%"+x+"%");
	 
	 String input[] = x.split(",");
     System.out.println("N: "+Arrays.toString(input));
     //System.out.println(Arrays.toString(input));
     
     //Trim the values of String
     //Arrays.parallelSetAll(input, (i) -> input[i].trim());
     ///Arrays.stream(array).map(String::trim).toArray(unused -> array);
     
	 // Remove the Leading and ending of commas
     //Arrays.parallelSetAll(input, (i) -> input[i].replace(",",""));
	 
     //System.out.println(Arrays.toString(input));
     
     // Cast String array to array of Integers
     int N[] = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
     //N = Stream.of(input).mapToInt(Integer::parseInt).toArray();
                  
      System.out.println("N: "+Arrays.toString(N));

     l1:for(int a = 0; a < N.length ;a++){

         System.out.println("For N:"+N[a]);

         int sqrt = (int) Math.sqrt(N[a]) ;
         
         if(sqrt * sqrt == N[a]){
             System.out.println(String.format("\t RESULT: i = %d, j = %d <>",sqrt,0));
         }
         
         else{
             
             l2:for(int i = 1; i <= (int) Math.sqrt(N[a]); i++){

             l3:for(int j = 1; j < i; j++){

                //System.out.println("\t"+i+" "+j);
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