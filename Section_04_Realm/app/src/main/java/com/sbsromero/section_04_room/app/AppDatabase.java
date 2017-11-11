package com.sbsromero.section_04_room.app;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;

import com.sbsromero.section_04_room.converter.Converters;
import com.sbsromero.section_04_room.models.Board;
import com.sbsromero.section_04_room.models.Note;

/**
 * Created by USERPC on 10/11/2017.
 */
@Database(entities = {Board.class, Note.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {

}
