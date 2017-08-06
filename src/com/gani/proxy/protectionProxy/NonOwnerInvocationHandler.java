package com.gani.proxy.protectionProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Gani on 8/5/17.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {

    private PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

        try{
            if(method.getName().startsWith("get"))
                return method.invoke(personBean,args);
            else if(method.getName().equals("setHotOrNotRating"))
                return method.invoke(personBean,args);
            else if(method.getName().startsWith("set"))
                throw new IllegalAccessException();
        }
        catch (InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
