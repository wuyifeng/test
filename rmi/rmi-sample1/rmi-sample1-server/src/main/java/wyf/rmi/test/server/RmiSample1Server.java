package wyf.rmi.test.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import wyf.rmi.test.serivce.RmiSample1Service;
import wyf.rmi.test.serivce.impl.RmiSample1ServiceImpl;

/**
 * Created by ���� on 16/1/1.
 */
public class RmiSample1Server {

    public static void main(String[] args) {
        try {
            //����һ��Զ�̶���
            RmiSample1Service rmiService = new RmiSample1ServiceImpl();
            /**
             * ���������ϵ�Զ�̶���ע���Registry��ʵ������ָ���˿�Ϊ8888����һ���ز����٣�JavaĬ�϶˿���1099)
             * �ز���ȱ��һ����ȱ��ע����������޷��󶨶���Զ��ע�����
             */
            LocateRegistry.createRegistry(8000);
            Naming.bind("rmi://localhost:8000/RmiSample1Service", rmiService);
            System.out.println("***********************");
            System.out.println("����󶨳ɹ�");
            System.out.println("***********************");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
