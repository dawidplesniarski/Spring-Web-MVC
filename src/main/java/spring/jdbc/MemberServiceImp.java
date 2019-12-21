package spring.jdbc;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Service;
import spring.model.Member;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;

@Service
public class MemberServiceImp implements MemberDao {

    private static final String FIND_ALL_SQL = "select firstname, lastname from tok.member";

    @Inject
    private NamedParameterJdbcOperations jdbcTemplate;
    @Inject private MemberRowMapper memberRowMapper;


    @Override
    public List<Member> findAll() throws Exception {
        return jdbcTemplate.query(FIND_ALL_SQL, new HashMap<String, Object>(), memberRowMapper);
    }
}
