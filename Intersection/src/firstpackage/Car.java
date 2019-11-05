package firstpackage;

import java.util.Random;

public class Car {
	
private String idNumber;
public String model;
public String idColor;

public String getidNumber(){
	return idNumber;
}

public void moveCar() {
	String movement="";
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
