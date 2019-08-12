package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsertDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Driver Load Success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver Load Fail");
		}

		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/kic?autoReconnect=true", "kic12", "kic12"); // (url,사용자,패스워드)

			StringBuffer sql = new StringBuffer();
			sql.append("insert into member(num, name, addr)");
			sql.append("values(?,?,?)");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, 12);
			pstmt.setString(2, "주커버그");
			pstmt.setString(3, "이스라엘");
			//sql문 전송
			//executeUpdate() => insert, update, delete문일때 사용 
			//반환 값은 갱신된 행의 수를 반환한다
			int resultCount = pstmt.executeUpdate();
			
			System.out.println("갱신된 행의 수 : "+resultCount);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
