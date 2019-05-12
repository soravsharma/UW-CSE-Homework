
public class Song {
	public static void main(String[] args) {
		verse1();
		verse2();
		verse3();
		verse4();
		verse5();
		verse6();
		verse7();
	}
	
	public static void verse1() {
		System.out.println("There was an old woman who swallowed a fly.");
		lastTwo();
	}
	
	public static void verse2() {
		swallow("spider");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		toCatch("spider", "fly");
		lastTwo();
	}
	
	public static void verse3() {
		swallow("bird");
		System.out.println("How absurd to swallow a bird.");
		toCatch("bird", "spider");
		toCatch("spider", "fly");
		lastTwo();
	}
	
	public static void verse4() {
		swallow("cat");
		System.out.println("Imagine that to swallow a cat.");
		toCatch("cat", "bird");
		toCatch("bird", "spider");
		toCatch("spider", "fly");
		lastTwo();
	}
	
	public static void verse5() {
		swallow("dog");
		System.out.println("What a hog to swallow a dog.");
		toCatch("dog", "cat");
		toCatch("cat", "bird");
		toCatch("bird", "spider");
		toCatch("spider", "fly");
		lastTwo();
	}
	
	public static void verse6() {
		swallow("pig");
		System.out.println("It probably tasted like a ripe fig.");
		toCatch("pig", "dog");
		toCatch("dog", "cat");
		toCatch("cat", "bird");
		toCatch("bird", "spider");
		toCatch("spider", "fly");
		lastTwo();
	}
	
	public static void verse7() {
		swallow("horse");
		System.out.print("She died of course.");
	}
	
	public static void swallow(String animal) {
		System.out.println("There was an old woman who swallowed a " + animal + ",");
	}
	
	public static void toCatch(String animal1, String animal2) {
		System.out.println("She swallowed the "+animal1+" to catch the " + animal2 + ",");
	}
	
	public static void lastTwo () {
		System.out.println("I don't know why she swallowed that fly,");
		System.out.println("Perhaps she'll die.\n");
	}
}
