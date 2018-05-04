package View;

import javax.swing.JPanel;

public class MesPannel extends JPanel{
	private String srcImage;
	private String srcBouton;
	private String srcPage;
	private int id;
	
	public MesPannel(int id, String source)
	{
		this.setSrcBouton("Bouton/");
		this.setSrcImage("Images/");
		this.setSrcPage(source);
	}

	public String getSrcImage() {
		return srcImage;
	}

	public void setSrcImage(String srcImage) {
		this.srcImage = srcImage;
	}

	public String getSrcBouton() {
		return srcBouton;
	}

	public void setSrcBouton(String srcBouton) {
		this.srcBouton = srcBouton;
	}

	public String getSrcPage() {
		return srcPage;
	}

	public void setSrcPage(String srcPage) {
		this.srcPage = srcPage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
