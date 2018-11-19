public class Event {
	private char eventType;
	private double timestamp;
	private Individiual reference;

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
		string txt = "insert text ";
		switch(event){
			case'd':
				eventType = txt + "DEATH";
				break;
			case'm':
				eventType = txt + "MUTATION";
				break;
			case 'r':
				eventType = txt + "REPRODUKTION";
				break;
		}
		return(eventType + time +Indidual);
	}
}
