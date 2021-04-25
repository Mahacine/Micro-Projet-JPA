package Dao;

import java.util.List;

import Entity.Article;

public interface ArticleDao {

	public List<Article> getArticles(String categorie);
	Article getArticleById(int codeArticle);
	
}
