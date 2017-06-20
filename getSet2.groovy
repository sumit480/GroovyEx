class Clock {  
        String time;  

        void setTime (String t) {  
           time = t;  
        }  

        String getTime() {  
           return time;  
        }  
		
   static void main (String [] args) {  
   Clock c = new Clock();  

   c.setTime("12345")  
   String tod = c.getTime();  
   println("time: " + tod);  
 }
}  