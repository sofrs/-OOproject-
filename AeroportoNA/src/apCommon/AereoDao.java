package apCommon;

import java.util.List;

import apViews.AMain.IDAereo;

public interface AereoDao {
	
	 public List<Aereo> getAllAerei();
     public Aereo getAereo(IDAereo IDaereo);
     public void updateAereo(Aereo aereo);
     public void deleteAereo(Aereo aereo);

}
