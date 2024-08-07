package azizi.mahsa.noteMvpApp.room.ui.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import azizi.mahsa.noteMvpApp.databinding.ActivityMainBinding
import azizi.mahsa.noteMvpApp.room.ui.add.NoteFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    //Binding
    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //InitViews
        binding.apply {
            //Set action view
            setSupportActionBar(notesToolbar)
            //Note detail
            addNoteBtn.setOnClickListener { NoteFragment().show(supportFragmentManager, NoteFragment().tag) }
        }
    }
}