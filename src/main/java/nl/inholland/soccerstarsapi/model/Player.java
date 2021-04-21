package nl.inholland.soccerstarsapi.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private long id;
    private int number;
    private String firstName;
    private String lastName;
    private String nickName;
    private boolean injured;

    @ManyToOne
    @JsonManagedReference
    private Competition competition;

    public Player() {
    }

    public Player(long id, int number, String firstName, String lastName, String nickName, boolean injured) {
        this.id = id;
        this.number = number;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.injured = injured;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public boolean isInjured() {
        return injured;
    }

    public void setInjured(boolean injured) {
        this.injured = injured;
    }

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
}
