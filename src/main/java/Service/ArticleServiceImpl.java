package Service;

import java.util.List;

import Dao.ArticleDaoImpl;
import Entity.Article;

public class ArticleServiceImpl implements ArticleService{
	
	ArticleDaoImpl articleDao =new ArticleDaoImpl();

	@Override
	public List<Article> getArticles(String categorie) {
		return articleDao.getArticles(categorie);
	}

	@Override
	public Article getArticleById(int codeArticle) {
		return articleDao.getArticleById(codeArticle);
	}

}
