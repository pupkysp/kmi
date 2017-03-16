import javax.faces.bean.ManagedBean;

@ManagedBean
public class KMI {
	private int ugis;
	private double svoris;
	private String lytis;
	
	public KMI(){
		
	}

	public int getUgis() {
		return ugis;
	}

	public void setUgis(int ugis) {
		this.ugis = ugis;
	}

	public double getSvoris() {
		return svoris;
	}

	public void setSvoris(double svoris) {
		this.svoris = svoris;
	}

	public String getLytis() {
		return lytis;
	}

	public void setLytis(String lytis) {
		this.lytis = lytis;
	}
}
