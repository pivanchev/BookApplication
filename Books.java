/*
Plamen Ivanchev , B00793955
*/


package coursework;

public abstract class Books {
    
    protected String title;
    protected String author;
    protected String date;
    

    public abstract String getTitle(); 
  

    public abstract String getAuthor();
    

    public abstract String getDate();
   
    

    @Override
    public abstract String toString();
    
}
