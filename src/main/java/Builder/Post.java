package Builder;




public class Post {

    public static class  ValentinePost {
        public final String from;
        public final String to;
        public final String message;

        ValentinePost(ValentinePostBuilder builder) {
            this.from = builder.from;
            this.to = builder.to;
            this.message = builder.message;
        }

        public static class ValentinePostBuilder {
            public String from;
            public String to;
            public String message;
            public ValentinePostBuilder buildFrom(String from) {
                this.from = from;
                return this;
            }
            public ValentinePostBuilder buildTo(String to) {
                this.to = to;
                return this;
            }
            public ValentinePostBuilder buildMessage(String message) {
                this.message = message;
                return this;
            }

            public ValentinePost build() {
                return new ValentinePost(this);
            }
        }
    }
    public static void  main(String[] args) {
        System.out.println("welcome to builder");
        ValentinePost post = new ValentinePost.ValentinePostBuilder().buildTo("Lana Del Ray").buildFrom("slowguy").buildMessage("hi").build();
        System.out.println(post.from + "::" + post.to + "::" + post.message);

    }
}
