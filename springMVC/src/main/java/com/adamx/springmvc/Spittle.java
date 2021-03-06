package com.adamx.springmvc;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * Created by shangzhidong on 2016/8/22.
 */
public class Spittle {
    private final Long id;
    private final String message;
    private final Date time;
    private Double latitude;
    private Double longtitude;

    public Spittle(String message,Date time){
        this(message, time,null,null);
    }
    public Spittle(String message,Date time,Double longtitude,Double latitude){
        this.id = null;
        this.message = message;
        this.time = time;
        this.longtitude = longtitude;
        this.latitude = latitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this,that,"id","time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this,"id","time");
    }
}
