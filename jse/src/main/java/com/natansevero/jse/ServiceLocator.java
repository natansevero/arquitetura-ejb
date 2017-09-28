/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natansevero.jse;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;

/**
 *
 * @author natan
 */
public class ServiceLocator {
    protected <T> T lookup(String resource) {
        try {
            Properties props = new Properties();
            props.put(InitialContext.INITIAL_CONTEXT_FACTORY,
                "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("org.omg.CORBA.ORBInitialHost", "host-core");
            props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");
            InitialContext context = new InitialContext(props);
            return (T) context.lookup(resource);
        
        } catch (Exception e) {
            Logger.getLogger(ServiceLocator.class.getName()).log(Level.SEVERE, null, e);
        }
        
        return null;
        
    }
}
