package com.example.dao;

import com.example.entity.UserInfoEntity;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

public class UserInfoDAOImpl implements UserInfoDAO {
    private SessionFactory sessionFactory;

    //constructor di
    public UserInfoDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public String saveUserInfo(UserInfoEntity userInfoEntity) {
        String response = "";
        Session session = sessionFactory.getCurrentSession();//if error, use openSession()

        try {
            session.persist(userInfoEntity);

            response = "data saved successfully";

        } catch (Exception e) {
            e.printStackTrace();
            response = "data not saved";

        }
        return response;
    }

    public List<UserInfoEntity> getAllUserInfo() {
        Session session = sessionFactory.openSession();
        String hqlGetQuery = "from UserInfoEntity";
        List<UserInfoEntity> userInfoEntityList = new ArrayList<>();
        try {
            Query query = session.createQuery(hqlGetQuery);
            userInfoEntityList = query.list();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return userInfoEntityList;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public UserInfoEntity findById(Integer id) {


        return null;
    }

    public void saveUserRole(String userId, String role) {
        Session session = sessionFactory.getCurrentSession();
        try {
            //save role into db
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
