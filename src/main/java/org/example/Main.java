package org.example;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);
        var comment = new Comment();

        comment.setAuthor("Carlo Ancelotti");
        comment.setText("We'll be in the final in Munich.");

        commentService.publishComment(comment);
    }
}