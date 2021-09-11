
public class CharlesBiroBookFactory {
	
	public static ComicAbstractFactory createStory(String type) {
		
 
		if(type.equals("Comic")) {
 	
			return new ComicStory(StoryType.Comic, Author.FRANKMILLER);
			
		}   else if(type.equals("Tragedy")) {
			return new TragedyStory(StoryType.Tragedy, Author.CHARLESBIRO);
		}else {
			System.out.println("selected author and story not matched");
			return null; 
		}
 
	  
		
	}

}
