public class Author {

    private String name;

    public Book(String n){
        this.name=n;
    }

    public String getAuthorName(){
        return this.name;
    }

    public void setAuthorName(String newAuthorName){
        this.name = newAuthorName;
    }

    public void print(){
        System.out.println("Book title: " + this.name);
    }
}