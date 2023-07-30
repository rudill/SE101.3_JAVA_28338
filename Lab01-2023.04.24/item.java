//item class
package com.mycompany.q7;

public class item 
{
    private int location;
    private String description;
    
    public item(int location, String description)
    {
        this.location=location;
        this.description=description;
    }
    public void setlocation(int location)
    {
        this.location=location;
    }
    public int getlocation()
    {
        return location;
    }
    public void setdescription(String description)
    {
        this.description=description;
    }
    public String getdescription()
    {
        return description;
    }
}
