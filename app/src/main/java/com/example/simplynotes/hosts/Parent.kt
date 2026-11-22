package com.example.simplynotes.hosts

import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplynotes.data.NotesData

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Parent() {
//    val listState = remember { (mutableStateListOf<NotesData>()) }
    val addNoteButtonState = rememberSaveable { (mutableStateListOf<Boolean>()) }
    val noteTitle by rememberSaveable{(mutableStateOf("Title"))}
    val note by rememberSaveable{(mutableStateOf("Note"))}
    val addNote by rememberSaveable{(mutableStateOf(false))}
    val listState = rememberLazyListState()
    val defaultNoteSelectionState by rememberSaveable{(mutableStateOf(false))}





}