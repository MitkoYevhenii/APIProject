package ua.goit.api.entity.notes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

    @Query(value = "SELECT n FROM Note n WHERE n.user.userId = :username")
    List<Note> getUserNotes(String username);
}

