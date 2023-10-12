package ca.sheridancollege.yoness.assignment2java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class PollService {

    @Autowired
    private JdbcTemplate jdbcTemplate; // You should configure this for your database

    public Poll getPollById(int id) {
        // Implement the logic to retrieve a poll from the database by its ID
        String sql = "SELECT * FROM poll WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[] { id }, new PollMapper());
    }

    public void recordVote(int pollId, String choice) {
        // Implement the logic to record a vote for the specified poll
        String sql = "UPDATE poll SET " + choice + " = " + choice + " + 1 WHERE id = ?";
        jdbcTemplate.update(sql, pollId);
    }
}
