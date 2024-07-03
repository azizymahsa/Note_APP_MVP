package azizi.mahsa.noteMvpApp.room.ui.add

import azizi.mahsa.noteMvpApp.base.BasePresenterImpl
import azizi.mahsa.noteMvpApp.room.data.model.NoteEntity
import azizi.mahsa.noteMvpApp.room.data.repository.add.AddNoteRepository
import azizi.mahsa.noteMvpApp.room.data.repository.add.NoteContracts
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import javax.inject.Inject

class NotePresenter @Inject constructor(
    private val repository: AddNoteRepository,
    private val view: NoteContracts.View
) :
    NoteContracts.Presenter, BasePresenterImpl() {
    override fun saveNote(entity: NoteEntity) {
        disposable = repository.saveNote(entity)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{
                view.close()
            }


    }

    override fun detailNote(id: Int) {
        TODO("Not yet implemented")
    }

    override fun updateNote(entity: NoteEntity) {
        TODO("Not yet implemented")
    }
}