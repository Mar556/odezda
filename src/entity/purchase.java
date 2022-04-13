/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author mark-
 */
public class purchase {
    private User1 user; 
    private Pants pants;
    private Tishka tishka;
    private Date date;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.user);
        hash = 47 * hash + Objects.hashCode(this.pants);
        hash = 47 * hash + Objects.hashCode(this.tishka);
        hash = 47 * hash + Objects.hashCode(this.date);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final purchase other = (purchase) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (!Objects.equals(this.pants, other.pants)) {
            return false;
        }
        if (!Objects.equals(this.tishka, other.tishka)) {
            return false;
        }
        if (!Objects.equals(this.date, other.date)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "purchase{" + "user=" + user + ", pants=" + pants + ", tishka=" + tishka + ", date=" + date + '}';
    }

    public User1 getUser() {
        return user;
    }

    public void setUser(User1 user) {
        this.user = user;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Tishka getTishka() {
        return tishka;
    }

    public void setTishka(Tishka tishka) {
        this.tishka = tishka;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
