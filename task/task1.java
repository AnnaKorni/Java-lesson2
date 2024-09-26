package v2.Seminar2.homework2.task1.task;

public class task1 {
    public static void main(String[] args) {
        String baseURL = "";
        String params = "";

        if (args.length == 0) {
            baseURL = "https://example.com/search?";
            params = "query=java&sort=desc&filter=null";
        } else {
            baseURL = args[0];
            params = args[1];
        }
        URLBuilder ans = new URLBuilder();
        System.out.println(ans.buildURL(baseURL, params));


    }

}
