/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4O; 
import Business.ConfigureASystem;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
import java.sql.Connection;




/**
 *
 * @author Sanskruti
 */
public class DB4O {
    private final static String fileName=Paths.get("DataBank.db4o").toAbsolutePath().toString();
    public static DB4O db4o;
    public static synchronized DB4O getInstance()
    {
        if(db4o==null)
            db4o=new DB4O();
         return db4o;
    }
    
    protected synchronized static void shutdown(ObjectContainer cointainer) {
        if (cointainer != null) {
            cointainer.close();
        }
    }
    private ObjectContainer CreateConnection()
    {
        try
        {
            EmbeddedConfiguration config =Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            config.common().activationDepth(Integer.MAX_VALUE);
            config.common().updateDepth(Integer.MAX_VALUE);
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);
            ObjectContainer db = Db4oEmbedded.openFile(config, fileName);
            return db;
        }
        catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
        return null;
    }
    public synchronized void storeSystem(EcoSystem ecosystem)
    {
        ObjectContainer cointainer = CreateConnection();
        cointainer.store(ecosystem);
        cointainer.commit();
        cointainer.close();
    }
    public EcoSystem retriveSystem()
    {
         ObjectContainer cointainer = CreateConnection();
         ObjectSet<EcoSystem> systems =cointainer.query(EcoSystem.class);
         EcoSystem system;
         if (systems.size() == 0){
             system = ConfigureASystem.configure();
        }
        else{
            system = systems.get(systems.size() - 1);
        }
         cointainer.close();
         return system;
    }
}
