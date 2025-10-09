import java.util.ArrayList;

public class Chapter{
    private String chapterName;
    ArrayList<Subchapter> subchapters;

    public Chapter(String chapter){
        this.chapterName=chapter;
        this.subchapters=new ArrayList<>();
    }

    public String getChapterName(){
        return this.chapterName;
    }

    public void setChapterName(String newChapterName){
        this.chapterName=newChapterName;
    }

    public void addSubchapter(String newSubchapterName){
        Subchapter subchapter = new Subchapter(newSubchapterName);
        subchapters.add(subchapter);
    }

    public void print(){
        System.out.println("Chapter name: "  + this.chapterName);
        for(Subchapter subchapter: subchapters){
            subchapter.print();
        }
    }
}