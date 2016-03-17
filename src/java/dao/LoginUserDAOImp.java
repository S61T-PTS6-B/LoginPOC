/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import model.LoginUser;

/**
 *
 * @author Max
 */
@Stateless
public class LoginUserDAOImp implements ILoginUserDAO {

    @PersistenceContext(unitName="LoginPOCPU")
    EntityManager em;
    
    @Override
    public boolean Login(String username, String password) {
        try {
            LoginUser user = (LoginUser) em.createQuery("SELECT u FROM LoginUser u WHERE u.username = :name and u.password = :pass")
                    .setParameter("name", username)
                    .setParameter("pass", password)
                    .getSingleResult();
            if (user != null) {
                return true;
            }
        }
        catch (Exception ex) {
            return false;
        }
        return false;
    }
    
}
