package azizi.mahsa.noteMvpApp.room.data.repository.main
import azizi.mahsa.noteMvpApp.room.data.database.NoteDao
import azizi.mahsa.noteMvpApp.room.data.model.NoteEntity
import javax.inject.Inject

class MainRepository @Inject constructor(private val dao: NoteDao) {
    fun loadAllNotes() = dao.getAllNotes()
    fun deleteNote(entity: NoteEntity) = dao.deleteNote(entity)
    fun filterNote(priority: String) = dao.filetNote(priority)
    fun searchNote(title: String) = dao.searchNote(title)
}