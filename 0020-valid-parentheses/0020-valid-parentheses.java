

// ==================== CHAR STACK CLASS ========================
// It uses the main methods of the stack push , pop , peek
class CharStack {
	private char[] arr;
	private int top;

	public CharStack(int capacity){
		arr = new char[capacity];
		top = -1;
	}

	// isEmpty() method: It would check whether the stack is empty or not
	public boolean isEmpty(){
		return top == -1;
	}

	// push() method: it enters the chars (brackets)
	public void push(char data){
		// Increment of the top fisrtly
		top++;
		arr[top] = data;
		//System.out.println(data + " pushed into stack.");
 
	}

	// pop() method: It would remove the topmost data of the stack
	public char pop(){
		// Check if it is empty
		if(isEmpty()){
			return '\0';
		}

		char data = arr[top];
		top--;
		
		return data;
	}

	// peek() method: It would provide the topmost data of the stack without removing it
	public char peek(){
		// check whether the stack is empty
		if(isEmpty()){
			return '\0';
		}

		return arr[top];
	}


} 

// =================== Balanced Parenthesis using Stack class =========================
// It would contain the method of isBalanced() parenthese  and the main method

public class Solution {
	// making the static method so we donot have to create the objects
	// isBalanced() method: it would check the parenthesis are balanced or not
	
	public  boolean isValid(String exp){
		CharStack stack = new CharStack(exp.length());

		// firstly pushing all the characters of the string to stack using push method
		for(int i = 0; i < exp.length(); i++){
			// now to check the each brackets we need to store that character
			char ch = exp.charAt(i);
			
			// Opening Brackets are pushed first
			if(ch == '(' || ch == '{' || ch == '['){
				stack.push(ch);		
	
			} else if(ch == ')' || ch == '}' || ch == ']'){
				// No opening brackets available
				if(stack.isEmpty()){
					return false;
				}
				char top = stack.pop();

				// Now check matching 
				if(ch == ')' && top != '(') return false;
				if(ch == '}' && top != '{') return false;
				if(ch == ']' && top != '[') return false;
			}
		}
		
		return stack.isEmpty();
		
	}
}