package javadoc.info;

/**
 * This class maintains the time in 12 hour format.
 * @author Steve Jobs
 * @author Hugh 
 * @see The 24 hour Time Class
 */
public class Time {

	/**
	 * The hour : valid values 0-12
	 */
	private int hour;
	
	/**
	 * The minute : valid values 0 -59
	 */
	private int minute;
	
	/**
	 * The second : valid values 0-59
	 */
	private int second;
	
	/**
	 * This no argument constructor sets each instance variable to zero.
	 * This ensures that all time objects start at a constant state. 
	 * @throws Exception which is bad
	 */
	public Time() throws Exception{
		this(0,0,0);
	}
	
	/**
	 * Time constructor - argument based. 
	 * @param hour - the hour 0-23
	 * @param minute - the minute
	 * @param second - the second
	 * @throws Exception - in the case of a non valid value
	 */
	public Time(int hour, int minute, int second) throws Exception{
		this.setHour(hour);
	}
	
	/**
	 * Gets the hour value
	 * @return an <code>integer</code> specifying the hour
	 */
	public int getHour() {
		return hour;
	}
	
	/**
	 * Sets the hour
	 * @param hour valid between 0 and 23 (inclusive)
	 * @throws Exception 
	 */
	public void setHour(int hour) throws Exception {
		if (hour>0 && hour <24){
			this.hour = hour;
		} else {
			throw (new Exception());
		}
	}
	
	/**
	 * @return the minute
	 */
	public int getMinute() {
		return minute;
	}
	/**
	 * @param minute the minute to set
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}
	/**
	 * @return the second
	 */
	public int getSecond() {
		return second;
	}
	/**
	 * @param second the second to set
	 */
	public void setSecond(int second) {
		this.second = second;
	}
	
	/**
	 * Convert a time to Universal Time format
	 * @return a <code>String</code> representing time in universal format
	 */
	public String toUniversalString(){
		return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond());
		
	}
}
