package com.gani.proxy.protectionProxy;

/**
 * Created by Gani on 8/5/17.
 */
public class PersonBeanImpl implements PersonBean {

    String name;
    String gender;
    String interests;
    int rating=0;
    int ratingCount = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getInterests() {
        return interests;
    }

    @Override
    public void setInterests(String interests) {
        this.interests = interests;
    }

    @Override
    public int getHotOrNotRating() {
        return ratingCount==0 ? 0 : rating/ratingCount ;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating+=rating;
        ratingCount++;
    }
}
