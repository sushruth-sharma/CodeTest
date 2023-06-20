package com.dxc.services;

import java.util.List;
import java.util.Optional;


import com.dxc.exception.NoteExistsException;
import com.dxc.model.Note;

public interface NoteService {

	Note newNote(Note note) throws NoteExistsException;

	Note updateNote(Note note);

	void deleteNoteById(int noteid);

	List<Note> getAllNotesByUser(String userid);
}
