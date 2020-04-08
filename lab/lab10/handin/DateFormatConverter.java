public class DateFormatConverter{
	public static final String[] monthName = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    
	public static String numbersToWords(String date){
		//Here we want to convert from the all numbers format to the monthname date, year format. 
		//04/25/1955 -> April 25, 1955
		String[] newDate = date.split("/");
        int tempMonth = Integer.parseInt(newDate[0]);
        String month = monthName[tempMonth - 1];
        
        return month + " " + Integer.parseInt(newDate[1]) + ", " + newDate[2];
    }

    public static String wordsToNumbers(String date){
		//Here we want to convert from the all numbers format to the monthname date, year format. 
		// April 25, 1955 -> 04/25/1955
		String s = date.replace(",", "");
        String[] newDate = s.split(" ");
        String month;

        switch(newDate[0].toLowerCase()){
            case "january":
                month = "01";
                break;
            case "february":
                month = "02";
                break;
            case "march":
                month = "03";
                break;
            case "april":
                month = "04";
                break;
            case "may":
                month = "05";
                break;
            case "june":
                month = "06";
                break;
            case "july":
                month = "07";
                break;
            case "august":
                month = "08";
                break;
            case "september":
                month = "09";
                break;
            case "october":
                month = "10";
                break;
            case "november":
                month = "11";
                break;
            case "december":
                month = "12";
                break;
            default:
                // invalid month
                month = "-1";
        }

        return month + "/" + String.format("%02d", Integer.parseInt(newDate[1])) + "/" + newDate[2];
    }
	
	public static void main(String[] args){
		System.out.println(numbersToWords("04/25/1955")); //expected output: April 25, 1955
		System.out.println(wordsToNumbers("April 25, 1955")); //expected output: 04/25/1955
	}
} 