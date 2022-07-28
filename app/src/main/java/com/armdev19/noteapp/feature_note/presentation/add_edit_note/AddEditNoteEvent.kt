package com.armdev19.noteapp.feature_note.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent {
    data class EnteredTitle(val value: String) : AddEditNoteEvent()
    data class ChaneTitleFocus(val focusState: FocusState) : AddEditNoteEvent()

    data class EnteredContent(val value: String) : AddEditNoteEvent()
    data class ChaneContentFocus(val focusState: FocusState) : AddEditNoteEvent()

    data class ChangeColor(val color: Int) : AddEditNoteEvent()

    object SaveNote : AddEditNoteEvent()
}


