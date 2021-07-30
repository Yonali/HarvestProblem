
import scala.io.StdIn.readInt;
import java.util.Scanner;
import scala.util.control._


object HarvestProblem {
  def main(args: Array[String]): Unit = {

    
 val NoWeek=4
 val Nodayspw=7
 val monthlyHavest=Array.ofDim[ Float](5, 8)

 var Max : Float=0
 var Min : Float=0
 var Range : Float=0
 var Average : Float=0
 var Medium : Float=0
 var Total : Float=0


 
	for(i<-1 to NoWeek){
	  for(j<-1 to Nodayspw){ 

		print("Harvest of "+i+" week -> day "+j+" -> ")
		var v=scala.io.StdIn.readInt()
		monthlyHavest(i)(j)=v;
		Total=Total+v
	  }
	}
    println("===========================================")
	for(i<-1 to 4){
	  for(j<-1 to 7){ 
     	  	 var a=monthlyHavest(i)(j);
       		 print(a+" | ");
	  }
	          println("  ");
	}
     println("===========================================")    
       Max=monthlyHavest(1)(1)
       Min=monthlyHavest(1)(1)
//--------------------------------------------------------------------------------------------
    println("")
    for(i<-1 to NoWeek){   
        for(j<- 1 to Nodayspw){
          if(Max< monthlyHavest(i)(j))
            Max=monthlyHavest(i)(j)          
        }     
    }
    println("Maximum -> "+ Max)


    for(i<-1 to NoWeek){   
        for(j<- 1 to Nodayspw){
          if(Max==monthlyHavest(i)(j))
          println("	 week -> "+i+"  date -> "+j)        
        }     
    }


//--------------------------------------------------------------------------------------------
    println("")
    for(i<-1 to NoWeek){   
        for(j<- 1 to Nodayspw){
          if(Min> monthlyHavest(i)(j))
            Min=monthlyHavest(i)(j)          
        }     
    }
    println("Minimum -> "+ Min)
    for(i<-1 to NoWeek){   
        for(j<- 1 to Nodayspw){
          if(Min==monthlyHavest(i)(j))
          println("	 week -> "+i+"  date -> "+j)        
        }     
    }

//--------------------------------------------------------------------------------------------h5
     println("")
     Range=Max-Min
     println("Range  -> "+ Range)       

//--------------------------------------------------------------------------------------------
     println("")  
     Average=Total/28
     println("Average  -> "+ Average)  

//--------------------------------------------------------------------------------------------
 var sortData = new Array[ Float](29)    
  var x=1                                                                                //get data to 1D array
    for(i<-1 to NoWeek){    
      for(j<-1 to Nodayspw){
          sortData(x)=monthlyHavest(i)(j)
          x=x+1         
      }
    }
    for(z<-1 to x){
      var b=sortData(z);
       print(b+" | ");	
    }
                                                                               //sorting         
  var Pt : Float=0
    for(p<-1 to 28){   
      for(q<-(1+p) to 28){
          if(sortData(p)>sortData(q)){
            Pt=sortData(q)
            sortData(q)=sortData(p)
            sortData(p)=Pt
          }
      } 
    }
          print(" | ");                                                                           // Medium
    Medium=(sortData(14)+sortData(15))/2 
    println("Medium  -> "+Medium)

  }
}
