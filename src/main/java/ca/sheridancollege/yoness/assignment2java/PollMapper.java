package ca.sheridancollege.yoness.assignment2java;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PollMapper implements RowMapper<Poll> {
    @Override
    public Poll mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Poll poll = new Poll();
        poll.setId(resultSet.getInt("id"));
        poll.setTitle(resultSet.getString("title"));
        poll.setQuestion(resultSet.getString("question"));
        poll.setAnswer1(resultSet.getString("answer1"));
        poll.setAnswer2(resultSet.getString("answer2"));
        poll.setAnswer3(resultSet.getString("answer3"));
        poll.setVotes1(resultSet.getInt("votes1"));
        poll.setVotes2(resultSet.getInt("votes2"));
        poll.setVotes3(resultSet.getInt("votes3"));
        poll.setDate(resultSet.getDate("date"));
        return poll;
    }
}

