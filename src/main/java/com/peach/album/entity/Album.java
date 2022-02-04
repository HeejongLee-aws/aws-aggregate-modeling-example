package com.peach.album.entity;

import com.peach.album.vo.Person;
import com.peach.album.vo.Platform;
import com.peach.album.vo.Point;

import javax.persistence.*;
import java.util.List;

//@Entity
//@Table(name = "RD_VL_ALBUM_INFO", schema = "dd")
public class Album {   // Album

//    ALBUM_ID
//    @Column(name = "ALBUM_ID")
    private String id;

//    ALBUM_NAME
//    @Column(name = "ALBUM_NAME")
    private String name;

//    SERIES_DESC
//    @Column(name= "SERIES_DESC")
    private String seriesDescription;

//    ONAIR_DATE
//    @Column(name = "ONAIR_DATE")
    private String onAirDate;


//    ONAIR_DATE_DISPLAY
//    RELEASE_DATE
//    RUN_TIME
//    PR_INFO
//    KIDS_GRADE
//    COUNTRY
//    DIRECTOR_DISPLAY
//    PRODUCER
//    STARRING_ACTOR
//    ACTORS_DISPLAY
//    VOICE_ACTOR
//    STUDIO
//    PLAYER
//    CAST_NAME
//    WRITER
//    GENRE_LARGE
//    GENRE_MID
//    GENRE_SMALL
//    INTRO_TYPE
//    INTRODUCTION
//    SUB_TITLE
//    DUBBING
//    NSCREEN_YN
//    CINE_ID
//    HIGH_QUALITY_TYPE
//    WATCH_RIGHT_YN
//    GENRE_TYPE
//    VOD_TYPE
//    MUSIC_CONT_TYPE
//    OMNIVIEW_YN
//    SYS_REG_DT
//    SYS_REG_ID
//    SYS_MOD_DT
//    SYS_MOD_ID

//    @OneToOne
    private Point point;

//    @OneToMany
    private List<Person> personals;

//    @OneToMany
    private List<Platform> platforms;

}
