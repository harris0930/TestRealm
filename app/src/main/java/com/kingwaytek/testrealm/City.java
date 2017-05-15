package com.kingwaytek.testrealm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Kingwaytek on 2016/12/9.
 */
public class City extends RealmObject {

    @PrimaryKey
    private String name;

    private long votes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getVotes() {
        return votes;
    }

    public void setVotes(long votes) {
        this.votes = votes;
    }
}
