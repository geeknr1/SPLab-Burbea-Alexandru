import java.util.ArrayList;

public class Element{
    
    private Paragraph paragraph;
    private Image img;
    private Table table;
    private ArrayList<Section> sections;

    public Element(Paragraph para, Image image, Table tab){
        this.paragraph = para;
        this.img = image;
        this.table = tab;
        this.sections = new ArrayList<>();
    }

    public Paragraph getParagraph(){
        return this.paragraph;
    }

    public Image getImage(){
        return this.img;
    }

    public Table getTable(){
        return this.table;
    }

    public void setParagraph(Paragraph otherParagraph){
        this.paragraph = otherParagraph;
    }

    public void setImage(Image otherImage){
        this.img = otherImage;
    }

    public void setTable(Table otherTable){
        this.table = otherTable;
    }

    public void addSection(String sectionName){
        Section section = new Section(sectionName);
        sections.add(section);
    }

    public void addParagraph(String text){
        Paragraph paragraph = new Paragraph(text);
        par
    }


    public void print(){
        for(Section s: sections){
            s.print();
            paragraph.print();
            img.print();
            table.print();
            System.out.print
        }
        System.out.println("\n");
    }
}