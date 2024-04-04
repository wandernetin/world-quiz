package org.wneto.service;

import org.springframework.stereotype.Service;
import org.wneto.domain.Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuizService {

    private List<Quiz> quizzes = new ArrayList<>();

    public Quiz getRandomQuiz() {
        Quiz quiz = new Quiz("Where is located the tallest volcano in the world?", "Japan", "Turkey", "Argentina", "Japan", "");
        quizzes.add(quiz);
        if (quizzes == null || quizzes.isEmpty()) {
            return null;
        }

        Random random = new Random();
        int index = random.nextInt(quizzes.size());
        return quizzes.get(index);
    }
}
