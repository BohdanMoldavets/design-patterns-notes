package org.moldavets.model;

public class Post {
    private String title;
    private String content;
    private String category;

    Post(Builder builder){
        this.title = builder.title;
        this.content = builder.content;
        this.category =  builder.category;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public static class Builder {
        private String title;
        private String content;
        private String category;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder category(String category) {
            this.category = category;
            return this;
        }

        public Post build(){
            return new Post(this);
        }
    }
}
