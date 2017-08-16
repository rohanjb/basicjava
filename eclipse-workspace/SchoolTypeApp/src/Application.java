import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.print("enter your grade: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        
        
        if(i<=5)
            System.out.println("Elementary School");
            
        if(i>=6 && i<=8)
            System.out.println("Middle School");
            
        if(i>=9 && i<=12)
            System.out.println("Highschool School");
            
        if(i>=12)
        	System.out.println("College");
        	
	}

}
