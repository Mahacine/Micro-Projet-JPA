package Dao;

import java.util.List;

import Entity.Article;
import Util.HibernateUtil;

public class ArticleDaoImpl implements ArticleDao{
	
	private HibernateUtil util = new HibernateUtil();
	
	

	public ArticleDaoImpl() {
		super();
	}

	@Override
	public List<Article> getArticles(String categorie) {
		List<Article> articles = util.getEntityManager().createQuery( "from Article where categorie='"+categorie+"'", Article.class )
                .getResultList();
		return articles;
	}

	@Override
	public Article getArticleById(int codeArticle) {
		Article a = util.getEntityManager().find(Article.class, codeArticle);
		return a;
	}

}
