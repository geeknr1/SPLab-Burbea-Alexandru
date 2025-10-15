import java.util.ArrayList;

public class Paragraph implements Element{
    private String paragraph;
    ArrayList<Element> paragraphs;

    public Paragraph(String par){
        this.paragraph=par;
        paragraphs = new ArrayList<>();
    }

    public String getParagraph(){
        return this.paragraph;
    }

    public void setParagraph(String newParagraph){
        this.paragraph = newParagraph;
    }

    @Override
    public Element get(int paragraphNumber){
        return paragraphs.get(paragraphNumber);
    }

    @Override
    public void add(Element newParagraphAdded){
        paragraphs.add(newParagraphAdded);
    }

    @Override
    public void remove(Element newParagraphRemoved){
        paragraphs.remove(newParagraphRemoved);
    }

    @Override
    public void print(){
        for(Paragraph p: paragraphs){
            System.out.println(p);
        }
    }
}