import java.util.Random;

public class test1 {

	public static void main(String[] args) {
		Random randomNumber = new Random();
		int number;
		String champion = "unknown";
		for(int champ = 1; champ<=1; champ++) {
		number = randomNumber.nextInt(101);
		champion = String.valueOf(number);
		System.out.println(number);	
		if (number <= 0)  {
		champion = "Ashe";
		System.out.println(champion);
		} else if (number <=10)  {
		champion = "Ekko";
		System.out.println(champion);	
		} else if (number <= 20)  {
		champion = "Gragas";
		System.out.println(champion);
		} else if (number <= 30)  {
		champion = "Ahri";
		System.out.println(champion);
		} else if (number <= 40)  {
		champion = "Xerath";
		System.out.println(champion);
		} else if (number <= 50)  {
		champion = "Urgot";
		System.out.println(champion);
		} else if (number <= 60)  {
		champion = "Yorick";
		System.out.println(champion);
		} else if (number <= 70)  {
		champion = "Ivern";
		System.out.println(champion);
		} else if (number <= 80)  {
		champion = "Graves";
		System.out.println(champion);
		} else if (number <= 90)  {
		champion = "Elise";
		System.out.println(champion);
		} else if (number <= 100)  {
		champion = "Kha'Zix";
		System.out.println(champion);
		} else {
		System.out.println("Something went wrong...");
		}				
	}
}
}