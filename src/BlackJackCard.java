public class BlackJackCard extends Card{

	public BlackJackCard(int r, Card.Suit s) {
		super(r, s);}
		// TODO Auto-generated constructor stub
			
		public int value() {
			int r=super.value();
			if(r==1) return 11;
			if(r<10) return r;
			return 10;
		}
	boolean isAce()
	{
		return super.value()==1;
	}
	
	
	
}