import java.util.*;
public class Calculator {
	Stack<String> mystack=new Stack<String>();
	
	Calculator(){
		
	}

	public void loadConstant(int i) {
		// TODO Auto-generated method stub
		String myvalue=Integer.toString(i);
		mystack.push(myvalue);
		
	}

	public void add() {
		// TODO Auto-generated method stub
		
	}

	public void subtract() {
		// TODO Auto-generated method stub
		
	}

	public void multiply() {
		// TODO Auto-generated method stub
		
	}

	public void divide() {
		// TODO Auto-generated method stub
		
	}

	public void total() {
		// TODO Auto-generated method stub
		
	}
	public String toString() {
	if (mystack.empty()) {
		return  "[].";
	}
	else {
		return "[].";
	}
	}

}
