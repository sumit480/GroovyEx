

class GroovyDateArithmetic {

    static main(String[] args) {
        
        def date = new Date()
        
            println date
         def datePlus = date.clone()

         def dateMinus = date.clone()
           
         
         datePlus = datePlus + 1
        

         println datePlus // Mon May 23 00:00:00 EEST 1988

         datePlus = datePlus.plus(5)

         println datePlus // Sat May 28 00:00:00 EEST 1988

         

        dateMinus = dateMinus - 10

         

        println dateMinus // Sun May 08 00:00:00 EEST 1988

         

        dateMinus = dateMinus.minus(10)

         

        println dateMinus // Thu Apr 28 00:00:00 EEST 1988

         

        def dateInterval =  dateMinus..<datePlus

         
        //println dateInterval // [Thu Apr 28 00:00:00 EEST 1988,.., Fri May 27 00:00:00 EEST 1988]

  }
 

}
