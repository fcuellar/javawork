package OOP;

public class Toaster {

	private int nSlots;
	private int voltage;
	private int nSlices;
	private boolean turnedOn;
	private int darkness;
	public Toaster(int nSlots, int voltage) {
		setNSlots(nSlots);
		setVoltage(voltage);
		nSlices=0;
		turnedOn=false;
		darkness=1;
	}
	public int getNSlots() {
		return nSlots;
	}
	public void setNSlots(int nSlots) {
		this.nSlots=Math.max(1,Math.min(4, nSlots));
	}
	public int getVoltage() {
		return voltage;
	}
	public void setVoltage(int voltage) {
		if(voltage==110 || voltage == 220) {
			this.voltage=voltage;
		}
		else {
			this.voltage=110;
		}
	}
	public int getNSlices() {
		return nSlices;
	}
	public void setNSlices(int nSlices) {
		this.nSlices=Math.min(nSlots, Math.abs(nSlices));
	}
	public int getDarkness() {
		return darkness;
	}
	public void setDarkness(int darkness) {
		this.darkness=Math.max(1, Math.min(10, darkness));
	}
	public void turnOn() {
		setTurnedOn(true);
	}
	public void turnOff()
	{
		setTurnedOn(false);
	}
	public void setTurnedOn(boolean turnedOn) {
		this.turnedOn=turnedOn;
	}
	public void insertBread(int n) {
		if(turnedOn) {
			setNSlices(nSlices+n);
		}
	}
	public void popBread() {
		if(turnedOn) {
			setNSlices(0);
		}
	}
	public String toString() {
		return String.format("%d slot %dV toaster with %d slice%s at darkness %d: %s",
				nSlots,voltage,nSlices,((nSlices==1)?"":"s"),darkness,((turnedOn)?"On":"Off"));
	}

}


