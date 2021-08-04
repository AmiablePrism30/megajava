package Day11;

public class TV implements Remocon{

	int noise=0;
	
	@Override
	public void end() {
		System.out.println("Turning off the TV");
	
		
	}@Override
	public void execute() {
		System.out.println("Turning on the TV");
	
		
	}@Override
	public void noise_control(int noise) {
		if(noise>Remocon.max_noise) {
			noise=Remocon.max_noise;
			
		}
		else if(noise<Remocon.min_noise) {
			noise=Remocon.min_noise;
		}
		else
			this.noise=noise;
		
		
	}
	
}
