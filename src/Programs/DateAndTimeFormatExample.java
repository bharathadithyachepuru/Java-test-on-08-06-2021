package Programs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateAndTimeFormatExample {

	public static void main(String[] args) throws ParseException {
		
		Date userDate=null;
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter your date");
        String cinput = input.nextLine();
				
				userDate = dateFormat.parse(cinput);
	   
			if (comparisionWithCurrentDate(userDate)) {
			
				System.out.println("User date is greater than current Date");
			}
			else {
				System.out.println("User date is less than current Date");		
				
			}
			
			
			System.out.println("Date in yyyy-mm-dd hh:mm:ss format is: " + dateConversion(userDate));
		
		}
		




private static boolean comparisionWithCurrentDate(Date userDate) {
	
		return false;
	}





public static String dateConversion(Date date)
{
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
	
	return dateFormat.format(date);

}

private static boolean comparisionWithCurrentDate(String userDate){
    if(userDate.isEmpty() || userDate.trim().equals("")){
        return false;
    }else{
            SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
               Date d=null;
               Date d1=null;
            String today=   getToday("dd/MM/yyyy");
            try {
                
                d = sdf.parse(userDate);
                d1 = sdf.parse(today);
                if(d1.compareTo(d) <0){
                    return false;
                }else if(d.compareTo(d1)==0){
                            if(d.getTime() < d1.getTime()){
                                return false;
                            }else if(d.getTime() == d1.getTime()){
                                return true;
                            }else{
                                return true;
                            }
                }else{
                    return true;
                }
            } catch (ParseException e) {
                e.printStackTrace();                    
                return false;
            }
    }
 }

public static String getToday(String format){
    Date date = new Date();
    return new SimpleDateFormat(format).format(date);
	}

}
