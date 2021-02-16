
public class cosa {

		private int a;
		private int b;
		
		
		public cosa() {
			this.a=0;
			this.b=1;
		}
		
		public cosa(int a) {
			this.a = a;
			this.b=1;
		}

		public int getA() {
			return a;
		}

		public void setA(int a) {
			this.a = a;
		}

		public int getB() {
			return b;
		}

		public void setB(int b) {
			this.b = b;
		}
		
		@Override
		public String toString() {
			
			String result;
			
			result = "[A: "+this.a+" B: "+this.b+" ]";
			return result;
		} 
		
}
