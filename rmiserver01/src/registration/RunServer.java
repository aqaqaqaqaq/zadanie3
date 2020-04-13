/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

/**
 *
 * @author Dima
 */
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import operation.MessageImpl;
public class RunServer {

public static void main (String[] argv) {

try {
// создание экземпляров классов для регистрации
MessageImpl message = new MessageImpl();
// создаём реестр
Registry registry = LocateRegistry.createRegistry(12345);
// регистрация классов
registry.bind("rmiTest01", message);
System.out.println ("Message Server is ready.");
} 
catch (Exception e) {
System.out.println ("Message Server failed: " + e);
}

}

}
