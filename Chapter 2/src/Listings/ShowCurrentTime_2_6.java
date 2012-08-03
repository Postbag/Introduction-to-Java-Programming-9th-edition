package Listings;

public class ShowCurrentTime_2_6 {
	public static void main(String[] args) {
		
		//Obtain the total milliseconds since midnight, jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		//obtain the seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000; //devide by 1000 because it's in milliseconds
		
		//Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		//Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		//Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		//Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		//Compute the current hour
		long currentHour = totalHours % 60;
		
		
		//Finally ready to display the results
		System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + "GMT");
		
		//Next step would be to make the clock update itself without having to rerun the source
	}

}
