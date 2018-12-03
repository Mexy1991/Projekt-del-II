public class Event {
	private char eventType;
	private double timestamp;
	private Individual reference;

	public Event(char type, double time, Individual refer){
		eventType = type;
		timestamp = time;
		reference = refer;
	}

	public char type(){
	return(eventType);
	}

	public double time(){
	return(timestamp);
	}

	public Individual individual(){
	return(reference);
	}

	public String toString(){
		String eventText = "Event type: ";
		String finalText = "";
		//Event type: mutation; time: 9.192599780944755
		switch(eventType){
			case'd':
				finalText += eventText + "death; ";
				break;
			case'm':
				finalText += eventText + "mutation; ";
				break;
			case 'r':
				finalText += eventText + "reproduction; ";
				break;
		}
		finalText += "time: " + timestamp;
		return(finalText);
	}
}
