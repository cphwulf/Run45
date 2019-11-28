package run45;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class MemberController {
	
	ArrayList<Member> members;
	
	public MemberController() {
		members = new ArrayList<>();
	}
	
	public void writeMemberToDB(Member member) {
		try {
			Connection conn = DBConnector.getInstance().getConnection();
			//new Member(id,name,year,active,competitor);
			// initialisere JDBC-komponenter
			int id = 0;
			ResultSet result = null;
			PreparedStatement pstmt = null;
			// Queries
			String query = "INSERT INTO members (name,email,year,active,compete,gender)";
			query += " VALUES (?,?,?,?,?,?)";
			try {
				
				pstmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
				pstmt.setString(1, member.getName());
				pstmt.setString(2, member.getEmail());
				pstmt.setInt(3, member.getYear());
				pstmt.setBoolean(4, member.isActive());
				pstmt.setBoolean(5, member.isCompetitor());
				pstmt.setInt(6, member.getGender());
				pstmt.executeUpdate();
				result = pstmt.getGeneratedKeys();
				if (result.next()) {
					int memberid = result.getInt(1);
					System.out.println("Inserted member " + member.getName() + " id " + memberid);
					member.setId(memberid);
				} else {
					System.out.println("No  insert");
				}
			} catch (Exception e) {
				System.out.println("Error " + e);
				
			}
		} catch (SQLException e) {
			System.out.println("Error: " + e);
		}
		
	}
	
	
	public ArrayList<Member> getAllMembersFromDB() throws SQLException {
		// connect til DB
		Connection conn = DBConnector.getInstance().getConnection();
		// initialisere JDBC-komponenter
		ResultSet result = null;
		Statement stmt = null;
		// Queries
		String query = "SELECT * FROM members";
		stmt = conn.createStatement();
		result = stmt.executeQuery(query);
		while(result.next()) {
			System.out.println("Member: " + result.getString("Name"));
		}
		
		// lave Member-objekter
		// sætte dem i listen
		
		return members;
		
	}
	
}
