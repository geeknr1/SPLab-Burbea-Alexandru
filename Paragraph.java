public class Paragraph extends Element{
    private String paragraph;

    public Paragraph(String par){
        this.paragraph=par;
    }

    public String getParagraph(){
        return this.paragraph;
    }

    public void setParagraph(String newParagraph){
        this.paragraph = newParagraph;
    }

    public void print(){
        System.out.println(paragraph);
    }
}