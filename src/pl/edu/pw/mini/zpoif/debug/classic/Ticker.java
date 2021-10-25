package pl.edu.pw.mini.zpoif.debug.classic;

public class Ticker {

	private static final String WELCOME_MESSAGE = "Hi, let`s start!";

	public static void main(String[] args) {
		try {
			go();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void go() throws InterruptedException {

		boolean continueFlag = true;
		long sleepingTimeMs = 2000;
		ConsolePrinter consolePrinter = new ConsolePrinter("My printer!");
		consolePrinter.printMessage(WELCOME_MESSAGE);
		while (continueFlag) {
			Thread.sleep(sleepingTimeMs);
			consolePrinter.printMessage("Has just woke up!");
		}
		consolePrinter.printMessage("Good bye");

	}

}
