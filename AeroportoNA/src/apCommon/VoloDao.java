package apCommon;

import java.util.List;

public interface VoloDao {
	
	public List<Volo> getAllVoli();
    public Volo getVoli(Aereo aereo);
    public void updateVolo(Volo volo);
    public void deleteVolo(Volo volo);

}
