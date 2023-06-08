package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationAdapterTests {
    private val context = mock(Context::class.java)
    @Test
    fun adapterSize(){
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(data, context)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)

    }
}