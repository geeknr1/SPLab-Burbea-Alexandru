import java.util.ArrayList;

public class Subchapter{
    private String subchapterName;

    public Subchapter(String subchapter){
        this.subchapterName=subchapter;
    }

    public String getSubchapterName(){
        return this.subchapterName;
    }

    public void setSubchapterName(String newSubchapterName){
        this.subchapterName=newSubchapterName;
    }

    public void print(){
        System.out.println("Subchapter name: " + this.subchapterName);
    }
}