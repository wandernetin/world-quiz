package org.wneto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.wneto.domain.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
