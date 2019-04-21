import java.util.Arrays;


public class Main {

	public static void main(String[] args) {

	String arr[] = new String[10];

	arr[0] = "apple";

    Arrays.fill(arr,"mikan");


	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
}

