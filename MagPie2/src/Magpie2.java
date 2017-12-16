// Ying Qian
// APCS1
// Magpie project
public class Magpie2 {

	//Get a default greeting and return a greeting	
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * takes in a user statement
	 * returns a response based on given rules
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("No") >= 0) {
			response = "Do you ever say yes";
		} else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0) {
			response = "Tell me more about your family.";
		} 
		else if (statement.indexOf("brother") >= 0){
			response = "My brother? I would love to see him, too bad I don't have one.";
		}
		else if (statement.indexOf("Ms. Dreyer") >= 0) {
			response = "Woah, a teacher! I wonder what she teaches...";
		}
		else if(statement.indexOf("Hi") >= 0) {
			response = "Hello! I sure love energetic greetings";
		}
		else if(statement.indexOf("hate") >= 0){
			response = "be more optimistic!!";
		}
		else if(statement.trim().length() == 0){
			response = "Hey, you still there?";
		}
		else if(statement.indexOf("you") >= 0){
			response = "don't talk about me, worry about yourself first";
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * returns a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "I agree.";
		} else if (whichResponse == 5) {
			response = "That's pretty cool.";
		}

		return response;
	}
}