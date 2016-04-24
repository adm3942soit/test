package io.fourfinanceit.homework.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "users")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column( name = "firstName",nullable = false, unique = true)
    private String firstName;
    @Column(name = "lastName", nullable = false, unique = true)
    private String lastName;
    @Column(name = "amount", nullable = true, unique = false)
    private BigDecimal amount;
    @Column(name = "term", nullable = true, unique = false)
    private Integer term;
    @Column(name = "timeEnter", nullable = true, unique = false)
    private String timeEnter;
    @Column(name = "dateEnter", nullable = true, unique = false)
    private Date dateEnter;
    @Column(name = "countEnter", nullable = false, unique = false)
    private Integer countEnter;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public Date getDateEnter() {
        return dateEnter;
    }

    public void setDateEnter(Date dateEnter) {
        this.dateEnter = dateEnter;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public String getTimeEnter() {
        return timeEnter;
    }

    public void setTimeEnter(String timeEnter) {
        this.timeEnter = timeEnter;
    }

    public Integer getCountEnter() {
        return countEnter;
    }

    public void setCountEnter(Integer countEnter) {
        this.countEnter = countEnter;
    }
}
