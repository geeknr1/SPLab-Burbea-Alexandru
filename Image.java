public class Image extends Element{
    private string imageURL;

    public Image(String url){
        this.imageURL = url;
    }

    public String getImageURL(){
        return this.imageURL;
    }

    public void setImageURL(String newImageURL){
        this.imageURL = newImageURL;
    }

    public void print(){
        System.out.println("Image URL: " + imageURL);
    }
}