
public class CalcMain {
	
	public static void main(String[] args){
		
		InOut.writeText("2 2 + 4 * 3 +", InOut.filename);
		
		Stack<Integer> stack = new StackVector<Integer>();
		
		String parts[] = InOut.readText(InOut.filename).split(" ");
		
		for(String part: parts){
			boolean checks = true;
			try{
				Integer.parseInt(part);
			}catch(NumberFormatException e){
				checks = false;
			}
			
			if(checks){
				stack.push(Integer.parseInt(part));
			}else{
				if(part.equals("+")){
					stack.push(Calculator.sum(stack.pop(), stack.pop()));
				}else if(part.equals("-")){
					stack.push(Calculator.minus(stack.pop(), stack.pop()));
				}else if(part.equals("*")){
					stack.push(Calculator.mult(stack.pop(), stack.pop()));
				}else if(part.equals("/")){
					stack.push(Calculator.div(stack.pop(), stack.pop()));
				}
			}
		}
		
		InOut.writeText(String.valueOf(stack.peek()), InOut.filename);
		System.out.println("Result: "+stack.pop());
	}
}
