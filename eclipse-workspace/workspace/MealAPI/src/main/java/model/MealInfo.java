//Class «MealInfo» belongs to package «model»
package model;

//POJOs Class «MealInfo» for saving data from the REST API of THEMEALDB
public class MealInfo 
{
    //Meal ID declaration
    private String idMeal;
    
    //Meal name declaration
    private String strMeal;
    
    //Alternate name declaration
    private String strMealAlternate;
    
    //Meal category declaration
    private String strCategory;
    
    //Meal origin country declaration
    private String strArea;
    
    //Meal instructions declaration
    private String strInstructions;
    
    //Meal image linh declaration
    private String strMealThumb;
    
    //Ingredients categories per meal declaration
    private String strTags;
    
    //YouTube link declaration
    private String strYoutube;
    
    //Meal ingredients declaration
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
    
    //Meal ingredients measurements declaration
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
    
    //Meal source declaration
    private String strSource;
    
    //Meal image source declaration
    private String strImageSource;
    
    //Meal or meal image availability with license Creative Commons declaration
    private String strCreativeCommonsConfirmed;
    
    //Date of last modification of meal declaration
    private String dateModified;
    
    //No-argument constructor for creating a meal
    public MealInfo() 
    {
        super();
    }
    
    //Constructor for creating a meal with ID, name and image link
    public MealInfo(String idMeal, String strMeal, String strMealThumb) 
    {
        this.idMeal = idMeal;
        this.strMeal = strMeal;
        this.strMealThumb = strMealThumb;
    }
    
    //Constructor for creating a meal with ID, name, alternatate meal, category, origin country, instructions, image link, ingredients category, Youtube link, ingredients, ingredients measurements, source, image source, availability with lisence Creative Commons and date of last modification 
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
    
        //Set meal ID
        this.idMeal = idMeal;
        
        //Set name of the meal
        this.strMeal = strMeal;
        
        //Set alternate meal
        this.strMealAlternate = strMealAlternate;
        
        //Set meal category
        this.strCategory = strCategory;
        
        //Set meal origin country
        this.strArea = strArea;
        
        //Set meal instructions
        this.strInstructions = strInstructions;
        
        //Set meal image link
        this.strMealThumb = strMealThumb;
        
        //Set ingredients category per meal
        this.strTags = strTags;
        
        //Set YouTube link
        this.strYoutube = strYoutube;
        
        //Set 20 ingredients of meal individually
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
        
        //Set 20 ingredients measurements of meal
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
        
        //Set meal source
        this.strSource = strSource;
        
        //Set meal image source
        this.strImageSource = strImageSource;
        
        //Set meal or meal source with license Creative Commons
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
        
        //Set date of last modification of meal declaration
        this.dateModified = dateModified;
    }


    //Return meal ID
    public String getIdMeal()
    {
        return idMeal;
    }
    
    //Set meal ID
    public void setIdMeal(String idMeal)
    {
        this.idMeal = idMeal;
    }
    
    //Return meal name
    public String getStrMeal()
    {
        return strMeal;
    }
    
    //Set meal name
    public void setStrMeal(String strMeal)
    {
        this.strMeal = strMeal;
    }
    
    //Return alternative meal
    public String getStrMealAlternate()
    {
        return strMealAlternate;
    }
    
    //Set alternative meal
    public void setStrMealAlternate(String strMealAlternate)
    {
        this.strMealAlternate = strMealAlternate;
    }
    
    //Return meal category
    public String getStrCategory()
    {
        return strCategory;
    }
    
    //Set meal category
    public void setStrCategory(String strCategory)
    {
        this.strCategory = strCategory;
    }
    
    //Return meal origin country
    public String getStrArea()
    {
        return strArea;
    }
    
    //Set meal origin country
    public void setStrArea(String strArea)
    {
        this.strArea = strArea;
    }
    
    //Return meal instructions
    public String getStrInstructions()
    {
        return strInstructions;
    }
    
    //Set meal instructions
    public void setStrInstructions(String strInstructions)
    {
        this.strInstructions = strInstructions;
    }
    
    //Return meal image link
    public String getStrMealThumb()
    {
        return strMealThumb;
    }
    
    //Set meal image link
    public void setStrMealThumb(String strMealThumb)
    {
        this.strMealThumb = strMealThumb;
    }
    
    //Return ingredients category per meal
    public String getStrTags()
    {
        return strTags;
    }
    
    //Set ingredients category per meal
    public void setStrTags(String strTags)
    {
        this.strTags = strTags;
    }
    
    //Return YouTube link
    public String getStrYoutube()
    {
        return strYoutube;
    }
    
    //Set YouTube link
    public void setStrYoutube(String strYoutube)
    {
        this.strYoutube = strYoutube;
    }
    
    //Return first ingredient of meal
    public String getStrIngredient1()
    {
        return strIngredient1;
    }
    
    //Set first ingredient of meal
    public void setStrIngredient1(String strIngredient1)
    {
        this.strIngredient1 = strIngredient1;
    }
    
    //Return second ingredient of meal 
    public String getStrIngredient2()
    {
        return strIngredient2;
    }
    
    //Set second ingredient of meal
    public void setStrIngredient2(String strIngredient2)
    {
        this.strIngredient2 = strIngredient2;
    }
    
    //Return third ingredient of meal
    public String getStrIngredient3()
    {
        return strIngredient3;
    }
    
    //Set third ingredient of meal
    public void setStrIngredient3(String strIngredient3)
    {
        this.strIngredient3 = strIngredient3;
    }
    
    //Return fourth ingredient of meal
    public String getStrIngredient4()
    {
        return strIngredient4;
    }
    
    //Set fourth ingredient of meal
    public void setStrIngredient4(String strIngredient4)
    {
        this.strIngredient4 = strIngredient4;
    }
    
    //Return fifth ingredient of meal
    public String getStrIngredient5()
    {
        return strIngredient5;
    }
    
    //Set fifth ingredient of meal
    public void setStrIngredient5(String strIngredient5)
    {
        this.strIngredient5 = strIngredient5;
    }
    
    //Return sixth ingredient of meal
    public String getStrIngredient6()
    {
        return strIngredient6;
    }
    
    //Set sixth ingredient of meal
    public void setStrIngredient6(String strIngredient6)
    {
        this.strIngredient6 = strIngredient6;
    }
    
    //Return seventh ingredient of meal
    public String getStrIngredient7()
    {
        return strIngredient7;
    }
    
    //Set seventh ingredient of meal
    public void setStrIngredient7(String strIngredient7)
    {
        this.strIngredient7 = strIngredient7;
    }
    
    //Return eighth ingredient of meal
    public String getStrIngredient8()
    {
        return strIngredient8;
    }
    
    //Set eighth ingredient of meal
    public void setStrIngredient8(String strIngredient8)
    {
        this.strIngredient8 = strIngredient8;
    }
    
    //Return ninth ingredient of meal
    public String getStrIngredient9()
    {
        return strIngredient9;
    }
    
    //Set ninth ingredient of meal
    public void setStrIngredient9(String strIngredient9)
    {
        this.strIngredient9 = strIngredient9;
    }
    
    //Return tenth ingredient of meal
    public String getStrIngredient10()
    {
        return strIngredient10;
    }
    
    //Set tenth ingredient of meal
    public void setStrIngredient10(String strIngredient10)
    {
        this.strIngredient10 = strIngredient10;
    }
    
    //Return eleventh ingredient of meal
    public String getStrIngredient11()
    {
        return strIngredient11;
    }
    
    //Set eleventh ingredient of meal
    public void setStrIngredient11(String strIngredient11)
    {
        this.strIngredient11 = strIngredient11;
    }
    
    //Return twelfth ingredient of meal
    public String getStrIngredient12()
    {
        return strIngredient12;
    }
    
    //Set twelfth ingredient of meal
    public void setStrIngredient12(String strIngredient12)
    {
        this.strIngredient12 = strIngredient12;
    }
    
    //Return thirteenth ingredient of meal
    public String getStrIngredient13()
    {
        return strIngredient13;
    }
    
    //Set thirteenth ingredient of meal
    public void setStrIngredient13(String strIngredient13)
    {
        this.strIngredient13 = strIngredient13;
    }
    
    //Return fourteenth ingredient of meal
    public String getStrIngredient14()
    {
        return strIngredient14;
    }
    
    //Set fourteenth ingredient of meal
    public void setStrIngredient14(String strIngredient14)
    {
        this.strIngredient14 = strIngredient14;
    }
    
    //Return fifteenth ingredient of meal
    public String getStrIngredient15()
    {
        return strIngredient15;
    }
    
    //Set fifteenth ingredient of meal
    public void setStrIngredient15(String strIngredient15)
    {
        this.strIngredient15 = strIngredient15;
    }
    
    //Return sixteenth ingredient of meal
    public String getStrIngredient16()
    {
        return strIngredient16;
    }
    
    //Set sixteenth ingredient of meal
    public void setStrIngredient16(String strIngredient16)
    {
        this.strIngredient16 = strIngredient16;
    }
    
    //Return seventeenth ingredient of meal
    public String getStrIngredient17()
    {
        return strIngredient17;
    }
    
    //Set seventeenth ingredient of meal
    public void setStrIngredient17(String strIngredient17)
    {
        this.strIngredient17 = strIngredient17;
    }
    
    //Return eighteenth ingredient of meal
    public String getStrIngredient18()
    {
        return strIngredient18;
    }
    
    //Set eighteenth ingredient of meal
    public void setStrIngredient18(String strIngredient18)
    {
        this.strIngredient18 = strIngredient18;
    }
    
    //Return nineteenth ingredient of meal
    public String getStrIngredient19()
    {
        return strIngredient19;
    }
    
    //Set nineteenth ingredient of meal
    public void setStrIngredient19(String strIngredient19)
    {
        this.strIngredient19 = strIngredient19;
    }
    
    //Return twentieth ingredient of meal
    public String getStrIngredient20()
    {
        return strIngredient20;
    }
    
    //Set twentieth ingredient of meal
    public void setStrIngredient20(String strIngredient20)
    {
        this.strIngredient20 = strIngredient20;
    }
    
    //Return first ingredient measurement of meal
    public String getStrMeasure1()
    {
        return strMeasure1;
    }
    
    //Set the first ingredient measurement of meal
    public void setStrMeasure1(String strMeasure1)
    {
        this.strMeasure1 = strMeasure1;
    }
    
    //Return second ingredient measurement of meal
    public String getStrMeasure2() 
    {
        return strMeasure2;
    }
    
    //Set the second ingredient measurement of meal
    public void setStrMeasure2(String strMeasure2) 
    {
        this.strMeasure2 = strMeasure2;
    }
    
    //Return third ingredient measurement of meal
    public String getStrMeasure3() 
    {
        return strMeasure3;
    }
    
    //Set the third ingredient measurement of meal
    public void setStrMeasure3(String strMeasure3) 
    {
        this.strMeasure3 = strMeasure3;
    }
    
    //Return fourth ingredient measurement of meal
    public String getStrMeasure4() 
    {
        return strMeasure4;
    }
    
    //Set the fourth ingredient measurement of meal
    public void setStrMeasure4(String strMeasure4) 
    {
        this.strMeasure4 = strMeasure4;
    }
    
    //Return fifth ingredient measurement of meal
    public String getStrMeasure5() 
    {
        return strMeasure5;
    }
    
    //Set the fifth ingredient measurement of meal
    public void setStrMeasure5(String strMeasure5) 
    {
        this.strMeasure5 = strMeasure5;
    }
    
    //Return sixth ingredient measurement of meal
    public String getStrMeasure6() 
    {
        return strMeasure6;
    }
    
    //Set the sixth ingredient measurement of meal
    public void setStrMeasure6(String strMeasure6) 
    {
        this.strMeasure6 = strMeasure6;
    }
    
    //Return seventh ingredient measurement of meal
    public String getStrMeasure7() 
    {
        return strMeasure7;
    }
    
    //Set the seventh ingredient measurement of meal
    public void setStrMeasure7(String strMeasure7) 
    {
        this.strMeasure7 = strMeasure7;
    }
    
    //Return eighth ingredient measurement of meal
    public String getStrMeasure8() 
    {
        return strMeasure8;
    }
    
    //Set the eighth ingredient measurement of meal
    public void setStrMeasure8(String strMeasure8) 
    {
        this.strMeasure8 = strMeasure8;
    }
    
    //Return ninth ingredient measurement of meal
    public String getStrMeasure9() {
        return strMeasure9;
    }
    
    //Set the ninth ingredient measurement of meal
    public void setStrMeasure9(String strMeasure9) 
    {
        this.strMeasure9 = strMeasure9;
    }
    
    //Return tenth ingredient measurement of meal
    public String getStrMeasure10() 
    {
        return strMeasure10;
    }
    
    //Set the tenth ingredient measurement of meal
    public void setStrMeasure10(String strMeasure10) 
    {
        this.strMeasure10 = strMeasure10;
    }
    
    //Return eleventh ingredient measurement of meal
    public String getStrMeasure11() {
        return strMeasure11;
    }
    
    //Set the eleventh ingredient measurement of meal
    public void setStrMeasure11(String strMeasure11) 
    {
        this.strMeasure11 = strMeasure11;
    }
    
    //Return twelfth ingredient measurement of meal
    public String getStrMeasure12() 
    {
        return strMeasure12;
    }
    
    //Set the twelfth ingredient measurement of meal
    public void setStrMeasure12(String strMeasure12) 
    {
        this.strMeasure12 = strMeasure12;
    }
    
    //Return thirteenth ingredient measurement of meal
    public String getStrMeasure13() 
    {
        return strMeasure13;
    }
    
    //Set the thirteenth ingredient measurement of meal
    public void setStrMeasure13(String strMeasure13) 
    {
        this.strMeasure13 = strMeasure13;
    }
    
    //Return fourteenth ingredient measurement of meal
    public String getStrMeasure14() 
    {
        return strMeasure14;
    }
    
    //Set the fourteenth ingredient measurement of meal
    public void setStrMeasure14(String strMeasure14) 
    {
        this.strMeasure14 = strMeasure14;
    }
    
    //Return fifteenth ingredient measurement of meal
    public String getStrMeasure15() 
    {
        return strMeasure15;
    }
    
    //Set the fifteenth ingredient measurement of meal
    public void setStrMeasure15(String strMeasure15) 
    {
        this.strMeasure15 = strMeasure15;
    }
    
    //Return sixteenth ingredient measurement of meal
    public String getStrMeasure16() 
    {
        return strMeasure16;
    }
    
    //Set the sixteenth ingredient measurement of meal
    public void setStrMeasure16(String strMeasure16) 
    {
        this.strMeasure16 = strMeasure16;
    }
    
    //Return seventeenth ingredient measurement of meal
    public String getStrMeasure17() 
    {
        return strMeasure17;
    }
    
    //Set the seventeenth ingredient measurement of meal
    public void setStrMeasure17(String strMeasure17) 
    {
        this.strMeasure17 = strMeasure17;
    }
    
    //Return eighteenth ingredient measurement of meal
    public String getStrMeasure18() 
    {
        return strMeasure18;
    }
    
    //Set the eighteenth ingredient measurement of meal
    public void setStrMeasure18(String strMeasure18) 
    {
        this.strMeasure18 = strMeasure18;
    }
    
    //Return nineteenth ingredient measurement of meal
    public String getStrMeasure19() 
    {
        return strMeasure19;
    }
    
    //Set the nineteenth ingredient measurement of meal
    public void setStrMeasure19(String strMeasure19) 
    {
        this.strMeasure19 = strMeasure19;
    }
    
    //Return twentieth ingredient measurement of meal
    public String getStrMeasure20()
    {
        return strMeasure20;
    }
    
    //Set the twentieth ingredient measurement of meal
    public void setStrMeasure20(String strMeasure20)
    {
        this.strMeasure20 = strMeasure20;
    }
    
    //Return meal source
    public String getStrSource()
    {
        return strSource;
    }
    
    //Set meal source
    public void setStrSource(String strSource)
    {
        this.strSource = strSource;
    }
    
    //Return meal image source
    public String getStrImageSource()
    {
        return strImageSource;
    }
    
    //Set meal image source
    public void setStrImageSource(String strImageSource)
    {
        this.strImageSource = strImageSource;
    }
    
    //Return meal or meal source availability with license Creative Commons
    public String getStrCreativeCommonsConfirmed()
    {
        return strCreativeCommonsConfirmed;
    }
    
    //Set meal or meal source availability with license Creative Commons
    public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed)
    {
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
    }
    
    //Return date of last modification of meal
    public String getDateModified()
    {
        return dateModified;
    }
    
    //Set date of last modification of meal
    public void setDateModified(String dateModified)
    {
        this.dateModified = dateModified;
    }
    
    
    //Comparing two meals by their ID
    @Override
    public boolean equals(Object obj) 
    {
        return idMeal.equals(((MealInfo)obj).getIdMeal());
    }
    
    
    //Formatting the display of meal information
    @Override
    public String toString() 
    {
        return "MealInfo{idMeal='" + getIdMeal() + 
                "'\n, strMeal='" + getStrMeal() + 
                "'\n, strMealAlternate='" + getStrMealAlternate() + 
                "'\n, strCategory='" + getStrCategory() + 
                "'\n, strArea='" + getStrArea() + 
                "'\n, strInstructions='" + getStrInstructions() + 
                "'\n, strMealThumb='" + getStrMealThumb() + 
                "'\n, strTags='" + getStrTags() + 
                "'\n, strYoutube='" + getStrYoutube() + 
                "'\n, strIngredient1='" + getStrIngredient1() 
                + "'\n, strIngredient2='" + getStrIngredient2() 
                + "'\n, strIngredient3='" + getStrIngredient3() 
                + "'\n, strIngredient4='" + getStrIngredient4() 
                + "'\n, strIngredient5='" + getStrIngredient5() 
                + "'\n, strIngredient6='" + getStrIngredient6() 
                + "'\n, strIngredient7='" + getStrIngredient7() 
                + "'\n, strIngredient8='" + getStrIngredient8() 
                + "'\n, strIngredient9='" + getStrIngredient9() 
                + "'\n, strIngredient10='" + getStrIngredient10() 
                + "'\n, strIngredient11='" + getStrIngredient11() 
                + "'\n, strIngredient12='" + getStrIngredient12() 
                + "'\n, strIngredient13='" + getStrIngredient13() 
                + "'\n, strIngredient14='" + getStrIngredient14() 
                + "'\n, strIngredient15='" + getStrIngredient15() 
                + "'\n, strIngredient16='" + getStrIngredient16() 
                + "'\n, strIngredient17='" + getStrIngredient17() 
                + "'\n, strIngredient18='" + getStrIngredient18() 
                + "'\n, strIngredient19='" + getStrIngredient19() 
                + "'\n, strIngredient20='" + getStrIngredient20() 
                + "'\n, strMeasure1='" + getStrMeasure1() 
                + "'\n, strMeasure2='" + getStrMeasure2() 
                + "'\n, strMeasure3='" + getStrMeasure3() 
                + "'\n, strMeasure4='" + getStrMeasure4() 
                + "'\n, strMeasure5='" + getStrMeasure5() 
                + "'\n, strMeasure6='" + getStrMeasure6() 
                + "'\n, strMeasure7='" + getStrMeasure7() 
                + "'\n, strMeasure8='" + getStrMeasure8() 
                + "'\n, strMeasure9='" + getStrMeasure9() 
                + "'\n, strMeasure10='" + getStrMeasure10() 
                + "'\n, strMeasure11='" + getStrMeasure11() 
                + "'\n, strMeasure12='" + getStrMeasure12() 
                + "'\n, strMeasure13='" + getStrMeasure13() 
                + "'\n, strMeasure14='" + getStrMeasure14() 
                + "'\n, strMeasure15='" + getStrMeasure15() 
                + "'\n, strMeasure16='" + getStrMeasure16() 
                + "'\n, strMeasure17='" + getStrMeasure17() 
                + "'\n, strMeasure18='" + getStrMeasure18() 
                + "'\n, strMeasure19='" + getStrMeasure19() 
                + "'\n, strMeasure20='" + getStrMeasure20() 
                + "'\n, strSource='" + getStrSource() 
                + "'\n, strImageSource='" + getStrImageSource() 
                +  "'\n, strCreativeCommonsConfirmed='" + getStrCreativeCommonsConfirmed() 
                + "'\n, dateModified='" + getDateModified() 
                + "'\n}";
    }
}
