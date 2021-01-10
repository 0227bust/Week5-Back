
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
			StringBuilder logSpace = new StringBuilder ();
			
				for(int i = 0; i < log.length(); i++) {
				logSpace= logSpace.append(log.charAt(i));
				logSpace= logSpace.append(" ");
			}
						System.out.println(logSpace.toString());
	}

	@Override
	public void error(String error) {
			StringBuilder errorSpace = new StringBuilder();

				for(int i = 0 ; i < error.length(); i++)
		{
					errorSpace = errorSpace.append(error.charAt(i));
					errorSpace = errorSpace.append(' ');
		}
		
					System.out.println("ERROR: " + errorSpace.toString());
							
		
	}

}
