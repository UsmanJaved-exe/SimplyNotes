package com.example.simplynotes.components

import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.simplynotes.data.NotesData

@Composable
fun NotesCard(item: NotesData) {
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .height(item.height.dp)
            .combinedClickable(
                onClick = {},
                onLongClick = {},
            ),
        colors = CardDefaults.cardColors(Color(item.color)),
        shape = MaterialTheme.shapes.large,
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = item.title,
                    style = MaterialTheme.typography.titleMedium
                )

                Text(
                    text = item.body,
                    style = MaterialTheme.typography.bodySmall,
                    maxLines = 2
                )

                Text(
                    text = item.date,
                    style = MaterialTheme.typography.labelSmall
                )
            }
            Spacer(modifier = Modifier.padding(4.dp))


            Checkbox(
                checked = true,
                onCheckedChange = {},
                enabled = false
            )

        }
    }
}