import java.util.*;
public class Binary_pattern {
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Number of rows you want in this pattern?");
 
        int rows = scanner.nextInt();
        System.out.println("----Pattern is----");
        for (int i = 1; i <= rows; i++) 
        {
            int num;
 
            if(i%2 == 0)
            {
                num = 0;
 
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
 
                    num = (num == 0)? 1 : 0;
                }
            }
            else
            {
                num = 1;
 
                for (int j = 1; j <= rows; j++)
                {
                    System.out.print(num);
 
                    num = (num == 0)? 1 : 0;
                }
            }
 
            System.out.println();
        }

}
