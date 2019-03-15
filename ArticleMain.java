package com1.fladykhw.jdbc.raw;

import java.util.List;
import com1.fladykhw.jdbc.template.*;

public class ArticleMain {
    ArticleDao articleDao = new ArticleDaoImplUsingTemplate();

    /*유징 템플릿츠로 바꾸고 실행*/
    /**
     * main 메서드
     */
    public static void main(String[] args) {
        new ArticleMain().listArticles();
    }

    public void listArticles() {
        List<Article> articles = articleDao.listArticles();
        System.out.println(articles);
    }

    public void getArticle() {
        Article article = articleDao.getArticle("3");
        System.out.println(article);
    }

    public void addArticle() {
        Article article = new Article();
        article.setTitle("This is title.");
        article.setContent("This is content");
        article.setUserId("1");
        article.setName("김형우");
        articleDao.addArticle(article);
    }

    public void updateArticle() {
        Article article = new Article();
        article.setArticleId("7");
        article.setTitle("This is modified title.");
        article.setContent("This is modified content");
        articleDao.updateArticle(article);
    }

    public void deleteArticle() {
        articleDao.deleteArticle("8");
    }
}