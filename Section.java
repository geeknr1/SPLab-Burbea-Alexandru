import java.util.ArrayList;

public class Section implements Element{
    private String sectionName;
    private ArrayList<Element> elements;

    public Chapter(String section){
        this.sectionName=section;
        elements=new ArrayList<>();
    }

    public String getSectionName(){
        return this.sectionName;
    }

    public void setChapterName(String newSectionName){
        this.sectionName=newSectionName;
    }

     @Override
    public Element get(int sectionNumber){
        return elements.get(sectionNumber);
    }

    @Override
    public void add(Element newSectionAdded){
        elements.add(newSectionAdded);
    }

    @Override
    public void remove(Element newSectionsRemoved){
        elements.remove(newSectionsRemoved);
    }

    @Override
    public void print(){
        System.out.println(sectionName);
        for(Element e: elements){
            System.out.println(e);
        }
    }
}