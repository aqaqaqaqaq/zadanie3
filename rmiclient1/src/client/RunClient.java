/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.rmi.Naming;
import operation.Message;
public class RunClient {

public static void main (String[] argv) {

try {
// вызывается метод lookup класса Naming для получения удаленной ссылки на удаленный объект Message с заданным URL.
    Message message = (Message)Naming.lookup("//localhost:12345/rmiTest01");
    System.out.println (message.getMessage());
} catch (Exception e) {
    System.out.println ("Message Client exception: " + e);
}
}
}