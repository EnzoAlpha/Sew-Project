/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.rmi.*;
// DDOSService Interface
// Interface for a RMI service that will actually attack on a target machine
public interface DDOSService extends java.rmi.Remote
{
public String attack ( )
throws RemoteException;
}
