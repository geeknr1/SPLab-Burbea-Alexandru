public class AlignRight implements AlignStrategy{
    public void render(Paragraph paragraph, Context context){
        System.out.println(paragraph.getTextParagraph() + " >>");
    }
}