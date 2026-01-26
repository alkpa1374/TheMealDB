//Defines the package where this class belongs
package model;

//Declares the MealInfo class, a simplified representation of a meal
public class MealInfo 
{
    //Unique identifier of the meal
    private String idMeal;
    
    //Name of the meal
    private String strMeal;
    
    //Alternate name of the meal (if available)
    private String strMealAlternate;
    
    //Category of the meal (e.g., "Dessert", "Seafood")
    private String strCategory;
    
    //Region or area of cuisine (e.g., "Italian", "American")
    private String strArea;
    
    //Instructions for preparing the meal
    private String strInstructions;
    
    //URL for the meal's thumbnail image
    private String strMealThumb;
    
    //Tags associated with the meal (comma-separated)
    private String strTags;
    
    //YouTube link showing meal preparation
    private String strYoutube;
    
    //Ingredients of the meal (up to 20)
    private String strIngredient1;
    private String strIngredient2;
    private String strIngredient3;
    private String strIngredient4;
    private String strIngredient5;
    private String strIngredient6;
    private String strIngredient7;
    private String strIngredient8;
    private String strIngredient9;
    private String strIngredient10;
    private String strIngredient11;
    private String strIngredient12;
    private String strIngredient13;
    private String strIngredient14;
    private String strIngredient15;
    private String strIngredient16;
    private String strIngredient17;
    private String strIngredient18;
    private String strIngredient19;
    private String strIngredient20;
    
    //Measures corresponding to each ingredient (up to 20)
    private String strMeasure1;
    private String strMeasure2;
    private String strMeasure3;
    private String strMeasure4;
    private String strMeasure5;
    private String strMeasure6;
    private String strMeasure7;
    private String strMeasure8;
    private String strMeasure9;
    private String strMeasure10;
    private String strMeasure11;
    private String strMeasure12;
    private String strMeasure13;
    private String strMeasure14;
    private String strMeasure15;
    private String strMeasure16;
    private String strMeasure17;
    private String strMeasure18;
    private String strMeasure19;
    private String strMeasure20;
    
    //Original source URL of the recipe (if provided)
    private String strSource;
    
    //URL for the image source (if different from strMealThumb)
    private String strImageSource;
    
    //Indicates if Creative Commons license is confirmed for the recipe
    private String strCreativeCommonsConfirmed;
    
    //Date of last modification of the meal information
    private String dateModified;
    
    //Default no-argument constructor
    public MealInfo() 
    {
        super(); //Calls the superclass constructor (Object)
    }
    
    //Constructor initializing only the essential fields
    public MealInfo(String idMeal, String strMeal, String strMealThumb) 
    {
        this.idMeal = idMeal;       //Set meal ID
        this.strMeal = strMeal;     //Set meal name
        this.strMealThumb = strMealThumb; //Set meal thumbnail
    }
    
    //Constructor that initializes all possible fields of a MealInfo object
    public MealInfo(String idMeal, String strMeal, String strMealAlternate, String strCategory, String strArea,
                String strInstructions, String strMealThumb, String strTags, String strYoutube,
                String strIngredient1, String strIngredient2, String strIngredient3, String strIngredient4,
                String strIngredient5, String strIngredient6, String strIngredient7, String strIngredient8,
                String strIngredient9, String strIngredient10, String strIngredient11, String strIngredient12,
                String strIngredient13, String strIngredient14, String strIngredient15, String strIngredient16,
                String strIngredient17, String strIngredient18, String strIngredient19, String strIngredient20,
                String strMeasure1, String strMeasure2, String strMeasure3, String strMeasure4, String strMeasure5,
                String strMeasure6, String strMeasure7, String strMeasure8, String strMeasure9, String strMeasure10,
                String strMeasure11, String strMeasure12, String strMeasure13, String strMeasure14, String strMeasure15,
                String strMeasure16, String strMeasure17, String strMeasure18, String strMeasure19, String strMeasure20,
                String strSource, String strImageSource, String strCreativeCommonsConfirmed, String dateModified) 
    {
    
        //Sets the unique identifier for the meal
        this.idMeal = idMeal;
        
        //Sets the name of the meal
        this.strMeal = strMeal;
        
        //Sets the alternate name of the meal
        this.strMealAlternate = strMealAlternate;
        
        //Sets the meal category (e.g., Dessert, Seafood)
        this.strCategory = strCategory;
        
        //Sets the meal's regional cuisine or origin
        this.strArea = strArea;
        
        //Sets the preparation instructions for the meal
        this.strInstructions = strInstructions;
        
        //Sets the URL for the meal's thumbnail image
        this.strMealThumb = strMealThumb;
        
        //Sets tags for the meal (comma-separated keywords)
        this.strTags = strTags;
        
        //Sets the YouTube link for the meal's preparation video
        this.strYoutube = strYoutube;
        
        //Sets all 20 ingredients of the meal individually
        this.strIngredient1 = strIngredient1;
        this.strIngredient2 = strIngredient2;
        this.strIngredient3 = strIngredient3;
        this.strIngredient4 = strIngredient4;
        this.strIngredient5 = strIngredient5;
        this.strIngredient6 = strIngredient6;
        this.strIngredient7 = strIngredient7;
        this.strIngredient8 = strIngredient8;
        this.strIngredient9 = strIngredient9;
        this.strIngredient10 = strIngredient10;
        this.strIngredient11 = strIngredient11;
        this.strIngredient12 = strIngredient12;
        this.strIngredient13 = strIngredient13;
        this.strIngredient14 = strIngredient14;
        this.strIngredient15 = strIngredient15;
        this.strIngredient16 = strIngredient16;
        this.strIngredient17 = strIngredient17;
        this.strIngredient18 = strIngredient18;
        this.strIngredient19 = strIngredient19;
        this.strIngredient20 = strIngredient20;
        
        //Sets all 20 corresponding measurements for the ingredients
        this.strMeasure1 = strMeasure1;
        this.strMeasure2 = strMeasure2;
        this.strMeasure3 = strMeasure3;
        this.strMeasure4 = strMeasure4;
        this.strMeasure5 = strMeasure5;
        this.strMeasure6 = strMeasure6;
        this.strMeasure7 = strMeasure7;
        this.strMeasure8 = strMeasure8;
        this.strMeasure9 = strMeasure9;
        this.strMeasure10 = strMeasure10;
        this.strMeasure11 = strMeasure11;
        this.strMeasure12 = strMeasure12;
        this.strMeasure13 = strMeasure13;
        this.strMeasure14 = strMeasure14;
        this.strMeasure15 = strMeasure15;
        this.strMeasure16 = strMeasure16;
        this.strMeasure17 = strMeasure17;
        this.strMeasure18 = strMeasure18;
        this.strMeasure19 = strMeasure19;
        this.strMeasure20 = strMeasure20;
        
        //Sets the original source URL for the meal (if provided)
        this.strSource = strSource;
        
        //Sets the image source URL (if different from strMealThumb)
        this.strImageSource = strImageSource;
        
        //Sets the Creative Commons confirmation status for the recipe
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
        
        //Sets the last modification date of the meal record
        this.dateModified = dateModified;
    }


    //Returns the unique ID of the meal
    public String getIdMeal()
    {
        return idMeal;
    }
    
    //Sets the unique ID of the meal
    public void setIdMeal(String idMeal)
    {
        this.idMeal = idMeal;
    }
    
    //Returns the main name of the meal
    public String getStrMeal()
    {
        return strMeal;
    }
    
    //Sets the main name of the meal
    public void setStrMeal(String strMeal)
    {
        this.strMeal = strMeal;
    }
    
    //Returns the alternative name of the meal
    public String getStrMealAlternate()
    {
        return strMealAlternate;
    }
    
    //Sets the alternative name of the meal
    public void setStrMealAlternate(String strMealAlternate)
    {
        this.strMealAlternate = strMealAlternate;
    }
    
    //Returns the category of the meal (e.g., Beef, Dessert)
    public String getStrCategory()
    {
        return strCategory;
    }
    
    //Sets the category of the meal
    public void setStrCategory(String strCategory)
    {
        this.strCategory = strCategory;
    }
    
    //Returns the area (country or cuisine) of the meal
    public String getStrArea()
    {
        return strArea;
    }
    
    //Sets the area (country or cuisine) of the meal
    public void setStrArea(String strArea)
    {
        this.strArea = strArea;
    }
    
    //Returns the cooking instructions for the meal
    public String getStrInstructions()
    {
        return strInstructions;
    }
    
    //Sets the cooking instructions for the meal
    public void setStrInstructions(String strInstructions)
    {
        this.strInstructions = strInstructions;
    }
    
    //Returns the URL of the meal's thumbnail image
    public String getStrMealThumb()
    {
        return strMealThumb;
    }
    
    //Sets the URL of the meal's thumbnail image
    public void setStrMealThumb(String strMealThumb)
    {
        this.strMealThumb = strMealThumb;
    }
    
    //Returns the tags associated with the meal
    public String getStrTags()
    {
        return strTags;
    }
    
    //Sets the tags associated with the meal
    public void setStrTags(String strTags)
    {
        this.strTags = strTags;
    }
    
    //Returns the YouTube video URL of the recipe
    public String getStrYoutube()
    {
        return strYoutube;
    }
    
    //Sets the YouTube video URL of the recipe
    public void setStrYoutube(String strYoutube)
    {
        this.strYoutube = strYoutube;
    }
    
    //Returns ingredient 1
    public String getStrIngredient1()
    {
        return strIngredient1;
    }
    
    //Sets ingredient 1
    public void setStrIngredient1(String strIngredient1)
    {
        this.strIngredient1 = strIngredient1;
    }
    
    //Returns ingredient 2
    public String getStrIngredient2()
    {
        return strIngredient2;
    }
    
    //Sets ingredient 2
    public void setStrIngredient2(String strIngredient2)
    {
        this.strIngredient2 = strIngredient2;
    }
    
    //Returns ingredient 3
    public String getStrIngredient3()
    {
        return strIngredient3;
    }
    
    //Sets ingredient 3
    public void setStrIngredient3(String strIngredient3)
    {
        this.strIngredient3 = strIngredient3;
    }
    
    //Returns ingredient 4
    public String getStrIngredient4()
    {
        return strIngredient4;
    }
    
    //Sets ingredient 4
    public void setStrIngredient4(String strIngredient4)
    {
        this.strIngredient4 = strIngredient4;
    }
    
    //Returns ingredient 5
    public String getStrIngredient5()
    {
        return strIngredient5;
    }
    
    //Sets ingredient 5
    public void setStrIngredient5(String strIngredient5)
    {
        this.strIngredient5 = strIngredient5;
    }
    
    //Returns ingredient 6
    public String getStrIngredient6()
    {
        return strIngredient6;
    }
    
    //Sets ingredient 6
    public void setStrIngredient6(String strIngredient6)
    {
        this.strIngredient6 = strIngredient6;
    }
    
    //Returns ingredient 7
    public String getStrIngredient7()
    {
        return strIngredient7;
    }
    
    //Sets ingredient 7
    public void setStrIngredient7(String strIngredient7)
    {
        this.strIngredient7 = strIngredient7;
    }
    
    //Returns ingredient 8
    public String getStrIngredient8()
    {
        return strIngredient8;
    }
    
    //Sets ingredient 8
    public void setStrIngredient8(String strIngredient8)
    {
        this.strIngredient8 = strIngredient8;
    }
    
    //Returns ingredient 9
    public String getStrIngredient9()
    {
        return strIngredient9;
    }
    
    //Sets ingredient 9
    public void setStrIngredient9(String strIngredient9)
    {
        this.strIngredient9 = strIngredient9;
    }
    
    //Returns ingredient 10
    public String getStrIngredient10()
    {
        return strIngredient10;
    }
    
    //Sets ingredient 10
    public void setStrIngredient10(String strIngredient10)
    {
        this.strIngredient10 = strIngredient10;
    }
    
    //Returns ingredient 11
    public String getStrIngredient11()
    {
        return strIngredient11;
    }
    
    //Sets ingredient 11
    public void setStrIngredient11(String strIngredient11)
    {
        this.strIngredient11 = strIngredient11;
    }
    
    //Returns ingredient 12
    public String getStrIngredient12()
    {
        return strIngredient12;
    }
    
    //Sets ingredient 12
    public void setStrIngredient12(String strIngredient12)
    {
        this.strIngredient12 = strIngredient12;
    }
    
    //Returns ingredient 13
    public String getStrIngredient13()
    {
        return strIngredient13;
    }
    
    //Sets ingredient 13
    public void setStrIngredient13(String strIngredient13)
    {
        this.strIngredient13 = strIngredient13;
    }
    
    //Returns ingredient 14
    public String getStrIngredient14()
    {
        return strIngredient14;
    }
    
    //Sets ingredient 14
    public void setStrIngredient14(String strIngredient14)
    {
        this.strIngredient14 = strIngredient14;
    }
    
    //Returns ingredient 15
    public String getStrIngredient15()
    {
        return strIngredient15;
    }
    
    //Sets ingredient 15
    public void setStrIngredient15(String strIngredient15)
    {
        this.strIngredient15 = strIngredient15;
    }
    
    //Returns ingredient 16
    public String getStrIngredient16()
    {
        return strIngredient16;
    }
    
    //Sets ingredient 16
    public void setStrIngredient16(String strIngredient16)
    {
        this.strIngredient16 = strIngredient16;
    }
    
    //Returns ingredient 17
    public String getStrIngredient17()
    {
        return strIngredient17;
    }
    
    //Sets ingredient 17
    public void setStrIngredient17(String strIngredient17)
    {
        this.strIngredient17 = strIngredient17;
    }
    
    //Returns ingredient 18
    public String getStrIngredient18()
    {
        return strIngredient18;
    }
    
    //Sets ingredient 18
    public void setStrIngredient18(String strIngredient18)
    {
        this.strIngredient18 = strIngredient18;
    }
    
    //Returns ingredient 19
    public String getStrIngredient19()
    {
        return strIngredient19;
    }
    
    //Sets ingredient 19
    public void setStrIngredient19(String strIngredient19)
    {
        this.strIngredient19 = strIngredient19;
    }
    
    //Returns ingredient 20
    public String getStrIngredient20()
    {
        return strIngredient20;
    }
    
    //Sets ingredient 20
    public void setStrIngredient20(String strIngredient20)
    {
        this.strIngredient20 = strIngredient20;
    }
    
    //Returns the first ingredient measurement
    public String getStrMeasure1()
    {
        return strMeasure1;
    }
    
    //Sets the first ingredient measurement
    public void setStrMeasure1(String strMeasure1)
    {
        this.strMeasure1 = strMeasure1;
    }
    
    //Returns the second ingredient measurement
    public String getStrMeasure2() 
    {
        return strMeasure2;
    }
    
    //Sets the second ingredient measurement
    public void setStrMeasure2(String strMeasure2) 
    {
        this.strMeasure2 = strMeasure2;
    }
    
    //Returns the third ingredient measurement
    public String getStrMeasure3() 
    {
        return strMeasure3;
    }
    
    //Sets the third ingredient measurement
    public void setStrMeasure3(String strMeasure3) 
    {
        this.strMeasure3 = strMeasure3;
    }
    
    //Returns the fourth ingredient measurement
    public String getStrMeasure4() 
    {
        return strMeasure4;
    }
    
    //Sets the fourth ingredient measurement
    public void setStrMeasure4(String strMeasure4) 
    {
        this.strMeasure4 = strMeasure4;
    }
    
    //Returns the fifth ingredient measurement
    public String getStrMeasure5() 
    {
        return strMeasure5;
    }
    
    //Sets the fifth ingredient measurement
    public void setStrMeasure5(String strMeasure5) 
    {
        this.strMeasure5 = strMeasure5;
    }
    
    //Returns the sixth ingredient measurement
    public String getStrMeasure6() 
    {
        return strMeasure6;
    }
    
    //Sets the sixth ingredient measurement
    public void setStrMeasure6(String strMeasure6) 
    {
        this.strMeasure6 = strMeasure6;
    }
    
    //Returns the seventh ingredient measurement
    public String getStrMeasure7() 
    {
        return strMeasure7;
    }
    
    //Sets the seventh ingredient measurement
    public void setStrMeasure7(String strMeasure7) 
    {
        this.strMeasure7 = strMeasure7;
    }
    
    //Returns the eighth ingredient measurement
    public String getStrMeasure8() 
    {
        return strMeasure8;
    }
    
    //Sets the eighth ingredient measurement
    public void setStrMeasure8(String strMeasure8) 
    {
        this.strMeasure8 = strMeasure8;
    }
    
    //Returns the ninth ingredient measurement
    public String getStrMeasure9() {
        return strMeasure9;
    }
    
    //Sets the ninth ingredient measurement
    public void setStrMeasure9(String strMeasure9) 
    {
        this.strMeasure9 = strMeasure9;
    }
    
    //Returns the tenth ingredient measurement
    public String getStrMeasure10() 
    {
        return strMeasure10;
    }
    
    //Sets the tenth ingredient measurement
    public void setStrMeasure10(String strMeasure10) 
    {
        this.strMeasure10 = strMeasure10;
    }
    
    //Returns the eleventh ingredient measurement
    public String getStrMeasure11() {
        return strMeasure11;
    }
    
    //Sets the eleventh ingredient measurement
    public void setStrMeasure11(String strMeasure11) 
    {
        this.strMeasure11 = strMeasure11;
    }
    
    //Returns the twelfth ingredient measurement
    public String getStrMeasure12() 
    {
        return strMeasure12;
    }
    
    //Sets the twelfth ingredient measurement
    public void setStrMeasure12(String strMeasure12) 
    {
        this.strMeasure12 = strMeasure12;
    }
    
    //Returns the thirteenth ingredient measurement
    public String getStrMeasure13() 
    {
        return strMeasure13;
    }
    
    //Sets the thirteenth ingredient measurement
    public void setStrMeasure13(String strMeasure13) 
    {
        this.strMeasure13 = strMeasure13;
    }
    
    //Returns the fourteenth ingredient measurement
    public String getStrMeasure14() 
    {
        return strMeasure14;
    }
    
    //Sets the fourteenth ingredient measurement
    public void setStrMeasure14(String strMeasure14) 
    {
        this.strMeasure14 = strMeasure14;
    }
    
    //Returns the fifteenth ingredient measurement
    public String getStrMeasure15() 
    {
        return strMeasure15;
    }
    
    //Sets the fifteenth ingredient measurement
    public void setStrMeasure15(String strMeasure15) 
    {
        this.strMeasure15 = strMeasure15;
    }
    
    //Returns the sixteenth ingredient measurement
    public String getStrMeasure16() 
    {
        return strMeasure16;
    }
    
    //Sets the sixteenth ingredient measurement
    public void setStrMeasure16(String strMeasure16) 
    {
        this.strMeasure16 = strMeasure16;
    }
    
    //Returns the seventeenth ingredient measurement
    public String getStrMeasure17() 
    {
        return strMeasure17;
    }
    
    //Sets the seventeenth ingredient measurement
    public void setStrMeasure17(String strMeasure17) 
    {
        this.strMeasure17 = strMeasure17;
    }
    
    //Returns the eighteenth ingredient measurement
    public String getStrMeasure18() 
    {
        return strMeasure18;
    }
    
    //Sets the eighteenth ingredient measurement
    public void setStrMeasure18(String strMeasure18) 
    {
        this.strMeasure18 = strMeasure18;
    }
    
    //Returns the nineteenth ingredient measurement
    public String getStrMeasure19() 
    {
        return strMeasure19;
    }
    
    //Sets the nineteenth ingredient measurement
    public void setStrMeasure19(String strMeasure19) 
    {
        this.strMeasure19 = strMeasure19;
    }
    
    //Returns the twentieth ingredient measurement
    public String getStrMeasure20()
    {
        return strMeasure20;
    }
    
    //Sets the twentieth ingredient measurement
    public void setStrMeasure20(String strMeasure20)
    {
        this.strMeasure20 = strMeasure20;
    }
    
    //Returns the original recipe source (e.g., website URL)
    public String getStrSource()
    {
        return strSource;
    }
    
    //Sets the recipe source
    public void setStrSource(String strSource)
    {
        this.strSource = strSource;
    }
    
    //Returns the image source URL
    public String getStrImageSource()
    {
        return strImageSource;
    }
    
    //Sets the image source URL
    public void setStrImageSource(String strImageSource)
    {
        this.strImageSource = strImageSource;
    }
    
    //Returns whether the recipe is Creative Commons confirmed
    public String getStrCreativeCommonsConfirmed()
    {
        return strCreativeCommonsConfirmed;
    }
    
    //Sets the Creative Commons confirmation flag
    public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed)
    {
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
    }
    
    //Returns the last modification date of the meal
    public String getDateModified()
    {
        return dateModified;
    }
    
    //Sets the last modification date of the meal
    public void setDateModified(String dateModified)
    {
        this.dateModified = dateModified;
    }
    
    
    //Overrides equals to compare MealInfo objects based on their meal ID
    @Override
    public boolean equals(Object obj) 
    {
        return idMeal.equals(((MealInfo)obj).getIdMeal());
    }
    
    
    //Overrides the default toString() method to provide a detailed textual representation of the MealInfo object
    @Override
    public String toString() 
    {
    
        //Builds and returns a formatted string that contains all fields of the MealInfo object
        return 
                //Adds the unique meal ID
               "MealInfo{idMeal='" + getIdMeal() + 
    
               //Adds the main meal name
               "'\n, strMeal='" + getStrMeal() + 
    
               //Adds the alternative meal name
               "'\n, strMealAlternate='" + getStrMealAlternate() + 
    
               //Adds the meal category (e.g., Beef, Dessert)
               "'\n, strCategory='" + getStrCategory() + 
    
               //Adds the cuisine or country of origin
               "'\n, strArea='" + getStrArea() + 
    
               //Adds the cooking instructions
               "'\n, strInstructions='" + getStrInstructions() + 
    
               //Adds the URL of the meal image
               "'\n, strMealThumb='" + getStrMealThumb() + 
    
               //Adds any tags associated with the meal
               "'\n, strTags='" + getStrTags() + 
    
               //Adds the YouTube video link of the recipe
               "'\n, strYoutube='" + getStrYoutube() + 
    
               //Adds ingredient 1
               "'\n, strIngredient1='" + getStrIngredient1() + 
    
               //Adds ingredient 2
               "'\n, strIngredient2='" + getStrIngredient2() + 
    
               //Adds ingredient 3
               "'\n, strIngredient3='" + getStrIngredient3() + 
    
               //Adds ingredient 4
               "'\n, strIngredient4='" + getStrIngredient4() + 
    
               //Adds ingredient 5
               "'\n, strIngredient5='" + getStrIngredient5() + 
    
               //Adds ingredient 6
               "'\n, strIngredient6='" + getStrIngredient6() + 
    
               //Adds ingredient 7
               "'\n, strIngredient7='" + getStrIngredient7() + 
    
               //Adds ingredient 8
               "'\n, strIngredient8='" + getStrIngredient8() + 
    
               //Adds ingredient 9
               "'\n, strIngredient9='" + getStrIngredient9() + 
    
               //Adds ingredient 10
               "'\n, strIngredient10='" + getStrIngredient10() + 
    
               //Adds ingredient 11
               "'\n, strIngredient11='" + getStrIngredient11() + 
    
               //Adds ingredient 12
               "'\n, strIngredient12='" + getStrIngredient12() + 
    
               //Adds ingredient 13
               "'\n, strIngredient13='" + getStrIngredient13() + 
    
               //Adds ingredient 14
               "'\n, strIngredient14='" + getStrIngredient14() + 
    
               //Adds ingredient 15
               "'\n, strIngredient15='" + getStrIngredient15() + 
    
               //Adds ingredient 16
               "'\n, strIngredient16='" + getStrIngredient16() + 
    
               //Adds ingredient 17
               "'\n, strIngredient17='" + getStrIngredient17() + 
    
               //Adds ingredient 18
               "'\n, strIngredient18='" + getStrIngredient18() + 
    
               //Adds ingredient 19
               "'\n, strIngredient19='" + getStrIngredient19() + 
    
               //Adds ingredient 20
               "'\n, strIngredient20='" + getStrIngredient20() + 
    
               //Adds measurement 1
               "'\n, strMeasure1='" + getStrMeasure1() + 
    
               //Adds measurement 2
               "'\n, strMeasure2='" + getStrMeasure2() + 
    
               //Adds measurement 3
               "'\n, strMeasure3='" + getStrMeasure3() + 
    
               //Adds measurement 4
               "'\n, strMeasure4='" + getStrMeasure4() + 
    
               //Adds measurement 5
               "'\n, strMeasure5='" + getStrMeasure5() + 
    
               //Adds measurement 6
               "'\n, strMeasure6='" + getStrMeasure6() + 
    
               //Adds measurement 7
               "'\n, strMeasure7='" + getStrMeasure7() + 
    
               //Adds measurement 8
               "'\n, strMeasure8='" + getStrMeasure8() + 
    
               //Adds measurement 9
               "'\n, strMeasure9='" + getStrMeasure9() + 
    
               //Adds measurement 10
               "'\n, strMeasure10='" + getStrMeasure10() + 
    
               //Adds measurement 11
               "'\n, strMeasure11='" + getStrMeasure11() + 
    
               //Adds measurement 12
               "'\n, strMeasure12='" + getStrMeasure12() + 
    
               //Adds measurement 13
               "'\n, strMeasure13='" + getStrMeasure13() + 
    
               //Adds measurement 14
               "'\n, strMeasure14='" + getStrMeasure14() + 
    
               //Adds measurement 15
               "'\n, strMeasure15='" + getStrMeasure15() + 
    
               //Adds measurement 16
               "'\n, strMeasure16='" + getStrMeasure16() + 
    
               //Adds measurement 17
               "'\n, strMeasure17='" + getStrMeasure17() + 
    
               //Adds measurement 18
               "'\n, strMeasure18='" + getStrMeasure18() + 
    
               //Adds measurement 19
               "'\n, strMeasure19='" + getStrMeasure19() + 
    
               //Adds measurement 20
               "'\n, strMeasure20='" + getStrMeasure20() + 
    
               //Adds the original source of the recipe
               "'\n, strSource='" + getStrSource() + 
    
               //Adds the image source URL
               "'\n, strImageSource='" + getStrImageSource() + 
    
               //Adds Creative Commons confirmation flag
               "'\n, strCreativeCommonsConfirmed='" + getStrCreativeCommonsConfirmed() + 
    
               //Adds the last modification date
               "'\n, dateModified='" + getDateModified() + 
    
               //Closes the MealInfo object representation
               "'\n}";
    }
}


