
public class ComicFactory {
	
 
	public static ComicAbstractFactory createComicStory(StoryType storyTpe)
	  {
		 
		if(storyTpe.equals(StoryType.Comic)) {
 	
			return new ComicStory(StoryType.Comic, Author.FRANKMILLER);
			
		} else if(storyTpe.equals(StoryType.Tragedy)) {
			return new TragedyStory(StoryType.Tragedy, Author.CHARLESBIRO);
		} else {
			System.out.println("The given story type not matched ");
			return null; 
		}
 
	  }

	 
	}
	 
