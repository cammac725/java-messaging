package com.lambdaschool.part3InterfaceInjection;

public class Main
{
    public static void main(String[] args)
    {
        String myMsg = "Come here--I want to see you.";
        String myAddress = "Mr. Watson";

        MessageServiceInjector injector;
        Processor app;

        // send Lambda Message
        injector = new LambdaMessageInjector();

//        MyApplication messaging = new MyApplication(new MessageService());
//        messaging.send("Hello there", "cammac725");
    }
}
