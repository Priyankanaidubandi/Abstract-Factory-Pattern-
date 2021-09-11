
public class ComicStory extends ComicAbstractFactory {

	public ComicStory(StoryType storyType, Author author) {
		super(storyType.Comic, author.FRANKMILLER);
		createStory();
	}

 @Override
void createStory() {
	 
	 System.out.println("Creating comic story");
}
	 

}
