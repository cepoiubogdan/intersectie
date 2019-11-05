package firstpackage;

public class Semaphore {

	private int idSemaphore;
	private String color;
	private int timer;

	public String getColor() {
		
		return color;
		
	}

	public void setColor(String color) {

		this.color=color;
		System.out.println("The color of the semaphore "+idSemaphore+" has been set to "+color);
		
	}

	public void setIdSemaphore(int id) {

		this.idSemaphore=id;

	}

	public int getIdSemaphore() {
		
		return idSemaphore;

	}

	public void setTimer(int seconds) {
		
		this.timer = seconds;
		System.out.println("Timer has been set to " + seconds);
		
	}

	public int getTimer() {
		
		return timer;
		
	}

}
