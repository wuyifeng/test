package wyf.rmi.test.serivce;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

/**
 * Created by É÷ÐÞ on 15/12/31.
 */
public interface RmiSample1Service extends Remote{
    public Map<String,String> hello(String word) throws RemoteException;
}
