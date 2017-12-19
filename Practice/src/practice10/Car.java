package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	int run(){
		java.util.Random random= new java.util.Random();

		this.gasoline -=1;
		int num =random.nextInt(15)+1;

		if(this.gasoline <0) {
			return  -1;
		}

		return num;


	}
}

