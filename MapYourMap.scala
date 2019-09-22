package com.particeep.test

/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap {

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

  var namesInDepartments = Map[String,List[String]]();
  for((i,v) <- devNames){
  			for((j,w) <- devDepartments){
          if(i == j) {
            if(namesInDepartments.keySet.exists(_ == w)) {
           		   var l = namesInDepartments(w);
        				l =  v::l;
            
             	namesInDepartments += (w -> l );
            }
            else {
               var l = List(v);
        		           
             	namesInDepartments += (w -> l );
            }
          }
        }
  
		}
}
