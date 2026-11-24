package com.example.simplynotes.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun NotesAddEditPanel(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp)
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth(),
//                .padding(bottom = 16.dp),
            value = "",
            onValueChange = {},
            placeholder =
                {
                    Text(
                        text = "Title",
                        style = MaterialTheme.typography.titleMedium
                    )
                })

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Date",
            style = MaterialTheme.typography.labelSmall
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            modifier = Modifier
                .fillMaxSize(),
            value = "",
            onValueChange = {},
            placeholder = {
                Text(
                    text = "Type Here...",
                    style = MaterialTheme.typography.bodyMedium
                )
            })
    }
}

