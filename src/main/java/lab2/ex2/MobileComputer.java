package lab2.ex2;

public class MobileComputer extends Computer implements Chargeable{

private int battery;
public MobileComputer() {
	String secret= " MobileComputer secret";
	battery=5;
}

public void work() {
	if(battery >0) {
		System.out.println("It is working in my laptop");
		battery--;
	}else
		System.out.println("Running out of battery");
	
}
public void charge() {
	if (battery<10)
		battery++;
}
}
