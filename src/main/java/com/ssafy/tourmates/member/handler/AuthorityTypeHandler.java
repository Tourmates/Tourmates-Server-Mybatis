package com.ssafy.tourmates.member.handler;

import com.ssafy.tourmates.member.Authority;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(Authority.class)
public class AuthorityTypeHandler implements TypeHandler<Authority> {

    @Override
    public void setParameter(PreparedStatement pstmt, int i, Authority authority, JdbcType jdbcType) throws SQLException {
        pstmt.setString(i, authority.toString());
    }

    @Override
    public Authority getResult(ResultSet rs, String columnName) throws SQLException {
        String authority = rs.getString(columnName);
        return getAuthority(authority);
    }

    @Override
    public Authority getResult(ResultSet rs, int columnIndex) throws SQLException {
        String authority = rs.getString(columnIndex);
        return getAuthority(authority);
    }

    @Override
    public Authority getResult(CallableStatement cs, int columnIndex) throws SQLException {
        String authority = cs.getString(columnIndex);
        return getAuthority(authority);
    }

    private Authority getAuthority(String key) {
        Authority authority = null;
        switch (key) {
            case "CLIENT":
                authority = Authority.ADMIN;
                break;
            default:
                authority = Authority.CLIENT;
                break;
        }
        return authority;
    }
}
