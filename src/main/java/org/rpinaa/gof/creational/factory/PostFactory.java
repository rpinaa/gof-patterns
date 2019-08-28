package org.rpinaa.gof.creational.factory;

import org.rpinaa.gof.creational.factory.domain.AbstractPost;
import org.rpinaa.gof.creational.factory.domain.BlogPost;
import org.rpinaa.gof.creational.factory.domain.NewPost;
import org.rpinaa.gof.creational.factory.domain.ProductPost;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PostFactory {

    private PostFactory() {}

    public static AbstractPost buildPost(final PostType postType) {

        switch (postType) {

            case NEW:
                return new NewPost()
                        .setHeadline("This is just a test")
                        .setNewsTime(LocalDate.now())
                        .setId("123456")
                        .setContent("This is just a test")
                        .setCreatedOn(LocalDateTime.now())
                        .setPublishedOn(null)
                        .setTitle("This is just a test");
            case BLOG:
                return new BlogPost()
                        .setAuthor("Ricardo Pina Arellano")
                        .setTags(new String[]{"test", "factory", "pattern", "gof"})
                        .setId("123456")
                        .setContent("This is just a test")
                        .setCreatedOn(LocalDateTime.now())
                        .setPublishedOn(null)
                        .setTitle("This is just a test");
            case PRODUCT:
                return new ProductPost()
                        .setImageURL("https://www.google.com")
                        .setName("Google")
                        .setId("123456")
                        .setContent("This is just a test")
                        .setCreatedOn(LocalDateTime.now())
                        .setPublishedOn(null)
                        .setTitle("This is just a test");
                default:
                    throw new RuntimeException("Unknown Post type");
        }
    }

    public static enum PostType {
        NEW, BLOG, PRODUCT
    }
}
