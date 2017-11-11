package com.sbsromero.section_04_room.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;


/**
 * Created by sumset on 1/11/17.
 */

@Entity(foreignKeys = @ForeignKey(
        entity = Board.class,
        parentColumns = "id",
        childColumns = "board_id"))
public class Note {

    @PrimaryKey
    private int id;
    private String description;
    private Date createdAt;

    @ColumnInfo(name = "board_id")
    private int boardId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getBoardId() {
        return boardId;
    }

    public void setBoardId(int boardId) {
        this.boardId = boardId;
    }
}
