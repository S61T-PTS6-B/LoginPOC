/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.*;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author Max
 */
@Stateless
public class WebServiceImp implements IWebService {

    @Inject
    ILoginUserDAO dao;
    
    @Override
    public boolean Login(String username, String password) {
        return dao.Login(username, password);
    }
    
}
