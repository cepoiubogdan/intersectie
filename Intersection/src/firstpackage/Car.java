package firstpackage;

import java.util.Random;

public class Car {

	public void moveCar() {

		String movement=null;
		Random r=new Random();
		int idDirection=r.nextInt(3);
		switch (idDirection)
		{
		case 0:
			movement="Left";
			break;
		case 1:
			movement="Front";
			break;
		case 2:
			movement="Right";
			break;
		}
		System.out.println("The car moved "+movement);
		
	}

}
