package org.example.logging;

// Hem soyut - hem somut işlevler içerebilen yapılardır.
public abstract class BaseLogger implements Logger
{
    public void logMessage(String message)
    {
        System.out.println("Önce console'a loglandı:"+message);
        log(message);
    }
}
