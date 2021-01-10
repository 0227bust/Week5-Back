
public class App {

	public static void main(String[] args) {
	Logger AsteriskLogger = new AsteriskLogger ();
	Logger SpacedLogger = new SpacedLogger();
	
		AsteriskLogger.log("Sup");
		AsteriskLogger.error("Sup");
		
		System.out.println();
		
		SpacedLogger.log("Mucho Spread ");
		SpacedLogger.error("Massive Error");
	}

}
