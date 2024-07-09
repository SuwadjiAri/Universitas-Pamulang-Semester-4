/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package master;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author arifs
 */
@Entity
@Table(name = "workers", catalog = "employees", schema = "")
@NamedQueries({
    @NamedQuery(name = "Workers.findAll", query = "SELECT w FROM Workers w"),
    @NamedQuery(name = "Workers.findById", query = "SELECT w FROM Workers w WHERE w.id = :id"),
    @NamedQuery(name = "Workers.findByFirstName", query = "SELECT w FROM Workers w WHERE w.firstName = :firstName"),
    @NamedQuery(name = "Workers.findByLastName", query = "SELECT w FROM Workers w WHERE w.lastName = :lastName"),
    @NamedQuery(name = "Workers.findByJobTitle", query = "SELECT w FROM Workers w WHERE w.jobTitle = :jobTitle")})
public class Workers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Short id;
    @Column(name = "First_Name", length = 15)
    private String firstName;
    @Column(name = "Last_Name", length = 15)
    private String lastName;
    @Column(name = "Job_Title", length = 15)
    private String jobTitle;

    public Workers() {
    }

    public Workers(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
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

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Workers)) {
            return false;
        }
        Workers other = (Workers) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "master.Workers[ id=" + id + " ]";
    }
    
}
