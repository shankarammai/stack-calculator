import java.util.*;
public class Calculator {
	private final Stack<Integer> mystack=new Stack<>();
	
	public void loadConstant(int i) {
		// TODO Auto-generated method stub
		this.mystack.push(i);
		
	}

	public void add() {
		// TODO Auto-generated method stub
		int b=mystack.pop();
		int a=mystack.pop();
		mystack.push(a+b);
		
	}

	public void subtract() {
		// TODO Auto-generated method stub
		int b=mystack.pop();
		int a=mystack.pop();
		mystack.push(a-b);
		

	}

	public void multiply() {
		// TODO Auto-generated method stub
		int b=mystack.pop();
		int a=mystack.pop();
		mystack.push(a*b);
		
		
	}

	public void divide() {
		// TODO Auto-generated method stub
		int b=mystack.pop();
		int a=mystack.pop();
		mystack.push(a/b);
		
		
	}

	public void total() {
		// TODO Auto-generated method stub
		int total=0;
		while(!mystack.isEmpty()) {
			total+=mystack.pop();
		}
		mystack.push(total);
		
	}
	public String toString() {
		String result="[";
		String glue="";
		for(int number:mystack) {
			result+=glue;
			result+=number;
			glue=" ";}
		result+="].";
		return result;
			
		}
	}


