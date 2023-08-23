public class Main{
	public static void main(String...strings) {
		System.out.println("Started Main Thread");

		Runnable target = () -> {
			for(int i=0; i<10; i++)
				System.out.println("Child Thread Running");
		};
		
		Thread thread = new Thread(target);
		thread.start();
		
		for(int i=0; i<10; i++)
			System.out.println("Main Thread");
		
		System.out.println("Ending Main Thread");
	}
}