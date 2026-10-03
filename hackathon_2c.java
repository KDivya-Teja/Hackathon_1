import java.util.Scanner;
public class hackathon_2c{
    static double calculateTotalEnergy(double morningEnergy,double eveningEnergy){
        return morningEnergy+eveningEnergy;
}
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter morning enery value");
    double morning=sc.nextDouble();
    System.out.println("enter evening energy value");
    double evening=sc.nextDouble();
    double total=calculateTotalEnergy(morning,evening);
    System.out.println("Total energy: "+total);
    }
}
