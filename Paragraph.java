import java.util.ArrayList;

public class textParagraph implements Element{
    private String textParagraph;
    ArrayList<Element> textParagraphs;

    public textParagraph(String par){
        this.textParagraph=par;
        textParagraphs = new ArrayList<>();
    }

    public String gettextParagraph(){
        return this.textParagraph;
    }

    public void settextParagraph(String newtextParagraph){
        this.textParagraph = newtextParagraph;
    }

    @Override
    public Element get(int textParagraphNumber){
        return textParagraphs.get(textParagraphNumber);
    }

    @Override
    public void add(Element newtextParagraphAdded){
        textParagraphs.add(newtextParagraphAdded);
    }

    @Override
    public void remove(Element newtextParagraphRemoved){
        textParagraphs.remove(newtextParagraphRemoved);
    }

    @Override
    public void print(){
        System.out.println(textParagraph);
        // for(textParagraph p: textParagraphs){
        //     System.out.println(p);
        // }
    }
}