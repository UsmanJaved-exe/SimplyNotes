package com.example.simplynotes.screens

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplynotes.components.AppTopBarB
import com.example.simplynotes.components.BottomAppBarPreview
import com.example.simplynotes.components.NotesAddEditPanel


@Composable
fun NotesAddEditScreen(onBackClick: () -> Unit) {
    Scaffold(
        modifier = Modifier,
        topBar = { AppTopBarB() }
    ) {innerPadding ->
        NotesAddEditPanel(innerPadding)
    }
}