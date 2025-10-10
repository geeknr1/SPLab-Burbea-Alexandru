import java.util.ArrayList;

public class Element{
    
    private Paragraph paragraph;
    private Image img;
    private Table table;
    public Element(Paragraph para, Image image, Table tab){
        this.paragraph = para;
        this.img = image;
        this.table = tab;
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

    
    public void print(){
        System.out.println("\n");
    }
}