package FizzBuzz;

public class FizzBuzz {
	
		public String run(int num) {
			
			if (num == 0)
				return String.valueOf(num);
			else if (num % 3 == 0)
				return "fizz";
			else
				return String.valueOf(num);
				
			
		}

}
