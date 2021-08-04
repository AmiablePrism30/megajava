package Day11;

public interface Remocon {
	int max_noise=10;
	int min_noise=0;
	
	
	public abstract void execute();
	
	public void end();
	
	public void noise_control(int noise);
	
	public default void channel_change() {
		System.out.println("Channel Change");
	}
	


}
