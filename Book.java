

public class Book {
  private String title = "";
  private double issueNum = 0;
  private String grade = "";

  public void init(name,number, gradeId){
    this.title = name;
    this.issueNum = number;
    this.variantId = gradeId;
  }

  public void summery(){
    System.out.println(this.title +" "+this.issue+" "+this.grade);
  }

}
