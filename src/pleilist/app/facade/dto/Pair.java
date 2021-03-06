package pleilist.app.facade.dto;

public class Pair<T1, T2> {
	private T1 fst;
	private T2 snd;
	
	public Pair(T1 fst, T2 snd) {
		this.fst = fst;
		this.snd = snd;
	}
	
	public T1 getFirst() {
		return fst;
	}
	
	public T2 getSecond() {
		return snd;
	}

}
