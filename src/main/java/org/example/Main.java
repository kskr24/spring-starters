package org.example;

import config.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Carlo Ancelotti");
        comment.setText("We'll be in the final in Munich.");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}