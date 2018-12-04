package soundsystem;

public class BlankDisc implements CompactDisc{
	private String tittle;
	private String artist;
	public BlankDisc(String tittle,String artist) {
		this.tittle=tittle;
		this.artist=artist;
	}
	public void play() {
		System.out.println("Playing "+tittle+" by "+artist);
	}
}
