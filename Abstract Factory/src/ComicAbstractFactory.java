
public abstract class ComicAbstractFactory {
	
	public Author author = null;
	
	public StoryType storyType = null;
	
	abstract void createStory();
	
	
	public ComicAbstractFactory(StoryType storyType, Author author){
	    this.author = author;
	    this.storyType = storyType;
	  }

	 
	
	 public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}


	public StoryType getStoryType() {
		return storyType;
	}


	public void setStoryType(StoryType storyType) {
		this.storyType = storyType;
	}


	@Override
	  public String toString() {
	    return "The story type- "+storyType + " created by "+author;
	  }
	
	

}
