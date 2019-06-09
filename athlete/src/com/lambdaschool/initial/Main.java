package com.lambdaschool.initial;

public class Main
{

    public static void main(String[] args)
    {
        MyApplication myAthlete = new MyApplication();
        myAthlete.create("Track");
        myAthlete.create("Hockey");
        myAthlete.create("Rugby");
    }
}

// Dependecy injections

// Constructor injection

// Client(Service service) { this.service = service }

// Setter or field injection

// public void setService(Service service) { this.service = service}

// Interface or method injection

// You'll have an interface

// public interface ServiceInterface

// public class Client implements ServiceInterface

// Inversion of control, when you make others make the work for you, other classes

