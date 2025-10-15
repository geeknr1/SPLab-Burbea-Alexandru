import java.util.ArrayList;

public class Image implements Element{
    private string imageURL;
    ArrayList<Element> ImageURLs;

    public Image(String url){
        this.imageURL = url;
    }

    public String getImageURL(){
        return this.imageURL;
    }

    public void setImageURL(String newImageURL){
        this.imageURL = newImageURL;
    }


    @Override
    public Element get(int urlNumber){
        return imageUrls.get(urlNumber);
    }

    @Override
    public void add(Element newURLAdded){
        imageURLs.add(newURLAdded);
    }

    @Override
    public void remove(Element newURLRemoved){
        imageURLs.remove(newURLRemoved);
    }

    @Override
    public void print(){
        for(Element url: imageURLs){
            System.out.println(url);
        }
    }
}