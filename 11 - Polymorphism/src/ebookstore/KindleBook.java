package ebookstore;

public class KindleBook extends eBook{
	
	private boolean downloadedFromAmazon;

	public KindleBook() {
		// TODO Auto-generated constructor stub
	}
	


	public KindleBook(String title, boolean downloadedFromAmazon) {
		super(title);
		this.setDownloadedFromAmazon(downloadedFromAmazon);
	}
	
	
	
	public void readBook() {
		if (downloadedFromAmazon) {
			System.out.println("Reading book...");
		} else {
			System.err.println("illegal file, cannot read!");
		}
	}
	

	public boolean isDownloadedFromAmazon() {
		return downloadedFromAmazon;
	}

	public void setDownloadedFromAmazon(boolean downloadedFromAmazon) {
		this.downloadedFromAmazon = downloadedFromAmazon;
	}
	
	

}
