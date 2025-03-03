


public class UserDefinedException {
	static void validation(int m1,int m2,int m3,int m4,int m5) throws MinimumCriteria {
		float per=(m1+m2+m3+m4+m5)/5;
		if(per<40) {
			throw new MinimumCriteria("Not allowed to the exam hall...!");
		}
		else {
			System.out.println("U can attend the exam..!");
		}
	}
	
	public static void main(String srga[]) {
		try {
			validation(7,4,5,8,9);
		}
		catch(MinimumCriteria min) {
			System.out.println("Caught the exception "+min.getMessage());
		}
	}

}
