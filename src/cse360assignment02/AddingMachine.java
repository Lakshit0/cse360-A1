package cse360assignment02;

import java.util.ArrayList;
import java.util.List;

public class AddingMachine
{
    private int total;
    private List<String> arr = new ArrayList<>();

    public AddingMachine ()
    {
        total = 0;  // not needed - included for clarity
        String temp = total+ "";
        arr.add(temp);
    }

    public int getTotal ()
    {
       return this.total;
    }

    public void add (int value)
    {
        String temp = " + "+value;
        arr.add(temp);
        this.total += value; // to add
    }

    public void subtract (int value)
    {
        String temp = " - "+value;
        arr.add(temp);
        this.total -= value; // to subtract
    }

    public String toString ()
    {
        String result = " ";
        for (String s: arr)
        {
            result += s;
        }
        return result ;
    }

    public void clear()
    {
        arr.clear();
        this.total = 0;
        String temp = 0+"";
        arr.add(temp);  // clear method
    }
    
}