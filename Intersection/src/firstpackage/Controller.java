package firstpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {

	private List<Car> lane1=new ArrayList<Car>();
	private List<Car> lane2=new ArrayList<Car>();
	private List<Car> lane3=new ArrayList<Car>();
	private List<Car> lane4=new ArrayList<Car>();
	private int semaphoreId;
	private List<Semaphore> semaphores;
	
	Controller(List<Semaphore> semaphore){
		this.semaphores=semaphore;
		semaphoreId=0;
		for(int i=0;i<10;i++) {
			Car c=new Car();
			lane1.add(c);
			lane2.add(c);
			lane3.add(c);
			lane4.add(c);
			
		}
	}
	
	public void addCars() {
		
		Random r=new Random();
		int wichLane=r.nextInt(4);
		int addedCars=r.nextInt(4)+1;
		switch (wichLane)
		{
			case 0:
				for(int i=0;i<addedCars;i++) {
					Car c=new Car();
					lane1.add(c);
				}
				System.out.println(addedCars+" Added cars to the lane 1");
				break;
			case 1:
				for(int i=0;i<addedCars;i++) {
					Car c=new Car();
					lane2.add(c);
				}
				System.out.println(addedCars+" Added cars to the lane 2");
				break;
			case 2:
				for(int i=0;i<addedCars;i++) {
					Car c=new Car();
					lane3.add(c);
				}
				System.out.println(addedCars+" Added cars to the lane 3");
				break;
			case 3:
				
				for(int i=0;i<addedCars;i++) {
					Car c=new Car();
					lane4.add(c);
				}
				System.out.println(addedCars+" Added cars to the lane 4");
				break;	
		}
		
	}
	
	public void start() {
		
		while (true) {
			semaphores.get(semaphoreId).setColor(" Green");
			switch (semaphoreId) {
			case 0:
				int currentTimer=0;
				while(currentTimer<semaphores.get(semaphoreId).getTimer()) {
					try {
						Thread.sleep(1000);
						currentTimer++;
						if(currentTimer%5==0) {
							addCars();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(lane1.size()>0) {
						
					
					lane1.get(0).moveCar();
					lane1.remove(0);
					
					}
				}
				semaphores.get(semaphoreId).setColor(" Red");
				semaphoreId=1;
				
				break;
				
			case 1:
				int currentTimer2=0;
				while(currentTimer2<semaphores.get(semaphoreId).getTimer()) {
					try {
						Thread.sleep(1000);
						currentTimer2++;
						if(currentTimer2%5==0) {
							addCars();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(lane2.size()>0) {
						
					
					lane2.get(0).moveCar();
					lane2.remove(0);
					
					}
				}
				semaphores.get(semaphoreId).setColor(" Red");
				semaphoreId=2;
				break;	
				
			case 2:
				int currentTimer3=0;
				while(currentTimer3<semaphores.get(semaphoreId).getTimer()) {
					try {
						Thread.sleep(1000);
						currentTimer3++;
						if(currentTimer3%5==0) {
							addCars();
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(lane3.size()>0) {
						
					
					lane3.get(0).moveCar();
					lane3.remove(0);
					
					}
				}
				semaphores.get(semaphoreId).setColor(" Red");
				semaphoreId=3;
				break;
				
			case 3:
				int currentTimer4=0;
				while(currentTimer4<semaphores.get(semaphoreId).getTimer()) {
					try {
						Thread.sleep(1000);
						currentTimer4++;
						if(currentTimer4%5==0) {
							addCars();
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					if(lane4.size()>0) {
						
					
					lane4.get(0).moveCar();
					lane4.remove(0);
					
					}
				}
				semaphores.get(semaphoreId).setColor(" Red");
				semaphoreId=0;
				break;			
			}
		}
	}
	
}
