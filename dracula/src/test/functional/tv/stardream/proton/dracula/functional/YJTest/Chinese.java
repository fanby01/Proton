package tv.stardream.Proton.dracula.functional.YJTest;

public class Chinese implements Person {
	Work work;
	
	
	public Work getWork() {
		return work;
	}


	public void setWork(Work work) {
		this.work = work;
	}


	@Override
	public void worker() {
		// TODO Auto-generated method stub
		work.work();
	}

}
