package kr.or.ddit;

public class PrintJVMOptionAndArgument{
	public static void main(String[] args) throws Exception{
		System.out.printf("message : %s\n", args[0]);
		String username = System.getProperty("username");
		System.out.printf("username : %s\n", username);
		String password = System.getProperty("password");
		System.out.printf("password : %s\n", password);
		
		for(int i=1; i<=20; i++){
			Thread.sleep(1000);
			System.out.println(i);
			
		}
	}
}