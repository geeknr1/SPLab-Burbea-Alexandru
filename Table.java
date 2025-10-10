public class Table extends Element{
    private String title;

    public Table(String t){
        this.title = t;
    }

    public String getTableTitle(){
        return this.title;
    }

    public void setTableTitle(String otherTableTitle){
        this.title = otherTableTitle;
    }

    public void print(){
        System.out.println("Table title: " + this.title);
    }
}