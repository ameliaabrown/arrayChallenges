package arrayChallenges;

public class arrayChallenges {

	public static void main(String[] args) {
			//challengeOne();
			challengeTwo();
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
				
					System.out.println(highschoolAges.length - 1);
					
				
			}
	}