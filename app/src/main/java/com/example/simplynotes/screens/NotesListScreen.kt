package com.example.simplynotes.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.simplynotes.components.AppTopBarA
import com.example.simplynotes.components.BottomAppBarPreview
import com.example.simplynotes.components.Fab
import com.example.simplynotes.components.NotesList
import com.example.simplynotes.data.NotesData

@OptIn(ExperimentalMaterial3Api::class)
//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun NotesListScreen(NotesData: List<NotesData>) {
    Scaffold(
        modifier = Modifier,
        topBar = { AppTopBarA() },
        bottomBar = { BottomAppBarPreview() },
        floatingActionButton = { Fab() }

    ) {innerPadding ->
        NotesList(NotesData,innerPadding)
    }
    }

