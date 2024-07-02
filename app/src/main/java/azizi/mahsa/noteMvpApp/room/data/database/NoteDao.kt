package azizi.mahsa.noteMvpApp.room.data.database

import androidx.room.*
import azizi.mahsa.noteMvpApp.room.data.model.NoteEntity
import azizi.mahsa.noteMvpApp.room.utils.NOTE_TABLE
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Observable


@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveNote(entity: NoteEntity): Completable

    @Delete
    fun deleteNote(entity: NoteEntity): Completable

    @Update
    fun updateNote(entity: NoteEntity): Completable

    @Query("SELECT * FROM $NOTE_TABLE")
    fun getAllNotes(): Observable<List<NoteEntity>>

    @Query("SELECT * FROM $NOTE_TABLE WHERE id == :id")
    fun getNote(id: Int): Observable<NoteEntity>

    @Query("SELECT * FROM $NOTE_TABLE WHERE priority == :priority")
    fun filetNote(priority: String): Observable<List<NoteEntity>>

    @Query("SELECT * FROM $NOTE_TABLE WHERE title LIKE '%' || :title || '%' ")
    fun searchNote(title: String): Observable<List<NoteEntity>>
}