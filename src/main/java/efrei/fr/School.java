package efrei.fr;

public class School {

    private String websiteUrl;

    public School() {}
    public School(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Override
    public String toString() {
        return "School{" +
                "websiteUrl='" + websiteUrl + '\'' +
                '}';
    }
}
