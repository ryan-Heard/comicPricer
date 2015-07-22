

public class Book {
  private String title = "";
  private double issueNum = 0;
  private String grade = "";
  private Double retailFor = 0;

/**
 * [init description]
 * @param  {String} title [Series title for book]
 * @param  {Number} issueNum [Issue Number. 0 if unsure]
 * @param  {String} variantId [Books can be id by A-Z or another word and or number
 * combination that makes it distinct]
 */
  public void init(name,number, gradeId){
    this.title = name;
    this.issueNum = number;
    this.variantId = gradeId;
  }

  /**
   * Returns the description of the book.
   */
  public void summery(){
    System.out.println(this.title +" "+this.issue+" "+this.grade);
  }

}
