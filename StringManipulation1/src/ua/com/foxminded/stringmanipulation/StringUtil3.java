package ua.com.foxminded.stringmanipulation;


public class StringUtil3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder recoverSource = new StringBuilder();

		String source = "Hello world!";

		String[] words = source.split(" ");
		
		for(int i =0; i<words.length; i++) {
			System.out.println(words[i]);
			
			char[] leters = words[i].toCharArray();
			for(int j=0; j<leters.length; j++){
				System.out.println(leters[j]);
				recoverSource.append(leters[j]);
				System.out.println(recoverSource.toString() + "  - Це recover");
			}
		}
	}
}
