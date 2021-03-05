package apCommon;

import java.util.List;

public interface LavoratoreDao {
		public List<Lavoratore> getAllLavoratori();
		public Lavoratore getLavoratore(String CF);
		public void updateLavoratori(Lavoratore lavoratore);
		public void deleteLavoratore(Lavoratore lavoratore);
}
