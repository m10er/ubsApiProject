package utilities;

public enum Resources {
    jobsSearchPage("/TgNewUI/Search/Ajax/MatchedJobs");

    public final String path;

    Resources(String path) {
        this.path = path;
    }


}
