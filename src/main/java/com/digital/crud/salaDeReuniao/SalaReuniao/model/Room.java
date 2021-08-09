package com.digital.crud.salaDeReuniao.SalaReuniao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MEETIN_ROOM")
@Getter
@Setter
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name", nullable = false)
    private String name;
    @Column(name="date", nullable = false)
    private String date;
    @Column(name="starHour", nullable = false)
    private String startHour;
    @Column(name="endHour", nullable = false)
    private String endHour;

    public Room(){

    }

    public Room(long id, String name, String Date, String startHour, String endHour){
        this.id=id;
        this.name=name;
        this.date=date;
        this.startHour=startHour;
        this.endHour=endHour;

    }
    @Override
    public String toString(){
        return "Room {id= "+id+",name= "+name+",Start Hour= "+startHour+"End Hour= "+endHour+"}";
    }

}
