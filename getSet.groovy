class GetSet{ 
   int x; 
	
    
	
   public void setX(int pX) { 
      x = pX; 
   } 
	public int getX() { 
      return x; 
   }
	
   static void main(String[] args) { 
      GetSet a1=new GetSet(); 
      a1.setX(100); 
	  def t=a1.getX();
      println(t); 
   } 
}