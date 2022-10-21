package textFile.fileCSV;

import java.util.ArrayList;

public class CSV {
    private String id;
    private  String code;
    private String name;

    public CSV(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public CSV(String s) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "ID: "+getId()+", Code: "+getCode()+", Name: "+getName();
    }

}
