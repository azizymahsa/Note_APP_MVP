package azizi.mahsa.noteMvpApp.room.data.repository.add

import azizi.mahsa.noteMvpApp.base.BasePresenter
import azizi.mahsa.noteMvpApp.room.data.model.NoteEntity

interface NoteContracts {
    interface View {
        fun close()
        fun loadNote(note: NoteEntity)
    }

    interface Presenter : BasePresenter {
        fun saveNote(entity: NoteEntity)
        fun detailNote(id: Int)
        fun updateNote(entity: NoteEntity)
    }
}