//To check whether the give character is upper or lowercase (hardcode value)
class CharCaseChecker{
	public static void main(String[] args){

		char ch ='E';
		System.out.println(ch);

		if(ch>='A' && ch<='Z'){
			System.out.println( ch+ " is in uppercase");
		} else if(ch>='a' && ch<='z'){
			System.out.println(ch+ " is in lowercase");
		} else{
			System.out.println(ch+ " is not a character");
		}
	}
}
