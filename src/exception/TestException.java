package exception;

public class TestException {

	public static void main(String[] args) {
		int num = 10;
		try{
			int result = num/0;
			System.out.println(result);
		}catch(Exception ex){
			System.out.println("You can not devide by zero.");
			System.out.println(ex);
		}

	}

}
