package org.rpinaa.gof.creational.factory;

import org.junit.Assert;
import org.junit.Test;
import org.rpinaa.gof.creational.factory.domain.BlogPost;
import org.rpinaa.gof.creational.factory.domain.NewPost;
import org.rpinaa.gof.creational.factory.domain.ProductPost;

import static org.rpinaa.gof.creational.factory.PostFactory.PostType.*;

public class PostFactoryTest {

    @Test
    public void buildPost_whenPassNEWEnumValueInsideIn_shouldReturnACompleteNewPost() {

        final NewPost newPost = (NewPost) PostFactory.buildPost(NEW);

        Assert.assertNotNull(newPost);
        Assert.assertNotNull(newPost.getId());
        Assert.assertNotNull(newPost.getContent());
        Assert.assertNotNull(newPost.getHeadline());
        Assert.assertNotNull(newPost.getNewsTime());
        Assert.assertNull(newPost.getPublishedOn());
        Assert.assertNotNull(newPost.getCreatedOn());
    }

    @Test
    public void buildPost_whenPassBLOGEnumValueInsideIn_shouldReturnACompleteBlogPost() {

        final BlogPost blogPost = (BlogPost) PostFactory.buildPost(BLOG);

        Assert.assertNotNull(blogPost);
        Assert.assertNotNull(blogPost.getId());
        Assert.assertNotNull(blogPost.getContent());
        Assert.assertNotNull(blogPost.getAuthor());
        Assert.assertNotNull(blogPost.getTags());
        Assert.assertEquals(blogPost.getTags().length, 4);
        Assert.assertNull(blogPost.getPublishedOn());
        Assert.assertNotNull(blogPost.getCreatedOn());
    }

    @Test
    public void buildPost_whenPassPRODUCTEnumValueInsideIn_shouldReturnACompleteProductPost() {

        final ProductPost productPost = (ProductPost) PostFactory.buildPost(PRODUCT);

        Assert.assertNotNull(productPost);
        Assert.assertNotNull(productPost.getId());
        Assert.assertNotNull(productPost.getContent());
        Assert.assertNotNull(productPost.getImageURL());
        Assert.assertNotNull(productPost.getName());
        Assert.assertNull(productPost.getPublishedOn());
        Assert.assertNotNull(productPost.getCreatedOn());
    }

    @Test(expected = RuntimeException.class)
    public void buildPost_whenPassOtherNotEnumValueInsideIn_shouldReturnARunTimeException() {

        PostFactory.buildPost(null);
    }
}
