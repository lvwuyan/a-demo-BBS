public class Post {
    private int postid;
    private String name;
    private String theme;
    private String content;
    private boolean up;//置顶
    private boolean accurate;//加精

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isUp() {
        return up;
    }

    public void setUp(boolean up) {
        this.up = up;
    }

    public boolean isAccurate() {
        return accurate;
    }

    public void setAccurate(boolean accurate) {
        this.accurate = accurate;
    }
}
