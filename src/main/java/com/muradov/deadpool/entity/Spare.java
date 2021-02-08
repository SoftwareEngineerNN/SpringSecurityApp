package com.muradov.deadpool.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "warehouse")
public class Spare {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "spare_id")
    private int spareId;

    @Column(name = "spare_name",nullable=false)
    private String spareName;

    @Column(name = "date_of_creature")
    private Date dateOfCreature;

    @Column(name = "car_model")
    private String carModel;

    private int price;

    public Integer getSpareId() {
        return spareId;
    }

    public void setSpareId(Integer spareId) {
        this.spareId = spareId;
    }

    public String getSpareName() {
        return spareName;
    }

    public void setSpareName(String spareName) {
        this.spareName = spareName;
    }

    public Date getDateOfCreature() {
        return dateOfCreature;
    }

    public void setDateOfCreature(Date dateOfCreature) {
        this.dateOfCreature = dateOfCreature;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "<hr>Spare [SpareId = " + spareId + " name of Spare " + spareName + " was made " + dateOfCreature
                + " for car - " + carModel + " costs - " + price + "] </hr>";
    }
}

