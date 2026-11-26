package com.example.simplynotes.hosts

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simplynotes.data.NotesData
import com.example.simplynotes.screens.NotesAddEditScreen
import com.example.simplynotes.screens.NotesListScreen

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Parent() {
//    val listState = remember { (mutableStateListOf<NotesData>()) }
    val addNoteButtonState = rememberSaveable { (mutableStateListOf<Boolean>()) }
    val noteTitle by rememberSaveable { (mutableStateOf("Title")) }
    val note by rememberSaveable { (mutableStateOf("Note")) }
    val addNote by rememberSaveable { (mutableStateOf(false)) }
    val listState = rememberLazyStaggeredGridState()
    val defaultNoteSelectionState by rememberSaveable { (mutableStateOf(false)) }
    val navController = rememberNavController()


    val data = mutableListOf<NotesData>(
        NotesData(1, "Title1", "Note1"),
        NotesData(2, "Title2", "Note2"),
        NotesData(3, "Title3", "Note3"),
        NotesData(4, "Title4", "Note4"),
        NotesData(5, "Title5", "Note5"),
        NotesData(6, "Title6", "Note6"),
        NotesData(7, "Title7", "Note7"),
        NotesData(8, "Title8", "Note8"),
        NotesData(9, "Title9", "Note9"),
        NotesData(10, "Title10", "Note10"),
        NotesData(11, "Title11", "Note11"),
        NotesData(12, "Title12", "Note12"),
        NotesData(13, "Title13", "Note13"),
        NotesData(14, "Title14", "Note14"),
        NotesData(15, "Title15", "Note15"),
        NotesData(16, "Title16", "Note16"),
        NotesData(17, "Title17", "Note17"),
        NotesData(18, "Title18", "Note18"),
        NotesData(19, "Title19", "Note19"),
        NotesData(20, "Title20", "Note20"))


    NavHost(navController = navController, startDestination = "NotesListScreen") {
        composable("NotesListScreen") {
            NotesListScreen(
                toNotesAddEditPanel = { navController.navigate("NotesAddEditScreen")},
                NotesData = data
            )
        }

        composable("NotesAddEditScreen") {
            NotesAddEditScreen(
                onBackClick = { navController.navigate("NotesListScreen") }
            )
        }

    }
}