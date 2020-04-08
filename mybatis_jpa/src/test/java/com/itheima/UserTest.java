package com.itheima;

import com.itheima.domain.User;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserTest {

    @Test
    public void testInsert(){
        User user = new User();
        user.setUsername("韩帆");
        user.setPassword("123");
        user.setGender("男");

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        em.persist(user);
        transaction.commit();

        em.close();
        factory.close();
    }
}
