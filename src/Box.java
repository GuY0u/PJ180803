
public class Box implements Comparable{
		
		private double volume;
		
		public Box(double volume) {
			this.volume = volume;
		}
		
		

		@Override
		public int compareTo(Object obj) {
			// TODO Auto-generated method stub
			
			Box b = (Box)obj;
		
		    if(this.volume > b.volume) {
		    	return 0;
		    }
		    
		    else if(this.volume < b.volume) {
		    	return -1;
		    }
		    
		    else
			
			return 0;
		}
		
		
		
	

	public static void main(String[] args) {
		
		Box a = new Box(1);
		Box b = new Box(2);
		
		System.out.println(a.compareTo(b));
	}

}