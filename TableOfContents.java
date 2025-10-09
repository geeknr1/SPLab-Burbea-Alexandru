import java.util.ArrayList;

public class TableOfContents extends Element{

    private ArrayList<Chapter> chapters;
    private ArrayList<Subchapter> subchapters;

    public TableOfContents(){}

    public void print(){
        for(Chapter c: chapters){
            c.print();
            for(Subchapter s: subchapters){
                s.print();
            }
        }
    }
    
}