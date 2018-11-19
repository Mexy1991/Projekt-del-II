public class Event{

public static final char DEATH = 'd';
public static final char MUTATION = 'm';
public static final char REPRODUCTION = 'r';
public Event[] event = new Event[3]; 


public Event(char charType, double doubleTime, Indiviual newIndividual){

	this.event[0] = char(chartype)
	this.event[1] = double(doubleTime)
	this.event[2] =	Individual(newIndividual)

	public char type(){
	
	
	return;
	
	}
    
	public double time(){
	
	return;
	
	}
    
	public Individual individual(){
	
	return;
	
	}
	
	public String toString(){

			string eve = "event type";
		switch(event){
			case'd': 
			eventType = eve + "DEATH";
			break;
			
			case'm': 
			eventType = eve + "MUTATION";
			break;
			
			case 'r': 
			eventType = eve + "REPRODUKTION";
			break;
		}

			return eventType + time +Indidual;


	}

}