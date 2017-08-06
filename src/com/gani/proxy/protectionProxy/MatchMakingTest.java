package com.gani.proxy.protectionProxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

/**
 * Created by Gani on 8/5/17.
 */
public class MatchMakingTest {

    HashMap<String,PersonBean> myDB = new HashMap<String,PersonBean>();

    public static void main(String[] args) {
        MatchMakingTest matchMaker = new MatchMakingTest();
        matchMaker.drive();
    }

    public MatchMakingTest() {
        initializeDB();
    }

    public void drive(){
        PersonBean joe = getPerson("Joe");
        PersonBean ownerProxy = getOwnerProxy(joe);
        PersonBean nonOwnerProxy = getNonOwnerProxy(joe);

        System.out.println("Name is "+ownerProxy.getName());
        System.out.println("Gender is "+nonOwnerProxy.getGender());

        ownerProxy.setInterests("Cricket");

        try{
            ownerProxy.setHotOrNotRating(5);
        }
        catch(Exception e){
            System.out.println("Owner cannot change his own rating");
        }
        System.out.println("Rating is "+ownerProxy.getHotOrNotRating());

        nonOwnerProxy.setHotOrNotRating(5);
        System.out.println("Updated rating is "+nonOwnerProxy.getHotOrNotRating());

    }

    public void initializeDB(){
        PersonBean joe = new PersonBeanImpl();
        joe.setName("Jogendraa");
        joe.setGender("Male");
        joe.setInterests("Politrics");
        joe.setHotOrNotRating(3);
        myDB.put("Joe",joe);
    }

    public PersonBean getPerson(String name){
        return myDB.get(name);
    }

    PersonBean getOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    PersonBean getNonOwnerProxy(PersonBean person){
        return (PersonBean) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person)
        );
    }



}
