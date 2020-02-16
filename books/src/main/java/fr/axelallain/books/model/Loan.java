package fr.axelallain.books.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "loan")
public class Loan {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "status", insertable = false)
    private String status = "Started";

    @Column(name = "startingDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startingDate;

    @Column(name = "endingDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endingDate;

    @Column(name = "extended")
    private boolean extended = false;

    @OneToOne
    private Copy copy;

    private String tokenuserid;

    private String tokenuseremail;

    public Loan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public Date getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(Date endingDate) {
        this.endingDate = endingDate;
    }

    public boolean isExtended() {
        return extended;
    }

    public void setExtended(boolean extended) {
        this.extended = extended;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public String getTokenuserid() {
        return tokenuserid;
    }

    public void setTokenuserid(String tokenuserid) {
        this.tokenuserid = tokenuserid;
    }

    public String getTokenuseremail() {
        return tokenuseremail;
    }

    public void setTokenuseremail(String tokenuseremail) {
        this.tokenuseremail = tokenuseremail;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", startingDate=" + startingDate +
                ", endingDate=" + endingDate +
                ", extended=" + extended +
                ", copy=" + copy +
                ", tokenuserid='" + tokenuserid + '\'' +
                ", tokenuseremail='" + tokenuseremail + '\'' +
                '}';
    }
}
