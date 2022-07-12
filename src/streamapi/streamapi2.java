package streamapi;

	import java.util.*;

	public class streamapi2 {
	    public static void main(String[] args) {
	        List<Fruit> Fruit_list = new LinkedList<>();
	        Fruit_list.add(new Fruit("Apple", 17, 234, "red"));
	        Fruit_list.add(new Fruit("Banana", 15, 230, "yellow"));
	        Fruit_list.add(new Fruit("mango", 150, 254, "Yellow"));
	        Fruit_list.add(new Fruit("orange", 120, 158, "orange"));
	        //2. Sorting fruits according to their color
	        System.out.println("Sorting fruits according to their color");
	        Fruit_list.stream().sorted(Comparator.comparing(Fruit::getColor)).map(Fruit::getName).forEach(System.out::println);
	       
}
}