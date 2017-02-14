
/*
Students class contains information about all the
Students registered in the University or School.

*/

class Students
{
  String enrolNo; //It will be unique for evry student
  String name;
  int fine;
  int booksIssued;
  Books list[];
  int semester;
  String dept;
  boolean active; //can be blocked if required


  Students(){

  }

  public Students(){

  }

  public String getEnrolNo(){
    return enrolNo;
  }




}
