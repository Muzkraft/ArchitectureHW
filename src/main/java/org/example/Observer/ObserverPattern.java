package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

interface Subject
{
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers();
}

class Location implements Subject
{
    private List<Observer> observers;
    private String location;

    public Location()
    {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj)
    {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj)
    {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers()
    {
        for(Observer obj : observers)
        {
            obj.update(location);
        }
    }

    public void locationChanged()
    {
        this.location = getLocation();
        notifyObservers();
    }

    public String getLocation()
    {
        return "Some place";
    }
}


interface Observer
{
    public void update(String location);
}


class HeroLocation implements Observer
{
    private String location;

    @Override
    public void update(String location)
    {
        this.location = location;
        showLocation();
    }

    public void showLocation()
    {
        System.out.println( "Hero current Location: " + location);
    }
}

class TargetLocation implements Observer
{
    private String location;

    @Override
    public void update(String location)
    {
        this.location = location;
        showLocation();
    }

    public void showLocation()
    {
        System.out.println("Target current location: " + location);
    }
}

class WarriorsGuild implements Observer
{
    private String location;

    @Override
    public void update(String location)
    {
        this.location = location;
        showLocation();
    }

    public void showLocation()
    {
        System.out.println("Notification at Warriors guild - Current Location: " + location);
    }
}

public class ObserverPattern
{
    public static void main(String[] args)
    {
        Location topic = new Location();

        Observer obj1 = new HeroLocation();
        Observer obj2 = new TargetLocation();
        Observer obj3 = new WarriorsGuild();

        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        topic.locationChanged();
        topic.unregister(obj3);

        System.out.println();
        topic.locationChanged();
    }
}

