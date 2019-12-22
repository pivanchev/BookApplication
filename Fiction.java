/*
Plamen Ivanchev , B00793955
*/


package coursework;


public class Fiction extends Books {
    
    public Fiction(String title, String author, String date) {
        this.title = title;
        this.author = author;
        this.date = date;
 
    }

    @Override
    public String getTitle() {
        return this.title;
    } 

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public String getDate() {
        return this.date;
    }

    @Override
    public String toString() {
        return ("\nTitle=" + this.title + "  " + "\nAuthor=" + this.author + "  " + "\nYear of publishing=" + this.date + "\n");
    }
}