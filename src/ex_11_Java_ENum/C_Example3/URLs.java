package ex_11_Java_ENum.C_Example3;

public enum URLs {
    Google("www.google.com"),
    Yahoo("www.yahoo.com"),
    Gmail("www.gmail.com"),
    Youtube("www.youtube.com");

    private String url;

    URLs(String url_c){
        this.url = url_c;
    }

    String getUrl(){
        return this.url;
    }

}
