package Service;

import java.util.List;

import Entity.Article;

public interface ArticleService {
	
	public List<Article> getArticles(String categorie);
	Article getArticleById(int codeArticle);

}
