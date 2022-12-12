package main;

import java.util.ArrayList;

import models.Art;
import models.Painting;
import models.Sculpture;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Painting work1 = new Painting(
				"Number1", "Da Vincci", 
				"the first one","Oil");
//		System.out.println(work1.paintType + work1.author +
//				work1.description + work1.title);
		System.out.println(String.format("This work of art by Author: %s\n is called Title: %s\n Description: %s\n using paintType: %s\n", work1.author, work1.title, work1.description, work1.paintType));
		
		Painting work2 = new Painting(
				 "Number 2","Van Goh", 
				"the second one","Chalk");
//		System.out.println(work2.paintType + work2.author +
//				work2.description + work2.title);
		System.out.println(String.format("This work of art by Author: %s\n is called Title: %s\n Description: %s\n using paintType: %s\n", work2.author, work2.title, work2.description, work2.paintType));

		
		Painting work3 = new Painting(
				 "Number 3", "Leonardo",
				"the third one","Paint");
//		System.out.println(work3.paintType + work3.author +
//				work3.description + work3.title);
		System.out.println(String.format("This work of art by Author: %s\n is called Title: %s\n Description: %s\n using paintType: %s\n", work3.author, work3.title, work3.description, work3.paintType));

		
		Sculpture build1 = new Sculpture("Dave","first",
				"this one came first","marble");
//		System.out.println(build1.material + build1.author +
//				build1.description + build1.title);
		System.out.println(String.format("This work of art by Author: %s\n is called Title: %s\n Description: %s\n using paintType: %s\n", build1.author, build1.title, build1.description, build1.material));

		
		Sculpture build2 = new Sculpture("Jose","second",
						"this one came second","granite");
//		System.out.println(build2.material + build2.author +
//				build2.description + build2.title);
		System.out.println(String.format("This work of art by Author: %s\n is called Title: %s\n Description: %s\n using material: %s\n", build2.author, build2.title, build2.description, build2.material));
		ArrayList<Art> museum = new ArrayList<Art>();
		museum.add(work1);
		museum.add(work2);
		museum.add(work3);
		museum.add(build1);
		museum.add(build2);
		for (int piece =0;piece<museum.size();piece++) {
			System.out.println(museum.get(piece).title);
			System.out.println(museum.get(piece).author);
			System.out.println(museum.get(piece).description);
		}
		
		
		
	}

}
