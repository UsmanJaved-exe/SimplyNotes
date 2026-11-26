package com.example.simplynotes.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlin.random.Random
import java.util.Calendar
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

private val today = SimpleDateFormat("MMM dd, yyyy", Locale.getDefault()).format(Date())
data class NotesData(
    val id: Int,
    val title: String,
    val body: String,
    val date: String= today,
    val color: Int = listOf(
        0xFFF9DEDC.toInt(), // soft red
        0xFFFCE8D5.toInt(), // soft orange
        0xFFF5E6A8.toInt(), // soft yellow
        0xFFDDEBDD.toInt(), // soft green
        0xFFD3E3FD.toInt(), // soft blue
        0xFFEADDFF.toInt(), // soft indigo
        0xFFD3E3FD.toInt(), // soft blue
        0xFFEADDFF.toInt(), // soft purple
        0xFFFFD8E4.toInt(), // rose
        0xFFE8DEF8.toInt(), // lavender
        0xFFD7F0EA.toInt(), // mint
        0xFFF0E1D2.toInt(), // sand
        0xFFDCE7C8.toInt(), // pale olive
        0xFFD9EAF7.toInt(), // sky blue
        0xFFF4DDE8.toInt(), // pale pink
        0xFFE6E6FA.toInt(), // pale indigo
        0xFFFDE2C5.toInt(), // peach
        0xFFD6F0F0.toInt(), // pale teal
        0xFFCFE8D5.toInt(), // sage
        0xFFE4D7F5.toInt(), // lilac
        0xFFF2E3A0.toInt(), // butter yellow
        0xFFD5E5E5.toInt()
    ).random(),
    val height: Int = Random.nextInt(100, 200)
)

