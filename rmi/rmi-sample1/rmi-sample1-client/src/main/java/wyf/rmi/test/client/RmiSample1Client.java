package wyf.rmi.test.client;

import wyf.rmi.test.serivce.RmiSample1Service;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by É÷ÐÞ on 16/1/1.
 */
public class RmiSample1Client {
    public static void main(String[] args) {
        String rmiAddr="rmi://localhost:8000/RmiSample1Service";
        try {
            RmiSample1Service rmiService = (RmiSample1Service) Naming.lookup(rmiAddr);
            rmiService.hello("hi,ËÕ·ÆÂêË÷");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
