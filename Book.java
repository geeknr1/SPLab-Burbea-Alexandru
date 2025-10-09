import java.util.ArrayList;

public class Book {

    private String title;
    private ArrayList<Chapter> chapters;

    public Book(String t){
        this.title=t;
        this.chapters=new ArrayList<>();
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String newTitle){
        this.title = newTitle;
    }

    public void addChapter(String newChapterNameAdded){
        Chapter newChapterAdded = new Chapter(newChapterNameAdded);
        chapters.add(newChapterAdded);
    }

    public void print(){
        System.out.println("Book title: " + this.title);
        for(Chapter chapter: chapters){
            chapter.print();
        }
    }
}