package week2.day1;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				String str = "welcome to chennai";
				int count = 0;
		        char word;
		        for (int i = 0; i < str.length(); i++) {

		        	word = str.charAt(i);
		            if (word == 'e')
		                count++;
			}
		        System.out.println("e appears " + count + " times ");
	}

}
