import java.util.Scanner;
import static java.lang.System.*;
public class Main 
{
  public static void main(String[] args) 
	{
    Scanner sc = new Scanner(System.in);
		ArrayList<Integer> myList = new ArrayList<>();
		for(int i = 0;i<10;i++) myList.add(sc.nextInt());
		out.println(myList);
		out.println(myList.remove(sc.nextInt()));
		out.println(myList);
		for(Object x : myList) {out.println(x);} 
		for(Object x : myList) {out.println(x);} 
		sc.close();
  }
}