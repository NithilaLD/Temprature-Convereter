package com.mycompany.question14;
public class AppletObject 
{
    String type,text,ans;
    public AppletObject(String type, String text)
    {
        this.type = type;
        this.text = text;
    }
    public String CalculateResult()
    {
        if(text.isEmpty())
        {
            ans="Enter A Value";
        }
        else if (type=="c")
        {
            ans=Double.toString(((Double.parseDouble(text)+32)*9)/5);
        } 
        else if(type=="k")
        {
            ans=Double.toString(((Double.parseDouble(text)+32)*9)/5+273.15);
        }
        else
        {
            ans="Select A Option";
        }
        return ans;
    }
    
}
