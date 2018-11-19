import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.io.IOException;

public class StackCalculatorProgram {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		Calculator calc = new Calculator();
		System.out.println("Stack calculator");

		while (true) {
			System.out.println(calc.toString());
			System.out.print(">>> ");
			String command = keyboard.readLine();
			if("exit".equals(command) || "end".equals(command)) {
				System.out.println("Good Bye");
				break;
			}
			try {
			parseAndExecuteAll(command, calc);}
			catch(EmptyStackException e) {
				System.out.println("Error, Empty Stack");
			}
			catch(NumberFormatException e) {
				System.out.println("Error , Invalid Command");
			}

		}

	}

	private static void parseAndExecuteAll(String command, Calculator calc) {
		// TODO Auto-generated method stub
		String[] parts=command.split(" ");
		for(String part:parts) {
			parseAndExecute(part,calc);
		}
		
	}

	private static void parseAndExecute(String command, Calculator calc) {
		// TODO Auto-generated method stub
		if ("+".equals(command)) {
			calc.add();
		} else if ("-".equals(command)) {
			calc.subtract();
		} else if ("*".equals(command)) {
			calc.multiply();
		} else if ("/".equals(command)) {
			calc.divide();
		} else {
			int constant = Integer.parseInt(command);
			calc.loadConstant(constant);
		}

	}

}
