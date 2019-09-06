package com.lukesmvc.dao;

import com.lukesmvc.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by lyaegel on 09/01/2019
 */
@Repository
@Transactional
public class ProductDAOImpl implements ProductDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Product> getProducts() {
        String hql = "FROM Product";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);

        @SuppressWarnings("unchecked")
        List<Product> products = query.getResultList();

        return products;
    }

    @Override
    public void addProduct(Product product) {
        sessionFactory.getCurrentSession().save(product);
    }

    //After bootstraping the data, the URL "/products/update/boat/Kayak" will return 2 as the number of rows updated.
    @Override
    public int getCount(String name1, String name2){
        String hql = "UPDATE Product SET name = :name1 WHERE name = :name2";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("name1", name1);
        query.setParameter("name2", name2);

        return query.executeUpdate();
    }

    @Override
    public List innerJoinExample(){
        String hql = "select p1 from Product p1 inner join Product p2 on p1.name = p2.name where p1.id <> p2.id";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);

        return query.getResultList();
    }
}
