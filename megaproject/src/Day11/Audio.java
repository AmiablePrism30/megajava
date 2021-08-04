package Day11;

public class Audio implements Remocon{
	
	
	int noise=0;

	@Override
	public void end() {
		System.out.println("Turning off the Audio");
		
	}@Override
	public void execute() {
		System.out.println("Turning on the Audio");
		
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
		
		System.out.println("Noise : "+noise );
		
		
		
	}
}
