public class TokenizePhoneNumber{
	public static String convertPhoneNumber(String phoneNumber) {
        
        String result = phoneNumber;
        result = result.replace("(", "");
        result = result.replace(")", "");
        result = result.replace("-", "");
        result = result.replace(" ", "");
        return result;

	}

    public static void main(String[] args){
        System.out.println(TokenizePhoneNumber.convertPhoneNumber("(504) 123-4567")); //expected output 5041234567
    }
}