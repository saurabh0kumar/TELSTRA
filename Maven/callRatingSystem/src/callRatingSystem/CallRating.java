package callRatingSystem;

public class CallRating {
	public String callId;
	public int callDuration;
	public double callQuality;
	public String ratingCategory;
	
	public CallRating(String callId, int callDuration, double callQuality, String ratingCategory) {
		super();
		this.callId = callId;
		this.callDuration = callDuration;
		this.callQuality = callQuality;
		this.ratingCategory = ratingCategory;
	}
}
