public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Thread t = new Thread(() -> {
        System.out.println("say good");
});
	
		t.start();
		System.out.println("good morning");
	}
}
