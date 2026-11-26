package com.example.simplynotes.components

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Fab(toNotesAddEditPanel: () -> Unit) {
    FloatingActionButton(
        onClick = {
            toNotesAddEditPanel()
        },
        shape = CircleShape,
        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation(16.dp)
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add"
        )
    }
}