package apCommon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public interface TrattaDao {
	
	
	public List<Tratta> getTratte() throws SQLException;
	public boolean insertTratta(Tratta tratta);
	public boolean updateTratta(Tratta tratta);
	public boolean deleteTratta(Tratta tratta);
	
}
