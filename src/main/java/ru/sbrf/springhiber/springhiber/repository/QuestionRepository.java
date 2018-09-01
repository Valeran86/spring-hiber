package ru.sbrf.springhiber.springhiber.repository;

import ru.sbrf.springhiber.springhiber.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
