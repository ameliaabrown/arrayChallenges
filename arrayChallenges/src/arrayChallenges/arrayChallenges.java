package arrayChallenges;

public class arrayChallenges {

	public static void main(String[] args) {
			challengeOne();
			challengeTwo();
			challengeThree();
			challengeFour();
			}

			public static void  challengeOne(){

				String [] namesInFamily = new String [5];
				namesInFamily[0] = "Rob";
				namesInFamily[1] = "Kelli";
				namesInFamily[2] = "Isabel";
				namesInFamily[3] = "Gaby";
				namesInFamily[4] = "Amelia";
				System.out.println(namesInFamily[3]);
			}
			
			public static void challengeTwo(){
				int [] highschoolAges = new int [4];
				highschoolAges [0] = 15;
				highschoolAges[1] = 16;
				highschoolAges[2] = 17;
				highschoolAges[3] = 18;
				
					System.out.println(highschoolAges[highschoolAges.length - 1]);
					
				
			}
			public static void challengeThree(){
				int [] numbers = {1, 4, 5, 2, 6};
				for (int i = 0; i < numbers.length; i++)
				{
					System.out.println(numbers[i]);
				}
				
			}

			public static void challengeFour(){
			
				
				int [] numbers = {1, 4, 5, 3, 6};
				double sum = 0;
				
				for (int i = 0; i < numbers.length; i++)
				{
					sum = sum + numbers[i];
			
				}
				sum = sum / numbers.length;
				System.out.println(sum);
			}
}