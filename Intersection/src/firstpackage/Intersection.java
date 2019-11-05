package firstpackage;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
	
	private List<Semaphore> semaphores=new ArrayList<Semaphore>();
	private Controller controller;
	
	public void setSemaphores()  {

		for(int i=0;i<4;i++) {
			if(i<3) {
				Semaphore s=new Semaphore();

				s.setIdSemaphore(i);
				s.setColor("Red");
				s.setTimer(30);
				semaphores.add(s);
			}
			else {
				Semaphore s=new Semaphore();

				s.setIdSemaphore(i);
				s.setColor("Red");
				s.setTimer(40);
				semaphores.add(s);
			}
		}
	}
	
	public void start() {
		controller=new Controller(semaphores);
		controller.start();
	}

}
