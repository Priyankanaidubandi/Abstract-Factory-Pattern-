
public class TragedyStory extends ComicAbstractFactory {

	public TragedyStory(StoryType storyType, Author auth) {
		super(storyType.Tragedy, auth);
		createStory();
	}

	@Override
	void createStory() {
		System.out.println("Creating tragedy story");
		
	}
 
	 
}
