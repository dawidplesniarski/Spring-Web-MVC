package spring.jdbc;

import org.springframework.stereotype.Component;
import spring.model.Member;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class MemberRowMapper implements RowMapper<Member> {

    @Override
    public Member mapRow(ResultSet resultSet, int rowNum) throws SQLException{
        return new Member(resultSet.getString(1),resultSet.getString(2));
    }
}
