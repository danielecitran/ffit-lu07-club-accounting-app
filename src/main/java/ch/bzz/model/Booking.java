package ch.bzz.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
 
@Getter                 // generiert Getter
@Setter                 // generiert Setter
@NoArgsConstructor      // generiert Standard-Konstruktor
@AllArgsConstructor     // generiert Konstruktor mit allen Feldern
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column
    private int bookingNumber;
    
    @Column
    private Date date;
    
    @Column
    private String text;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private Account debitAccount;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "id", nullable = false)
    private Account creditAccount;
    private double amount;
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "projectName", nullable = false)
    private Project project;
}
