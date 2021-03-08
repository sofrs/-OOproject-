package apCommon;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class CompagniaDaoImpl implements CompagniaDao {
	
	private final String url = "jdbc:postgresql://postgres:5432/Project";
	private final String user = "postgres";
	private final String password = "postgres";
	
	public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return conn;
    }
	
	@Override
	public List<Compagnia> getAllCompagnie() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compagnia getCompagnie(String nomeCompagnia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCompagnia(Compagnia compagnia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCompagnia(Compagnia compagnia) {
		// TODO Auto-generated method stub
		
	}

	
	

}
