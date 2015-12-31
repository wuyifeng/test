package wyf.rmi.test.serivce.impl;

import wyf.rmi.test.serivce.RmiSample1Service;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by É÷ÐÞ on 16/1/1.
 */
public class RmiSample1ServiceImpl extends UnicastRemoteObject implements RmiSample1Service {

    public RmiSample1ServiceImpl() throws RemoteException {

    }

    public Map<String,String> hello(String say){
        System.out.println(say);
        Map<String,String> map=new HashMap<String,String>();
        map.put("name","ËÕ·ÆÂêË÷");
        map.put("say","hello boy!");
        return map;
    }
}
