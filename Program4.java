//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
public class Program4{
  public static void main(String[] args){
    //Declare Variable 
    int val1 = 0; 
    int val2 = 0; 
    int val3 = 0; 
    int val4 = 0;
    
    //Create my scanner
    Scanner valScanner = new Scanner(System.in);
    
    //Ask for user input
    System.out.println("Enter the val1: ");
    val1 = valScanner.nextInt();
    
    System.out.println("Enter the val2: ");
    val2 = valScanner.nextInt();
    
    System.out.println("Enter the val3: ");
    val3 = valScanner.nextInt();
    
    System.out.println("Enter the val4: ");
    val4 = valScanner.nextInt();
    
    //Add and store the ans
    int val5 = val1+val2+val3+val4;
    
    //Avg and store in var6
    double val6 = val5/4.0;
    //Print results
    System.out.println("The sum of the four numbers is " + val5);
    System.out.println("The average of the four numbers is " + val6);
  }
}
//Paste console output below:
/*


*/
