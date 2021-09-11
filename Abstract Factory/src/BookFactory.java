
public class BookFactory {
	
	public Author auth;
	
	public Author getAuth() {
		return auth;
	}

	public void setAuth(Author auth) {
		this.auth = auth;
	}

	public StoryType getStoryType() {
		return storyType;
	}

	public void setStoryType(StoryType storyType) {
		this.storyType = storyType;
	}

	public StoryType storyType ;
	
	 public static ComicAbstractFactory CreateStory(String storyType,String auth)
	    {
		 
		 if(auth.equals("FrankMiller")) {
		return	 FrankMillerBookFactory.CreateStory(storyType);
			 
		 }else if(auth.equals("CHARLESBIRO")) {
			 return CharlesBiroBookFactory.createStory(storyType);
		 }else {
			  System.out.println("story type not matched");
			  return null;
		 }
 
	          
	       
	  
	    }
	

}
