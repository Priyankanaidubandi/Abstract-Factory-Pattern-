
public class FrankMillerBookFactory {
	
	public static ComicAbstractFactory CreateStory(String stype) {
		

		 
		if(stype.equals("Comic")) {
 	
			return new ComicStory(StoryType.Comic, Author.FRANKMILLER);
			
		} else if(stype.equals("Tragedy")) {
			return new TragedyStory(StoryType.Tragedy, Author.CHARLESBIRO);
		}else {
			System.out.println("Story or  author not matched ");
			return null; 
		}
 
	  
		
	}

}
