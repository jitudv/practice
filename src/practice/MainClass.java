package practice;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String args[]) {

        System.out.println("The stream after applying "
                           + "the function is : ");
  
        // Creating a list of Integers
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
  
        list.stream().map(number -> number * 3).forEach(System.out::println);
		
	}

}
