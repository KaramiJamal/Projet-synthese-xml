package net.enset;

import jakarta.xml.ws.Endpoint;

public class Main {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8080/", new Banque());
        System.out.println("The server is launched");
    }
}
