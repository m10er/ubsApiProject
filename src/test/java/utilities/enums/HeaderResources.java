package utilities.enums;

public enum HeaderResources {
    accept("Accept", " */*"),
    connection("Connection","keep-alive");


    public final String header;
    public final String headerValue;

    HeaderResources(String header, String headerValue) {
        this.header = header;
        this.headerValue = headerValue;
    }

    public String getPath(){
        return header;
    }



}
