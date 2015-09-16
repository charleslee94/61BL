package jeromesDumbShit;
//Student: Jerome Rufin
//Program: Computer Dating

public class Foothill
{
  public static void main(String[] args) throws Exception
  {
      DateProfile app1, app2, app3, app4;
      
      app1 = new DateProfile('M','F',2,7,"Kobe Bryant");
      app2 = new DateProfile('F','M',4,5,"Jessica Alba");
      app3 = new DateProfile('M','F',6,9, "Seth Rogan");
      app4 = new DateProfile('F','M',1,3,"Megan Fox");   
  }

 static class DateProfile
 {
     private char gender, searchGender;
     private int romance, finance;
     private String name; 

 DateProfile()
 {       
     gender = ' ';
     searchGender = ' ';
     romance = 0;
     finance = 0;
     name = "";
 }
 
 DateProfile(char gender, char searchGender, int romance, int finance,
         String name)
 {
     if (!setGender(gender))
         this.gender = gender;
     if (!setSearchGender(searchGender))
         this.searchGender = searchGender;
     if (!setRomance(romance))
         this.romance = romance;
     if (!setFinance(finance))
         this.finance = finance;
     if (!setName(name))
         this.name = name;
 }
 
 public double fitValue(DateProfile partner)
 {
     
 }
 
 private double determineGenderFit(DateProfile partner)
 {
     if (partner.getGender() == this.getSearchGender())
         return 1;
     else
         return 0;
 }


 private double determineRomanceFit(DateProfile partner)
 {
     
 }
 
 private double determineFinanceFit(DateProfile partner)
 {
     
 }
 
public boolean setGender(char gender)
{
 if (gender != 'M' || gender != 'F')
     return false;
     this.gender = gender;
     return true;
}
 
public boolean setSearchGender(char searchGender)
{
 if (searchGender != 'M' || searchGender != 'F')
     return false;
     this.searchGender = searchGender;
     return true;
}

public boolean setRomance(int romance)
{
 if (romance < 1 || romance > 10)
     return false;
     this.romance = romance;
     return true;
}
 
public boolean setFinance(int finance)
{
 if (finance < 1 || finance > 10)
     return false;
     this.finance = finance;
     return true;
}
 
public boolean setName(String name)
{
 if (!Character.isLetter(name.charAt(0)))
     return false;
     this.name = name;
     return true;
}

public char getGender()
{
 return gender;
}
 
public char getSearchGender()
{
 return searchGender;
}
 
public int getRomance()
{
 return romance;
}

public int getFinance()
{
 return finance;
}
 
public String getName()
{
 return name;
}






 }
}