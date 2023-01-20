package craft.javaTest;

public class LocalVariable {
	
	public void methodone(){
		int j = 25;//local variable
		System.out.println("Value" + j);
	}
		
	public void methodtwo(){
		int i =30;// local variable
		System.out.println("Value" + i);
		//System.out.println("Value" + j);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariable var = new LocalVariable();
		var.methodone();
		var.methodtwo();

	}

}
